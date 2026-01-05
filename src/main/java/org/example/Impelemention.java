package org.example;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

public class Impelemention {
    public static void impelemention() throws InvalidBook, ExecutionException, InterruptedException, InvocationTargetException, IllegalAccessException {
        LibraryReflaction reflaction=new LibraryReflaction();

        NotificationService notificationService = new NotificationService();
        Liberary liberary = new Liberary(notificationService);
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
//        admin.viewBook(liberary);
//        member.viewBook(liberary);
//        member.canBorrowBook(liberary,"php");
//        member.returnBook(liberary,"php");
        notificationService.shutdown();



        reflaction.getBorrowMethod(liberary,"php");
    }
}
