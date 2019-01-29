package linkedlists;

import java.util.NoSuchElementException;

/**
 * @author Ashok Atkuri
 * @param <E>
 */
public class Atkuri_ALinkedList<E> {

    private Node<E> listStart;
    private int listLength;    

    /**
     * Constructor Creates an empty linked list with the head of the list
     * pointing to null. Initializes the length of the list to 0.
     */
    public Atkuri_ALinkedList() {
        listStart = null;
        listLength = 0;
    }

    /**
     * Returns true if the list is empty; false otherwise.
     *
     * @return true if the list is empty; false otherwise.
     */
    public boolean isEmpty() {
        return listStart == null;
    }

    /**
     * Adds an object to the beginning of the list.
     *
     * @param myObject The object to be added to the beginning of the list.
     */
    public void addFirst(E myObject) {
       Node nptr = new Node(myObject);    
        listLength++ ;    
        if(listStart == null) 
        {
            listStart = nptr;            
        }
        else 
        {
            nptr.nextNode = listStart;
            listStart = nptr;
        }
    }

    /**
     * Removes the first object from the list.
     *
     * @return the node that was removed from the list.
     * @throws NoSuchElementException if the list is empty
     */
    public Node<E> removeFirst() throws NoSuchElementException {
        if(listStart == null)
            throw new NoSuchElementException();
        Node nptr = listStart;
        listStart = listStart.nextNode;
        listLength--;
        return nptr;
    }

    /**
     * Returns the number of nodes in the list.
     *
     * @return the number of nodes in the list.
     */
    public int size() {
        return listLength;
    }

    /**
     * Returns a string representation of the linked list. The string
     * representation consists of each node in the list, printed using the
     * toString method of the Node class, with each node printed on a new line.
     *
     * @return a string representation of the linked list.
     */
    @Override
    public String toString() {
        String data = "";
        Node nptr = listStart;
        while(nptr != null){
            data += nptr.toString() + "\n";
            nptr = nptr.nextNode;
        }
        return data;
    }
}
