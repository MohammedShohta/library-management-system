package org.example;
enum BookStatus
{
    BORROWED,RETURNED,AVAILABLE,NOTAVAILABLE;
}
public class Book {
    private String title;
    private String author;
    private BookStatus status;
    Book(String title,String author)  {
        this.title = title;
        this.author = author;
        this.status=BookStatus.AVAILABLE;
    }
    public boolean isAvailable()
    {
      return status==BookStatus.AVAILABLE;
    }

    public void markBorrowed()
    {
       status=BookStatus.BORROWED;
    }
    public void markAsReturned()
    {
        status=BookStatus.RETURNED;
    }
    public String getTitle()
    {
        return this.title;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public BookStatus getStatus()
    {
        return status;
    }


}
