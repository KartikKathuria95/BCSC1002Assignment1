/*  Created by IntelliJ IDEA.
 *  User: Kartik Kathuria
 *  Date: 22/08/20
 *  Time: 3:50 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String thirteenDigitIsbnNumber;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getThirteenDigitIsbnNumber() {
        return thirteenDigitIsbnNumber;
    }

    public void setThirteenDigitIsbnNumber(String thirteenDigitIsbnNumber) {
        this.thirteenDigitIsbnNumber = thirteenDigitIsbnNumber;
    }
}

