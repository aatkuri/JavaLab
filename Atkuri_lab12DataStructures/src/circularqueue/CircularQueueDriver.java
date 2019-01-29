/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ashok Atkuri
 */
public class CircularQueueDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws Exception, FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("QueueData.txt"));
        CircularQueue<Integer> queue = new CircularQueue<Integer>();
        try {
            System.out.println("remove on Empty Queue:");
            System.out.println(queue.remove());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("retrieve on Empty Queue:");
            System.out.println(queue.retrieve());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        while (sc.hasNext()) {
            try {
                queue.insert(Integer.parseInt(sc.nextLine()));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        try {
            System.out.println("Insert on full Queue:");
            queue.insert(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("*******************************************\n"
                + "Circular Queue\n"
                + "*******************************************");
        System.out.println("Length of the circular queue is:");
        System.out.println("The length of the queue is " + queue.length());
        System.out.println("Queue Elements:");
        try {
            System.out.println(queue.print());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Removing element from circular queue");
        try {
            queue.remove();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Length of queue after removal");
        System.out.println("The length of the queue is " + queue.getQueueSize());
        System.out.println("Element removed");
    }
}
