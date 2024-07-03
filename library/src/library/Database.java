
package library;
import java.util.*;

public class Database {
    user obj;
    ArrayList<Book>db;

    public void assignBook(Book b){
        db.add(b);
    }

    public void displayBook(){
        System.out.println("------Book Details------");
        for(int i=0;i<db.size();i++){
            System.out.println(db.get(i));
        }
    }
}
