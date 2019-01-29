/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

import java.util.Scanner;

/**
 *
 * @author Ashok Atkuri
 */
public class StoreDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Printing message
        System.out.println("**********************Testing the Store Class*****"
                + "*****************\n");
        
        //Creating an Object using Parameterized constructor.
        Store store1 = new Store("Timmy Tommy Enterprises", 1000,  "3127869900",
                "311 Jarvis Square","Chicago", "Illinois",60018);
                
        //Printing message
        System.out.println("**************************************************"
                + "****\n" +"Testing the Getter methods or Accessors of Store "
                + "Class\n" +"***********************************************"
                + "*******");       
        //Retrive the values of object store1 by using getters.
        System.out.println("Store Name: "+store1.getStoreName());
        System.out.println("Store ID: "+store1.getStoreID());
        System.out.println("Street of the Store: "+store1.getStreet());
        System.out.println("City of the Store : "+store1.getCity());
        System.out.println("State of the Store: "+store1.getState());
        System.out.println("Zip code of the Store: "+store1.getZipCode());
        System.out.println("Phone number of the Store: "
                +store1.getPhoneNumber());
        
        //Printing message
        System.out.println("*****************************************\n" +
                           "Testing the toString method\n" +
                           "*****************************************");
        /*Printing the valuse of store1 object by invoking the overridden 
        toString method.*/
        System.out.println(store1.toString());
        
        //Printing message
        System.out.println("*****************************************\n" +
                           "Testing the user defined methods\n" +
                           "*****************************************");
        //Invoking getFirstWordOfStoreName method on store1 object.            
        System.out.println("First word of store name: "
                +store1.getFirstWordOfStoreName());
        //Invoking getMiddleWordOfStoreName method on store1 object.
        System.out.println("Middle word of the store name: "
                +store1.getMiddleWordOfStoreName());
        //Invoking getLastWordOfStoreName method on store1 object.
        System.out.println("Last word of the store name: "
                +store1.getLastWordOfStoreName());
        
        //Replacing the value of attribute store name of the object store1.
        store1.replaceStoreName("Timmy Tommy Enterprises", "JC Penny Store");
        
        System.out.println("Printing the store1 object after invoking the "
                + "replace method");
        System.out.println(store1.toString());        
        
        Store store2 = new Store();
        store2.setStoreName("KC India Mart");
        store2.setStoreID(1001);
        //Setting phone number for new Store object created
        store2.setPhoneNumber("9136818080");
        
        //Setting street for new Store object created
        store2.setStreet("8542 w 133rd Street");
        
        //Setting city for new Store object created
        store2.setCity("Overland Park");
        
        //Setting state for new Store object created
        store2.setState("Kansas");
        
        //Setting street for new Store object created
        store2.setZipCode(66213);
        
        //Printing message
        System.out.println("\n*******************************************"
                + "**************************\n"
                + "Testing the store class using toString after invoking "
                + "the Setter methods or Mutators"
                + "\n****************************************************"
                + "*****************");
        
        //Invoking toString on new store object
        System.out.println(store2.toString());
        
        //Printing Message
        System.out.println("\n*************************************************"
                + "*******\n"
                + "Testing the scanner class to take input from the console\n"
                + "********************************************************");
        
        //Declaring and initializing Scanner object
        Scanner scannerObject = new Scanner(System.in);
        
        //Accepting input from console
        System.out.println("Enter the store details");
        
        System.out.println("Enter the store name:");
        
        String storeNameInput = scannerObject.nextLine();
        
        System.out.println("Enter the store ID:");
        int storeIDInput = scannerObject.nextInt();
                    scannerObject.nextLine();
        
        System.out.println("Enter the store phone number:");
        String phoneNumberInput = scannerObject.nextLine();
        
        System.out.println("Enter the street name of the store:");
        String streetInput = scannerObject.nextLine();
        
        System.out.println("Enter the city name, state name, zip code of the "
                + "store in one line without any commas:");
        String cityInput = scannerObject.next();
        String stateInput = scannerObject.next();
        int zipCodeInput = scannerObject.nextInt();
        
        //Declare new store and initializing with above values
        Store store3 = new Store(storeNameInput,storeIDInput,phoneNumberInput,
                streetInput,cityInput,stateInput,zipCodeInput);
        
        //Printing message
        System.out.println("\n**********************************************"
                + "******\nTesting the toString method without invoking "
                + "the method\n***********************************************"
                + "*****");
        
        //Printing the store3 Object.
        System.out.println(store3);
    }    
}
