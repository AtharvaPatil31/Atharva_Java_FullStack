package com.atharva.dao;

import com.atharva.Pojo.Buch;

public class TestBook {

    public static void main(String[] args) {

        BookDao dao = new BookDaoImpl();

       
        dao.save(new Buch(11, "The Alchemist", "Paulo Coelho", 250));
        dao.save(new Buch(12, "Metamorphosis", "Frank Kafka", 210));
        dao.save(new Buch(13, "C Programming", "Zubair Shaikh", 150));

        
        System.out.println("----- All Books -----");
        for (Buch b : dao.list()) {
            System.out.println(b);
        }

        
        System.out.println("\n----- Find Book -----");
        dao.find(101).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Book not found")
        );

       
        System.out.println("\n----- Books Between 300 and 600 -----");
        for (Buch b : dao.findByPrice(300, 600)) {
            System.out.println(b);
        }


        System.out.println("\n----- Delete Book -----");
        if (dao.delete(101)) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
        System.out.println("\n----- Books Ordered by Title -----");
        dao.listOrderByTitle().forEach(System.out::println);
    }
}