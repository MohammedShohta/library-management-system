package org.example;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Liberary liberary = new Liberary();
        Member member=new Member();
        Admin admin=new Admin();
        Book  book1 = new Book(10,"java", "Mohammed");
        liberary.addBook(book1);
        admin.addBook(liberary,new Book(105,"php","Ahmed"));
        admin.addBook(liberary,new Book(10101,"html","adel"));
        admin.addBook(liberary,new Book(100,"c++","hossam"));
        member.canBorrowBook(liberary,"c++");
        admin.addBook(liberary,new Book(101,"B","hamed"));
        member.canBorrowBook(liberary,"B");
        admin.addBook(liberary,new Book(111,"A","sameh"));
        admin.viewBook(liberary);
        member.viewBook(liberary);
        member.canBorrowBook(liberary,"html");
        member.returnBook(liberary,"plhp");
    }
    }

