package org.example;

public class Main {
    public static void main(String[] args) {
        Liberary liberary = new Liberary();
        Member member = new Member();
        Book  book1 = new Book(101,"java", "Mohammed");
        liberary.addBook(book1);
        liberary.addBook(new Book(1001,"php","Ahmed"));
        liberary.addBook(new Book(1011,"html","adel"));
        liberary.addBook(new Book(1011,"c++","hossam"));
        liberary.addBook(new Book(1015,"B","hamed"));
        liberary.addBook(new Book(1011,"A","sameh"));
        liberary.sortById();
        liberary.findAllBooksV2();
    }
    }

