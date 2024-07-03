package library;

public class Request {
private user u;
private Book b;
private String dueDate, issueDate, ID;

    public Request(user u, Book b, String ID, String dueDate, String issueDate) {
        this.ID=ID;
        this.u = u;
        this.b = b;
        this.dueDate = dueDate;
        this.issueDate = issueDate;
    }

    public Request() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Request{" + "u=" + u + ", b=" + b + ", dueDate=" + dueDate + ", issueDate=" + issueDate + '}';
    }
    
}
