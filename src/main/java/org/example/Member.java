package org.example;

public class Member {

    private String id;
    private String name;
    Member(String id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void canBorrowBook(Liberary liberary, String title)
    {
        try{
             liberary.borrowBook(title);
             System.out.println("you can borrow this book ");
        }
        catch (LiberayNotFoundBook e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void returnBook(Liberary liberary,Book book,String titel)
    {
        liberary.returnedBook(book,titel);
    }

    public String getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
}