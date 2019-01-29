/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import util.Utility;

/**
 * Class ShipDriver throws FileNotFoundException
 * Driver class to test the class ship and its sub classes.
 * @author Ashok Atkuri
 */
public class ShipDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here ship.txt
        Scanner sc = new Scanner(new File("ship.txt"));
        ArrayList<Ship> shipList = new ArrayList<Ship>();
        String manufacturerName = sc.nextLine();
        int modelSeries = sc.nextInt();
        sc.nextLine();
        System.out.println("*********************************************"
                + "********************\n" + "Welcome to " + manufacturerName + "\n"
                + "******************************************************"
                + "***********\n");
        while (sc.hasNext()) {
            String shipType = sc.nextLine();
            Ship ship = new Ship();
            if (shipType.equals("Passenger Ship")) {
                String shipSubtype = sc.nextLine();
                if (shipSubtype.equals("Cruise")) {
                    String shipName = sc.nextLine();
                    double x1 = sc.nextDouble(), y1 = sc.nextDouble(),
                           x2 = sc.nextDouble(), y2 = sc.nextDouble();
                    sc.nextLine();
                    String model = sc.nextLine();
                    double basePrice = sc.nextDouble();
                    sc.nextLine();
                    //Instantiating the Cruise ship object and assigned it to its parent class PassengerShip reference.Applying the concept of polymorphism.
                    PassengerShip cruiseShip = new Cruise(manufacturerName, modelSeries, shipName, new Point(x1, y1),
                            new Point(x2, y2), model, basePrice);
                    ArrayList<String> facilities = cruiseShip.addFacilities(sc.nextLine());
                    cruiseShip.setFacilities(facilities);
                    System.out.println("Cruise details: \n" + cruiseShip);
                    Utility.knowHowFarIsYourShipFromOthers(cruiseShip, shipList);
                    shipList.add(cruiseShip);
                    System.out.println("*****************************************************************\n");
                } else if (shipSubtype.equals("Ferry")) {
                    String shipName = sc.nextLine();
                    double x1 = sc.nextDouble(), y1 = sc.nextDouble(),
                           x2 = sc.nextDouble(), y2 = sc.nextDouble();
                    sc.nextLine();
                    String model = sc.nextLine();
                    double basePrice = sc.nextDouble();
                    sc.nextLine();
                    double time = sc.nextDouble();

                    sc.nextLine();
                    //Instantiating the Ferry ship object and assigned it to its parent class PassengerShip reference.Applying the concept of polymorphism.
                    PassengerShip ferryShip = new Ferry(manufacturerName, modelSeries, shipName, new Point(x1, y1),
                            new Point(x2, y2), model, basePrice, time);
                    ArrayList<String> facilities = ferryShip.addFacilities(sc.nextLine());
                    ferryShip.setFacilities(facilities);
                    System.out.println("Ferry details: \n" + ferryShip);
                    Utility.knowHowFarIsYourShipFromOthers(ferryShip, shipList);
                    shipList.add(ferryShip);
                    System.out.println("*****************************************************************\n");
                }
            } else if ("Cargo Ship".equals(shipType)) {
                String goodType = sc.nextLine();
                int stockID = sc.nextInt();
                sc.nextLine();
                double stockWeight = sc.nextDouble();
                sc.nextLine();
                String shipName = sc.nextLine();
                double x1 = sc.nextDouble(), y1 = sc.nextDouble(),
                       x2 = sc.nextDouble(), y2 = sc.nextDouble();
                sc.nextLine();
                String model = sc.nextLine();
                CargoShip cargo = new CargoShip(manufacturerName, modelSeries, shipName, new Point(x1, y1),
                            new Point(x2, y2), model);
                Good cargoGoods = new Good(goodType, stockID, stockWeight);
                cargo.addGoods(cargoGoods);
                System.out.println("Cargo Ship details: ");
                System.out.println("Cargo Ship Name: " + cargo.getShipName() + "\n"
                        + "The distance to be travelled by the ship is "
                        + String.format("%.2f", Utility.getDistance(cargo.getSourceLocation(),
                                cargo.getDestinationLocation())) + " miles\n"
                        + "The type of stock on the ship is '" + cargoGoods.getType()
                        + "' weighing " + cargoGoods.getStockWeight() + " tons\n" + cargo);
                Utility.knowHowFarIsYourShipFromOthers(cargo, shipList);
                shipList.add(cargo);
                System.out.println("*****************************************************************\n");
            }
        }
    }
}
