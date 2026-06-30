package com.atharva.dao;

import com.atharva.Pojo.Buch;
import com.atharva.service.BookNotFoundException;
import com.atharva.service.BookService;
import com.atharva.service.bookserviceimpl;

public class Test {

    public static void main(String[] args) {

        BookDao dao = new BuchDaoCollectionImpl();
        BookService service = new bookserviceimpl(dao);

        service.save(new Buch(100, "Wings of Fire", "APJ Kalam", 400));
        service.save(new Buch(101, "Head First Python", "Atharva", 700));
        service.save(new Buch(102, "C Programming", "Manaswin", 800));

        System.out.println("------ All Books ------");

        service.list().forEach(System.out::println);

        try {

            System.out.println("\n------ Book Found ------");
            System.out.println(service.find(101));

            System.out.println("\nDeleting Book 101...");
            service.delete(101);

        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n------ Books After Delete ------");

        service.list().forEach(System.out::println);

        System.out.println("\n------ Books Sorted By Title ------");

        service.listOrderByTitle().forEach(System.out::println);

        System.out.println("\n------ Books Between Price 300 and 800 ------");

        service.findByPrice(300, 800).forEach(System.out::println);
    }
}