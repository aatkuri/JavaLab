/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

/**
 *
 * @author Ashok Atkuri
 * @param <E>
 */
public class CircularQueue<E> {

    private static final int queue_capacity = 20;
    private E[] circularQueue;
    private int queueSize;
    private int front;
    private int rear;

    /**
     * Empty parameterized Constructor .
     */
    public CircularQueue() {
        circularQueue = (E[]) new Object[queue_capacity];
        queueSize = 0;
        front = 0;
        rear = 0;
    }

    /**
     * Method to get size of queue.
     * @return integer
     */
    public int getQueueSize() {
        return queueSize;
    }   
        
    /**
     *
     * @param element
     * @throws Exception
     */
    public void insert(E element) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full!");
        }
        circularQueue[rear] = element;
        queueSize++;
        if (rear == queue_capacity) {
            rear = 0;
        } else {
            rear++;
        }
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public E remove() throws Exception {
        E returnElement;
        if (isEmpty()) {
            throw new Exception("Queue is Empty!");
        }
        returnElement = circularQueue[front];
        queueSize--;
        if (front == queue_capacity) {
            front = 0;
        } else {
            front++;
        }
        return returnElement;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public E retrieve() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!");
        }
        return circularQueue[front];
    }

    /**
     *
     * @return
     */
    public int length() {
        return queueSize;
    }
    
    /**
     *
     * @return
     * @throws Exception
     */
    public String print() throws Exception {
        if(isEmpty())
            throw new Exception("Queue is Empty!");
        else {
            return print(front);
        }
    }
    
    private String print(int pos){
        if(pos == rear - 1)
            return circularQueue[pos] + "\n";
        return circularQueue[pos] + "\n" +print(pos + 1);
    }
        
    /**
     *
     * @return
     */
    public boolean isFull() {
        return queueSize == circularQueue.length;
    }
    
    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return queueSize == 0;
    }

}
