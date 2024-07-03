package library;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class bookfn {

    Connectiontodb con = new Connectiontodb();
    Connection con_obj = con.Establishcon();
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet res = null;
    ArrayList<Book> book = new ArrayList<>();
    ArrayList<user> User = new ArrayList<>();
    ArrayList<Request> rList = new ArrayList<>();
    ArrayList<UserReturnBook> urbList = new ArrayList<>();

   //Add book function 
    public boolean addBook(String Btitle, String BISBN, String Bauthor, String bgenre, String btype, String bdomain) {
        boolean b = false;
        String addstring = "insert into tbl_book(Title,ISBN,Author,genre,Type,Domain)values('" + Btitle + "','" + BISBN + "','" + Bauthor + "','" + bgenre + "','" + btype + "','" + bdomain + "')";
        try {
            stmt = con_obj.createStatement();

            int res = stmt.executeUpdate(addstring);
            if (res > 0) {
                //JOptionPane.showMessageDialog(null, "inserted");
                b = true;
            } else {
                //JOptionPane.showMessageDialog(null, "error");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return b;

    }
//function that approves req that is recieved from the user for issuing book 
    public boolean approveRequest(String ID) {
        boolean b = false;
        try {
            String str = "SELECT * FROM tbl_requests WHERE ID='" + ID + "'";
            pstmt = con_obj.prepareStatement(str);
            res = pstmt.executeQuery();
            while (res.next()) {
                Book bobj = new Book();
                user u = new user();
                Request r = new Request();
                u.setName(res.getString("Name"));
                u.setAddress(res.getString("Address"));
                u.setEmail(res.getString("Email"));
                u.setPhoneno(res.getString("Phone_No"));
                bobj.setTitle(res.getString("Title"));
                System.out.println(bobj.getTitle());
                bobj.setIsbn(res.getString("ISBN"));
                System.out.println(bobj.getIsbn());
                r.setIssueDate(res.getString("IssueDate"));
                r.setDueDate(res.getString("DueDate"));
                String s = "INSERT into tbl_issuedbooks(Title,ISBN,IssueDate,DueDate,Name,Address,Phone_No,Email)values('" + bobj.getTitle() + "','" + bobj.getIsbn() + "','" + r.getIssueDate() + "','" + r.getDueDate() + "','" + u.getName() + "','" + u.getAddress() + "','" + u.getPhoneno() + "','" + u.getEmail() + "')";

                stmt = con_obj.createStatement();
                int res = stmt.executeUpdate(s);
                if (res > 0) {
                    b = true;
                    String del = "delete from tbl_requests where ID = '" + ID + "'";
                    stmt = con_obj.createStatement();
                    int rs = stmt.executeUpdate(del);

                    b = rs > 0;

                } else {
                    b = false;
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return b;
    }
// this function display return book request coming from the user which will be later verified by librarian
    public ArrayList<UserReturnBook> displayReturnRequests() {
        String str = "SELECT * FROM tbl_return";
        UserReturnBook urb = new UserReturnBook();
        Book b = new Book();
        try {
            pstmt = con_obj.prepareStatement(str);
            res = pstmt.executeQuery();
            while (res.next()) {
                b.setTitle(res.getString("Title"));
                b.setIsbn(res.getString("ISBN"));
                urb.setId(res.getString("ID"));
                urb.setIssueDate(res.getString("IssueDate"));
                urb.setReturnDate(res.getString("ReturnDate"));
                Book bk = new Book(b.getTitle(), b.getIsbn());
                UserReturnBook urbobj = new UserReturnBook(bk, urb.getId(), urb.getReturnDate(), urb.getIssueDate());
                urbList.add(urbobj);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return urbList;
    }
//this function is for librarian that can see which book is requested by user
    public ArrayList<Request> showRequests() {
        String str = "SELECT * FROM tbl_requests";
        try {
            pstmt = con_obj.prepareStatement(str);
            res = pstmt.executeQuery();
            while (res.next()) {
                user uobj = new user();
                Book bobj = new Book();
                Request robj = new Request();
                uobj.setName(res.getString("Name"));
                uobj.setAddress(res.getString("Address"));
                uobj.setPhoneno(res.getString("Phone_No"));
                uobj.setEmail(res.getString("Email"));
                user u = new user(uobj.getName(), uobj.getAddress(), uobj.getPhoneno(), uobj.getEmail());
                bobj.setTitle(res.getString("Title"));
                bobj.setIsbn(res.getString("ISBN"));
                Book b = new Book(bobj.getTitle(), bobj.getIsbn());
                robj.setIssueDate(res.getString("IssueDate"));
                robj.setDueDate(res.getString("DueDate"));
                robj.setID(res.getString("ID"));
                Request r = new Request(u, b, robj.getID(), robj.getDueDate(), robj.getIssueDate());
                rList.add(r);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rList;
    }
    
    //this function is for deleting book by librarian
    public boolean deletebook(int isbn) {
        boolean b = false;
        String deletestring = "delete from tbl_book where ISBN='" + isbn + "'";
        try {
            stmt = con_obj.createStatement();

            int res = stmt.executeUpdate(deletestring);
            if (res > 0) {
                b = true;
            } else {
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return b;
    }
    // this function display librarian all user
    public ArrayList<user> displayuser() {
        boolean b = false;
        String str = "SELECT * FROM tbl_login WHERE Role='USER'";
        try {
            pstmt = con_obj.prepareStatement(str);
            res = pstmt.executeQuery();
            while (res.next()) {
                user us = new user();
                us.setName(res.getString("Name"));
                us.setAddress(res.getString("Address"));
                us.setPhoneno(res.getString("Phone_no"));
                us.setEmail(res.getString("Email"));

                user usobj = new user(us.getName(), us.getAddress(), us.getPhoneno(), us.getEmail());
                User.add(usobj);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return User;
    }
    // this function is for librarian he verifies the book return by the user is true he approves it
    public boolean approveReturnedBook(String ISBN) {
        boolean b = false;
        try {
            String deletestring = "delete from tbl_return where ISBN='" + ISBN + "'";
            stmt = con_obj.createStatement();
            int rs = stmt.executeUpdate(deletestring);
            String sql = "delete from tbl_issuedbooks where ISBN='" + ISBN + "'";
            int r = stmt.executeUpdate(sql);
            b = r > 0 && rs > 0;
            System.out.println(rs+r);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return b;
    }
    //this function is for librarian he verifies the book return by the user then dlt it from the return table
       public boolean verifyReturnedBook(String ISBN) {
        String str = "delete from tbl_return where ISBN = '" + ISBN + "'";
        boolean b = false;
        try {
            stmt = con_obj.createStatement();
            int rs = stmt.executeUpdate(str);
            if (rs > 0) {

                b = true;
             String sql = "delete from tbl_issuedbooks where ISBN='" + ISBN + "'";
             int r=stmt.executeUpdate(sql);
             if (r>0)
             {
                 b=true;
             }
             else {
                 b=false;
             }
            } else {

                b = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return b;
    }
    
  //user function--->  
// this function is of user in user pannel when they want to issue a book they have to request it
    public boolean requestBook(user u, String title, String isbn, String issueDate, String dueDate) {
        boolean b = false;
        String str = "insert into tbl_requests(Name,Address,Phone_No,Email,Title,ISBN,IssueDate,DueDate)values('" + u.getName() + "','" + u.getAddress() + "','" + u.getPhoneno() + "','" + u.getEmail() + "', '" + title + "','" + isbn + "','" + issueDate + "','" + dueDate + "')";
        try {
            stmt = con_obj.createStatement();

            int res = stmt.executeUpdate(str);
            if (res > 0) {
                b = true;
            } else {
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return b;
    }

// this function display user all books
    public ArrayList<Book> displayBook() {
        boolean b = false;
        String str = "SELECT * FROM tbl_book";
        try {
            pstmt = con_obj.prepareStatement(str);
            res = pstmt.executeQuery();
            while (res.next()) {
                Book bk = new Book();
                bk.setTitle(res.getString("Title"));
                bk.setIsbn(res.getString("ISBN"));
                bk.setAuthor(res.getString("Author"));
                bk.setGenre(res.getString("genre"));
                bk.setType(res.getString("Type"));
                bk.setDomain(res.getString("Domain"));
                Book bkobj = new Book(bk.getTitle(), bk.getAuthor(), bk.getIsbn(), bk.getGenre(), bk.getType(), bk.getDomain());
                book.add(bkobj);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return book;
    }


// this function is by user to return book
    public boolean returnBook(String title, String ISBN, String issueDate, String returnDate) {
        boolean b = false;

        String sql = "insert into tbl_return(Title,ISBN,IssueDate,ReturnDate)values('" + title + "','" + ISBN + "','" + issueDate + "','" + returnDate + "')";
        try {
            stmt = con_obj.createStatement();

            int res = stmt.executeUpdate(sql);
            if (res > 0) {
                b = true;
            } else {
                b = false;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return b;
    }
//    //this method is for user class display  
//    String name, add, pn, em;
//
//    public boolean userdisplay(String uname) {
//        String str = "select * from tbl_login where UserName='" + uname + "' ";
//        boolean b = false;
//        try {
//            pstmt = con_obj.prepareStatement(str);
//            res = pstmt.executeQuery();   
//            while (res.next()) {
//                name = res.getString("Name");
//                add = res.getString("Address");
//                pn = res.getString("Phone_No");
//                em = res.getString("Email");
//                b = true;
//
//                //System.out.println(name + "," + add+ ","+pn+ ","+ em);
//            }
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        return b;
//    }
}
