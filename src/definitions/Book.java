/*  Created by IntelliJ IDEA.
 *  User: Kartik Kathuria
 *  Date: 22/08/20
 *  Time: 3:51 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String thirteenDigitIsbnNumber;

    public Book() {

    }

    public Book(String bookName) {
        this.bookName = "Object Oriented Programming";
        authorName = "Herbert Schildt";
        thirteenDigitIsbnNumber = "9458665450580";
    }

    public Book(String bookName, String authorName, String thirteenDigitIsbnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.thirteenDigitIsbnNumber = thirteenDigitIsbnNumber;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(thirteenDigitIsbnNumber, book.thirteenDigitIsbnNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getThirteenDigitIsbnNumber());
    }

    public String toString() {
        return "Book{" +
                "bookName='" + getBookName() + '\'' +
                ", authorName='" + getAuthorName() + '\'' +
                ", thirteenDigitIsbnNumber='" + getThirteenDigitIsbnNumber() + '\'' +
                '}';
    }
}