package Task11;

public class Book {

  String bookName;

  String auther;

  int referenceNumber;

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public void setAuther(String auther) {
    this.auther = auther;
  }

  public void setReferenceNumber(int referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public String getBookName() {
    return bookName;
  }

  public String getAuther() {
    return auther;
  }

  public int getReferenceNumber() {
    return referenceNumber;
  }

  public Book(String bookName, String auther, int referenceNumber) {
    this.bookName = bookName;
    this.auther = auther;
    this.referenceNumber = referenceNumber;
  }
}
