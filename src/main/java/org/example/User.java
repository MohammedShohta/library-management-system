package org.example;

abstract public class User {

    private String name;
    private String email;
    private int age;

    public User(String name,String email,int age)
    {
        this.name=name;
        this.email=email;
        this.age=age;
    }
    public String getName()
    {
        return this.name;
    }

    public String getEmail()
    {
        return this.email;
    }
    public int getAge()
    {

        return this.age;
    }
    //method to view book the libaray will choose the book upon to the user type
    abstract  public void viewBook(Liberary liberary);

}
