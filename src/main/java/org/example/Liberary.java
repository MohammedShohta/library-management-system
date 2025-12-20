package org.example;
public class Liberary {

    //aggregation relationship 
    private Book []books=new Book[5];
    private Member member;
    private int count=0;
    public void addBook(Book book)
    {
        this.books[count]=book;
        count++;
        System.out.println("your book is added");
    }

    public Book borrowBook(String titel)throws LiberayNotFoundBook
    {
        for(Book b:books)
        {
            if(b!=null && b.getTitle().equals(titel))
            {
                if(b.getStatus()!=BookStatus.BORROWED)
                {
                    b.markBorrowed();
                    return b;
                }

            }
        }
        throw new LiberayNotFoundBook("liberary cant find your book with titel " + titel);

    }

    public void returnedBook(Book book,String titel)
    {

        //searching for this book--- does this book we have before his borrowed
        for(Book b:books)
        {
            if(b!=null && b.getTitle().equals(titel)) {
                if (book.getStatus() != BookStatus.RETURNED) {
                    System.out.println("your are returned our book thank you ");
                    book.markAsReturned();
                }
            }
            else {
                System.out.println("this book is not our borrowed book");
                break;
            }
        }

    }

    public void removeBook(String title)
    {
       for(int i=0;i<count;i++)
       {
           if(books[i].getTitle().equals(title))
           {

               for(int j=i;j<count-1;j++)
               {
                books[j]=books[j+1];
               }
               books[count-1]=null;
               count--;

               System.out.println("removing is done.....");

           }
       }
    }

    public void findAllBooks()
    {
        for(int i=0;i<count;i++)
        {
            System.out.println("book titel: "+books[i].getTitle()+" | Auther name: "+books[i].getAuthor()+" | book status: "+books[i].getStatus());
        }
    }
    public  int getCount()
    {
        return count;

    }

}

