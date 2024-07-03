
package library;

import javax.swing.JOptionPane;
import java.sql.*;


public class uLogin {


    Connectiontodb con=new Connectiontodb();
    Connection con_obj=con.Establishcon();
    Statement stmt=null;
    PreparedStatement pstmt=null;
    ResultSet res=null;
    private String role;
    private user u=new user();
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public user getUser() {
        return u;
    }

    public void setUser(user u) {
        this.u = u;
    }
    
    //this function is for loging in user 
    public boolean Loginuser(String uname,String upass)
    {
        String loginstring="select* from tbl_login where UserName='"+uname+"'and Userpass='"+upass+"'";
        boolean b;
        try
        {
           pstmt= con_obj.prepareStatement(loginstring);
           res=pstmt.executeQuery();
           if(res.next())
           {    
               u.setUserDetails(res.getString("UserName"),res.getString("Name"), res.getString("Address"), res.getString("Phone_no"), res.getString("Email"));
               role=res.getString("ROLE");
               b=true;
               
           }
           else
           {
               b=false;
           }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
            b=false;
        }
        return b;
    }
    //sign up
    public boolean adduser(String uname,String upass,String name,String address,String phone,String email,String role){
        boolean b=false;
        String addstring="insert into tbl_login(UserName,UserPass,Name,Address,Phone_no,Email,Role)values('"+uname+"','"+upass+"','"+name+"','"+address+"','"+phone+"','"+email+"','"+role+"')";
        try
        {
            stmt=con_obj.createStatement();
            
            int res=stmt.executeUpdate(addstring);
            if(res>0)
            {
                //JOptionPane.showMessageDialog(null, "inserted");
                b=true;
            }
            else{
                //JOptionPane.showMessageDialog(null, "error");
            b=false;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        return b;
    }
    //Deleteing user record function
    public boolean deleteuser(int id){
        boolean b=false;
        String deletestring="delete from tbl_login where ID='"+id+"'";
        try
        {
            stmt=con_obj.createStatement();
            
            int res=stmt.executeUpdate(deletestring);
            if(res>0)
            {
                b=true;
            }
            else{
            b=false;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        return b;
    }
    //update user information
    
        public boolean updateuser(String username, String password){
         boolean b = false;
          try{       
         
         String updatestring = "update tbl_login SET UserPass= '"+password+"' WHERE Username='"+username+"'";
         stmt = con_obj.createStatement();
         
        int ress = stmt.executeUpdate(updatestring);
        if(ress>0){
               b=true;

           }
           else
        {
               b=false;
           }
 
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
      } 
       return b;   
        }
}



