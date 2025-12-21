package org.example;

public class Member {

    private String id;
    private String name;
    public void canBorrowBook(Liberary liberary, String title)
    {
        try{
             liberary.borrowBookV2(title);
        }
        catch (InvalidBook e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void returnBook(Liberary liberary,String titel)
    {
        try
        {
        liberary.returnedBook(titel);
        }
        catch (InvalidBook e)
        {
            System.out.println(e.getMessage());
        }
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