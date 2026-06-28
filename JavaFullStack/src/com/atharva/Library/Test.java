package com.atharva.Library;

public class Test {

    public static void main(String[] args) {

        Book b1 = new Book("The Maze Runner");
        Book b2 = new Book("Wings of Fire");

        Member m1 = new Member("Atharva");
        Member m2 = new Member("Asmita");

        m1.issueBook(b1);
        m1.issueBook(b2);

        m2.issueBook(b1);

        m1.returnBook();

        m2.issueBook(b1);

        m1.status();
        m2.status();

        b1.status();
        b2.status();
    }
}