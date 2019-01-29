/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/**
 *
 * @author Ashok Atkuri
 * @param <E>
 */
public class AStack<E> {
    private ArrayDeque<E> myStack;

    /**
     *
     */
    public AStack() {
        myStack = new ArrayDeque<E>();
    }
    
    /**
     *
     * @param element
     */
    public void push(E element) {
        myStack.addLast(element);
    }
    
    /**
     *
     * @return
     */
    public E pop() {
        return myStack.removeLast();
    }
    
    /**
     *
     * @return
     */
    public E peek(){
        return myStack.peekLast();
    } 
    
    /**
     *
     * @return
     */
    public int size(){
        return myStack.size();
    }
    
    /**
     *
     * @return
     */
    public boolean isEmpty(){
        return myStack.isEmpty();
    }
}
