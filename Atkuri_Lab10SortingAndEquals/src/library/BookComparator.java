/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Comparator;

/**
 *
 * @author S530458
 */
public class BookComparator implements Comparator<Book> {

    public BookComparator() {
    }
    
    @Override
    public int compare(Book t,
                   Book t1){
        if(t.getEdition() < t1.getEdition())
            return -1;
        else if(t.getEdition() == t1.getEdition())
            return 0;
        else
            return 1;
    }
}
