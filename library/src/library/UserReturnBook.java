package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserReturnBook {

    private Book b;
    private String id, returnDate, issueDate;
    private user u;
    Connectiontodb con = new Connectiontodb();
    Connection con_obj = con.Establishcon();
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet res = null;

    public UserReturnBook(Book b, String id, String returnDate, String issueDate) {
        this.b = b;
        this.id = id;
        this.returnDate = returnDate;
        this.issueDate = issueDate;
    }

    public UserReturnBook(Book b, String id, String issueDate, user u) {
        this.b = b;
        this.id = id;
        this.issueDate = issueDate;
        this.u = u;
    }

    public ArrayList<UserReturnBook> getUserIssuedBooks() {
        b = new Book();
        ArrayList<UserReturnBook> uibList = new ArrayList<>();
                String str = "Select * from tbl_issuedbooks where Name='" + u.getName() + "' AND Address='" + u.getAddress() + "' AND Phone_No='" + u.getPhoneno() + "'AND Email='" + u.getEmail() + "'";
        try {
            pstmt = con_obj.prepareStatement(str);
            res = pstmt.executeQuery();
            while (res.next()) {
                b.setTitle(res.getString("Title"));
                b.setIsbn(res.getString("ISBN"));
                setIssueDate(res.getString("IssueDate"));
                Book bk = new Book(b.getTitle(), b.getIsbn());
                u = new user(u.getName(), u.getAddress(), u.getPhoneno(), u.getEmail());
                UserReturnBook urbobj = new UserReturnBook(bk,id, issueDate, u);
                uibList.add(urbobj);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return uibList;
    }

    public UserReturnBook() {
    }

    public user getU() {
        return u;
    }

    public void setU(user u) {
        this.u = u;
    }

    public Book getB() {
        return b;
    }

    public void setB(Book b) {
        this.b = b;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
