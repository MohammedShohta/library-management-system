package org.example;

import java.util.Comparator;

public class SortBook implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int idCompared=o1.id-o2.id;
        if(idCompared!=0)
        {
            return idCompared;
        }
        //the only case that compare with title when id1,id2 equals zero (id1=id2)
        return o1.getTitle().compareTo(o2.getTitle());

    }
}
