package org.example;

import java.lang.reflect.*;
import java.util.concurrent.ExecutionException;

/*
* use reflection concept to borrow book
* */
public class LibraryReflaction {

    private  Liberary liberary=new Liberary();

    Method [] methods=liberary.getClass().getDeclaredMethods();

    public void getBorrowMethod(Liberary liberary,String title) throws InvocationTargetException, IllegalAccessException {
        for(var m:methods)
        {
            if(m.getName().equals("borrowBookV2"))
            {
                m.invoke(liberary,title);
            }
        }
    }

}
