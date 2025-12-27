package org.example;


//add,remove,view
public class Admin extends User{

   public Admin()
   {
       super("Mohammed","mohammed@gmail.com",23);
   }
   @Override
   public void viewBook(Liberary liberary)
   {
       liberary.findAllBooksV3();
   }

   public void removeBook(Liberary liberary,String title)
   {
       liberary.removeBookV2(title);
   }

   public void addBook(Liberary liberay,Book book)
   {
       liberay.addBook(book);
   }

}
