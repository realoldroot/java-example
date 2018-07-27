package com.zgs.java.observer;

import java.util.ArrayList;
import java.util.List;

public class Library extends Observable{

    // 使用list用于存放图书
    List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();

        Book book1 = new Book("张三", "深入理解java");

        Book book2 = new Book("李四", "一起学习观察者模式");

        this.bookList.add(book1);
        this.bookList.add(book2);
    }

    public void addBook(Book book) {
        this.bookList.add(book);
        super.notifyObservers(book);
    }

    public void delBook(Book book) {
        this.bookList.remove(book);
    }
}
