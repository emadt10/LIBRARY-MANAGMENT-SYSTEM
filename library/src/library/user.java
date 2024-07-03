
package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class user {
    private String id,uname,upass,name,address,phoneno,email,role;
    Book b;
    Connectiontodb con = new Connectiontodb();
    Connection con_obj = con.Establishcon();
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet res = null;
    public user(String id, String uname, String upass, String name, String address, String phoneno, String email, String role) {
        this.id = id;
        this.uname = uname;
        this.upass = upass;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.email = email;
        this.role = role;
    }
    

    public user(String name, String address, String phoneno, String email) {
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.email = email;
    }

    public void setUserDetails(String uname, String name, String address, String phoneNo, String Email)
    {
        setUname(uname);
        setEmail(Email);
        setAddress(address);
        setName(name);
        setPhoneno(phoneNo);
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public user(){
        
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

   
}
