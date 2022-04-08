package com.test;


import com.beans.Book;
import com.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BookDao bookDao = (BookDao) context.getBean("bdao");
         Book b = new Book();
        // b.setBid(1);;
         b.setBookName("lect us C");
         b.setAuthorName("yaswant");
         b.setPrice(100);

        bookDao.insertBook(b);

        System.out.println("done");
        bookDao.update("let us C", 200);
       // bookDao.delete("lect us C");
        List<Book> list = bookDao.fetchAllBooks();
        for (Book e :list
             ) {
            System.out.println(e);
        }

        System.out.println("========================author like l%========================");
        List<Book> l1 = bookDao.likeAuthor();
        for (Book e :l1
        ) {
            System.out.println(e);
        }
        System.out.println("============================ beetween 100 and 200===========================");
        List<Book> l2 =bookDao.betweenPrice();
        for (Book e :l2
        ) {
            System.out.println(e);
        }
    }
}
