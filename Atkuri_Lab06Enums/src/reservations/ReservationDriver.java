/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class ReservationDriver.
 * @author Ashok Atkuri
 */
public class ReservationDriver {

    /**
     * Main method to test the Reservation class.
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        //Declare and initialize a scanner object to read from the file "inputFile.txt"
        Scanner stdin = new Scanner(new File("inputFile.txt"));
        
        //create an object for ReservationList named as "reservationList"
        ReservationList reservationList = new ReservationList();

        //While inputFile.txt has more data(While loop starts here) {
        while (stdin.hasNext()) {
            //create an object for Route named as "route" and 
            //initialize the multiple argument constructor with the values from file.
            Route route = new Route(stdin.next(), stdin.next(), stdin.next(), stdin.next());
            /*create an object for Reservation named as "reservation" 
         and initialize the multiple argument constructor with the values from file.
         Hint: use valueOf() method while passing the String where enum is required.
         For example, to pass DELTA from input file to Reservation constructor, use Airline.valueOf("DELTA").*/
            //System.out.println(route);
            Reservation reservation;
            //Read in the data
            reservation = new Reservation(route, Airline.valueOf(stdin.next()),
                    stdin.next(), Hotel.valueOf(stdin.next()), Meal.valueOf(stdin.next()));
            // Invoke addReservation method on reservationList object and add reservation.
            reservationList.addReservation(reservation);
            // }While Loop ends here 
        }

        System.out.println("*******************************************"
                + "***********************************************\n"
                + "Reservation List\n"
                + "*************************************************"
                + "*****************************************");
        
        /*Use an enhanced for loop and iterate through getReserveList() method  on reservationList object.
         and print the reservations.
         */
        for (Reservation r : reservationList.getReserveList()) {
            System.out.println(r);            
        }

        /*Use an enhanced for loop and iterate through findAllSourceLocations() method on reservationList object.
         pass "DAL" as parameter.
         and print the reservations.
         */
        System.out.println("\n****************************************"
                + "************************************************\n"
                + "Reservations that have source location \"DAL\"\n" + "***************"
                + "*************************************************"
                + "**************************");
        
        for (Reservation r : reservationList.findAllSourceLocations("DAL")) {
            System.out.println(r);
        }

        /*Use an enhanced for loop and iterate through findAllSourceLocations() method on reservationList object.
         pass "MCI" as parameter.
         and print the reservations.
         */
        System.out.println("\n****************************************"
                + "**************************************************\n"
                + "Reservations that have source location \"MCI\"\n" + "********************"
                + "**************************************************"
                + "**********************");
        
        for (Reservation r : reservationList.findAllSourceLocations("MCI")) {
            System.out.println(r);
        }
        stdin.close();        
    }
}
