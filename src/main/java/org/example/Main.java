package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Liberary liberary = new Liberary();
        Member member = new Member();
        Book  book1 = new Book(10,"java", "Mohammed");
        liberary.addBook(book1);
        liberary.addBook(new Book(105,"php","Ahmed"));
        liberary.addBook(new Book(10101,"html","adel"));
        liberary.addBook(new Book(100,"c++","hossam"));
//        member.canBorrowBook(liberary,"c++");
        liberary.addBook(new Book(101,"B","hamed"));
        liberary.addBook(new Book(111,"A","sameh"));
        liberary.availableBook();
//        liberary.findAllBooksV2();
    }
    }

