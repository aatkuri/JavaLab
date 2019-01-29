/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package jobapplication;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * This main class is used to test the system.
 * @author Ashok Atkuri
 */
public class ApplicationDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. Create an arraylist of Application and name it as applicationsList to store the list of applications
        ArrayList<Application> applicationsList = new ArrayList<>();
        //2. Create a scanner object and name it as sc to read the input from keyboard
        Scanner sc = new Scanner(System.in);
        //3. Print the statement "Welcome to the Career Builder System"
        System.out.println("************************************\n" +
                           "Welcome to the Career Builder System\n" +
                           "************************************");
        boolean iterate = true;
        //while (iterate) {
        while (iterate) {
                //4. Print the statement "Fill your details to know the jobs that suits your profile"
            System.out.println("Fill your details to know the jobs that suits your profile\n");
                //5. Create an object for Application class using no-argument constructor and name it as application
            Application application = new Application();
                //6. Invoke the fillApplication() method on application object
            application.fillJobApplicationDetails();
                //7. Invoke the haveAGoodBackGround() method on application and check the whether it returns true or not. 
                //If it return true go to next steps or else print a statement like "You shouldn't have any criminal or illicit background" 
                //and exit from the main method
            if (application.haveAGoodBackGround()) {
                //8. If it returns true then invoke the checkQualification() method on application 
                //and check the condition if the condition is true go to next step 
                //otherwise print a staement like "You need a higher need to apply the job posistions we have currently" and exit from the main method
                if (application.checkQualification()) {
                //9. If it returns true then invoke checkAge() on application and if the condition is true 
                //then invoke produceTheJobDetailsForApplicant() on applicantion and go to next step
                    if (application.checkAge()) {
                        application.produceTheJobDescriptionForApplicant();
                //10.Invoke the checkAvailabilityOfJob() method on application 
                        System.out.println(application.checkAvailabilityOfJob());
                //11.Prompt the user "Would you like to apply for this job", if the answer is "yes/YES" then add the application to the arraylist applicationsList
                        System.out.println("Would you like to apply for this job");
                        if (sc.nextLine().equalsIgnoreCase("yes")) {
                            applicationsList.add(application);
                        }
                //12.Prompt the user "Would you like to apply for another applicant" if the answer is "no/NO" exit from the loop otherwise repeat the same process
                        System.out.println("Would you like to apply for another applicant");
                        if (sc.nextLine().equalsIgnoreCase("no")) {
                            iterate = false;
                        }
                    }
                } else {
                    System.out.println("You need a higher need to apply the job posistions we have currently");
                    System.exit(0);
                }
            } else {
                System.out.println("You shouldn't have any criminal or illicit background");
                System.exit(0);
            }
        }
        //13.Print the arraylist applicationsList
        System.out.println("*********************************************\n"
                + "Here is the list of applications you created \n"
                + "*********************************************");
        for (Application a : applicationsList) {
            System.out.println(a.toString());
            System.out.println("\n*********************************************\n");
        }
    }
}
