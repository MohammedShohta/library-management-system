package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Liberary   {
    //aggregation relationship
    private ArrayList<Book> list = new ArrayList<>();
    private Member member;
    //completed done
    public void addBook(Book books) {
        list.add(books);
        System.out.println("your book is added");
    }

    /**
     *
     * use function with lambda expression
     */
    @Deprecated
    public void borrowBook(String titel) throws InvalidBook {
        for (Book b : list) {
            if(b!=null && b.getTitle().equals(titel))
            {
                if(b.getStatus()==BookStatus.BORROWED)
                {
                    throw new InvalidBook("Book was Borrowed");
                }
                    System.out.println("you can borrow book");
                    b.markBorrowed();
                    return;
            }
        }
        throw new InvalidBook("Book Not Available ");
    }
    //by using lambda ->
    public void borrowBookV2(String titel)throws InvalidBook
    {
       for(Book book :list)
       {
           if(book!=null &&book.getTitle().equals(titel))
           {
           switch (book.getStatus())
           {
               case BORROWED -> throw new InvalidBook("this book is borrowed ");
               case AVAILABLE -> {
                   System.out.println("you can borrow this book");
                   book.markBorrowed();
                   return;

               }
           }
           }

       }
       throw new InvalidBook("this book is not available");
    }
    public void returnedBook(String title) throws InvalidBook {
        for (Book b : list) {
            if (b.getTitle().equals(title)) {
                if (b.getStatus() == BookStatus.AVAILABLE) {
                    throw new InvalidBook("This book is already in the library and was not borrowed");
                }
                if (b.getStatus() == BookStatus.BORROWED) {
                    b.markAsReturned();
                    System.out.println("Book returned successfully, thank you.");
                    return;
                }
            }
        }
        throw new InvalidBook("This book does not belong to this library");
    }

    @Deprecated
    public void removeBook(String title) {
        /*
       for(Book book:list)
       {
           if(book.getTitle().equals(title))
           {
               for(Book book :list)
               {
                books[j]=books[j+1];
               }
               books[count-1]=null;
               count--;
               System.out.println("removing is done.....");
           }
       }
       }

}*/
    }

    public void removeBookV2(String titel) {
        Iterator<Book> it = list.iterator();
        try {
            while (it.hasNext()) {
                Book book = it.next();
                if (book.getTitle().equals(titel)) {
                    it.remove();
                    System.out.println("Removing is done...");
                    return;
                }
            }
            throw new LiberayNotFoundBook("Book not found");
        } catch (LiberayNotFoundBook e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @deprecated Use findAllBooksV2() instead.
     */
    @Deprecated
    public void findAllBooks() {
        for (Book book : list) {
            System.out.println(
                    "book title: " + book.getTitle() +
                            " | Author name: " + book.getAuthor() +
                            " | book status: " + book.getStatus()
            );
        }
    }

    public void findAllBooksV2() {
        Iterator<Book> it = list.iterator();
        while (it.hasNext()) {
            //if you call next() more time you git exception call NosuchElementException
            //because when use next more than one time it move coursor more and hasNext() show one collection only
            Book book = it.next();
            System.out.println(
                    "book title: " + book.getTitle() +
                            " | Author name: " + book.getAuthor() +
                            " | book status: " + book.getStatus()+
                            " | book id :"+book.getId()
            );
        }
    }

    //custom comparator because i need liberary sorte the book
    public void sortById()
    {
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.id-o2.id;
            }
        });
    }

    /*
    **use sortById method because i built it by ananymouse class
     */
    @Deprecated
    public void sortbyAnotherClass()
    {
        Collections.sort(list,new SortBook());
    }



}





