/*  Created by IntelliJ IDEA.
 *  User: Kartik Kathuria
 *  Date: 22/08/20
 *  Time: 3:50 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String[] nameOfStudentFormatFirstMiddleLast;
    private long universityRollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] allNamesOfBooksIssuedByStudent;

    public Student(String nameOfStudent, long universityRollNumber, int numberOfBooksIssued) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfStudent.split(" ");
        this.universityRollNumberOfStudent = universityRollNumber;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssued;
        this.allNamesOfBooksIssuedByStudent = new Book[numberOfBooksIssued];
    }

    public String[] getNameOfStudentFormatFirstMiddleLast() {
        return nameOfStudentFormatFirstMiddleLast;
    }

    public void setNameOfStudentFormatFirstMiddleLast(String[] nameOfStudentFormatFirstMiddleLast) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfStudentFormatFirstMiddleLast;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumberOfStudent == student.universityRollNumberOfStudent &&
                numberOfBooksIssuedByStudent == student.numberOfBooksIssuedByStudent &&
                Arrays.equals(nameOfStudentFormatFirstMiddleLast, student.nameOfStudentFormatFirstMiddleLast) &&
                Arrays.equals(AllNamesOfBooksIssuedByStudent, student.AllNamesOfBooksIssuedByStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(universityRollNumberOfStudent, numberOfBooksIssuedByStudent);
        result = 31 * result + Arrays.hashCode(nameOfStudentFormatFirstMiddleLast);
        result = 31 * result + Arrays.hashCode(AllNamesOfBooksIssuedByStudent);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudentFormatFirstMiddleLast=" + Arrays.toString(nameOfStudentFormatFirstMiddleLast) +
                ", universityRollNumberOfStudent=" + universityRollNumberOfStudent +
                ", numberOfBooksIssuedByStudent=" + numberOfBooksIssuedByStudent +
                ", AllNamesOfBooksIssuedByStudent=" + Arrays.toString(AllNamesOfBooksIssuedByStudent) +
                '}';
    }
}