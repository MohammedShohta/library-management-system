package org.example;
public class Main {
    public static void main(String[] args) {
        Liberary liberary = new Liberary();
        Member member = new Member();
        Book  book1 = new Book("java", "Mohammed");
        liberary.addBook(book1);
        member.canBorrowBook(liberary,"java");
        member.canBorrowBook(liberary,"java");
        member.returnBook(liberary,"java");
        member.returnBook(liberary,"java");
        liberary.findAllBooksV2();
        member.canBorrowBook(liberary,"java");
        liberary.findAllBooksV2();


    }
    }

