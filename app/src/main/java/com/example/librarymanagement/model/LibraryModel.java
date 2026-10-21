package com.example.librarymanagement.model;

public class LibraryModel {
    private String name;
    private int studentNum;
    private int contactNum;
    private String selectedBooks;
    private int borrowingDate;
    private int returnDate;

    public LibraryModel(String name, int studentNum, int contactNum, String selectedBooks, int borrowingDate, int returnDate) {
        this.name = name;
        this.studentNum = studentNum;
        this.contactNum = contactNum;
        this.selectedBooks = selectedBooks;
        this.borrowingDate = borrowingDate;
        this.returnDate = returnDate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
        }
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getContactNum() {
        return contactNum;
    }
    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    public String getSelectedBooks() {
        return selectedBooks;
    }
    public void setSelectedBooks() {
        this.selectedBooks = selectedBooks;
    }
    public int getBorrowingDate() {
        return borrowingDate;
        }
    public void setBorrowingDate(int borrowingDate) {
        this.borrowingDate = borrowingDate;
    }
    public int getReturnDate() {
        return returnDate;
        }
    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }
}
