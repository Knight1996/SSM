package com.knight.entity;

public class Book {

    private long bookId;//图书ID

    private String name;//图书名称

    private int number;//馆藏数量

    //构造方法：
    public Book() {

    }

    public Book(long bookId, String name, int number) {
        this.bookId = bookId;
        this.name = name;
        this.number = number;
    }

    public long getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
         return "Book [bookId=" + bookId + ", name=" + name + ", number=" + number + "]";
    }
}
