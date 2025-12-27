package org.example;


//borrow,return only
public class Member extends User{


    public Member()
    {
        super("Mohammed","moh@gmail",32);
    }

    public void canBorrowBook(Liberary liberary, String title)
    {
        try{
             liberary.borrowBookV3(title);
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
        liberary.returnedBookV2(titel);
        }
        catch (InvalidBook e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void viewBook(Liberary liberary)
    {

        liberary.findAllBooksForMemberUser();
    }

}