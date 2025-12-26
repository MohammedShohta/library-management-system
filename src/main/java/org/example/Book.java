package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

enum BookStatus
{
    BORROWED,AVAILABLE;
}
public class Book {
    int id;
    private String title;
    private String author;
    private BookStatus status;
    Book(int id,String title,String author)  {
        this.id=id;
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
        status=BookStatus.AVAILABLE;
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

    public int getId()
    {
        return this.id;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

}
