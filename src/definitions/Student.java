/*  Created by IntelliJ IDEA.
 *  User: Kartik Kathuria
 *  Date: 22/08/20
 *  Time: 3:50 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long universityRollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] AllNamesOfBooksIssuedByStudent;

    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    public void setFirstNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
    }

    public String getMiddleNameOfStudent() {
        return middleNameOfStudent;
    }

    public void setMiddleNameOfStudent(String middleNameOfStudent) {
        this.middleNameOfStudent = middleNameOfStudent;
    }

    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    public void setLastNameOfStudent(String lastNameOfStudent) {
        this.lastNameOfStudent = lastNameOfStudent;
    }

    public long getUniversityRollNumberOfStudent() {
        return universityRollNumberOfStudent;
    }

    public void setUniversityRollNumberOfStudent(long universityRollNumberOfStudent) {
        this.universityRollNumberOfStudent = universityRollNumberOfStudent;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getAllNamesOfBooksIssuedByStudent() {
        return AllNamesOfBooksIssuedByStudent;
    }

    public void setAllNamesOfBooksIssuedByStudent(Book[] allNamesOfBooksIssuedByStudent) {
        AllNamesOfBooksIssuedByStudent = allNamesOfBooksIssuedByStudent;
    }
}
