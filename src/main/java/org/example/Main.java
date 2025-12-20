package org.example;
public class Main {
    public static void main(String[] args) {
        Liberary liberary = new Liberary();
        Book  book1 = new Book("html", "Mohammed");
        Member member = new Member("mk2047", "Ahmed");
        liberary.addBook(book1);
        member.canBorrowBook(liberary,"html");
        member.returnBook(liberary,book1,"html");
        liberary.findAllBooks();
    }
    }

