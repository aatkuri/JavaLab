/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class CardDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("inputFile.txt"));
        CardsArray ca = new CardsArray();
        CardsArrayList cList = new CardsArrayList();
        while (sc.hasNext()) {
            Card c = new Card(Integer.parseInt(sc.nextLine()), sc.nextLine());
            ca.addCardsToArray(c);
            cList.addCardsToList(c);
        }
        System.out.println("Array Data:" + ca.toString());
        System.out.println("******************************");
        System.out.println("ArrayList Data:\n" + cList.toString());
        System.out.println("******************************");
        System.out.println("Remove at position 3 from hearts arraylist");
        cList.removeCardsFromList(3, cList.getHearts());
        System.out.println("Remove at position 2 from spades arraylist");
        cList.removeCardsFromList(2, cList.getSpades());
        System.out.println("Remove at position 1 from clubs arraylist");
        cList.removeCardsFromList(1, cList.getClubs());
        System.out.println("******************************");
        System.out.println("ArrayList Data after removing element:\n" + cList.toString());
    }
}
