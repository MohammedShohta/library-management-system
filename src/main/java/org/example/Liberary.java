package org.example;
import java.util.*;
import java.util.stream.Stream;

public class Liberary   {

     private   NotificationService notificationService;
    //aggregation relationship
    private List<Book> list=new ArrayList<>();
     private Admin admin;

     public Liberary(NotificationService notificationService)
     {
         this.notificationService=notificationService;
     }
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
    @Deprecated
    /*
    * use stream method
    *
    * */
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
    public void borrowBookV3(String title)throws InvalidBook
    {
        Book book =list.stream()
                .filter(b->b.getTitle().equals(title))
                .findFirst()
                .orElseThrow(()->new InvalidBook("Book Not Available"));

        if(book.getStatus()==BookStatus.BORROWED)
        {
            throw new InvalidBook("book was borrowed");
        }

        book.markBorrowed();
        notificationService.sendNotifcation("Book Borrowed successfully");

//        System.out.println("you can borrow book"+" "+book.getTitle());


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
    public void returnedBookV2(String title) throws InvalidBook {
        Book book=list.stream()
                .filter(b->b.getTitle().equals(title))
                .findFirst()
                .orElseThrow(()->new InvalidBook("this book is not found in liberary"));
        if (book.getStatus() == BookStatus.AVAILABLE) {
            throw new InvalidBook("This book is already available and not borrowed");
        }

            book.markAsReturned();
          notificationService.sendNotifcation("Book return successfully");


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
    /*
    * use stream method
    *
    * */
    @Deprecated
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
    /*
    * use stream method
    *
    * */
@Deprecated
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

    //by using stream
    //will view all book
    public void findAllBooksV3() {
    list.stream().
            filter(book->book.getStatus()==BookStatus.AVAILABLE
            ||book.getStatus()==BookStatus.BORROWED)
            .forEach(book-> System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getStatus()));
    }
    //all available books
    public void findAllBooksForMemberUser()
    {
                list.stream().
                filter(book->book.getStatus()==BookStatus.AVAILABLE)
                .forEach(book-> System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getStatus()));
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

    public void availableBook()
    {
        System.out.println("available book");
              list.stream()
                      .filter(book->book.getStatus()==BookStatus.AVAILABLE)
                      //book --->String
                      //i need return book after map
//                      .map(book->book.getTitle().toUpperCase())
                      .map(book->{
                          //the title become uppercase
                          book.setTitle(book.getTitle().toUpperCase());
                          return book;
                      })
                      .sorted(Comparator.comparing(Book::getTitle))
                      .forEach(book-> System.out.println(book.getTitle()));
    }





}





