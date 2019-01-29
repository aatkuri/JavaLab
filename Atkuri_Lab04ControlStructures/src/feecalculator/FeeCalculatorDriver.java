package feecalculator;

import java.util.Scanner;

/**
 * Class FeeCalculatorDriver
 * @author Ashok Atkuri
 */
public class FeeCalculatorDriver {

    /**
     * Main method.
     * @param args Arguments for method main
     */
    public static void main(String args[]){
        
        System.out.println("*******************************\n***Northwest "
                + "Cost Calculator***\n*******************************");
        char stopFlag;
        Scanner scannerObj = new Scanner(System.in); //To get input from student through console.
        
        do{
            System.out.print("\nPlease enter the full name (Firstname "
                             + "Lastname): ");
            String name = scannerObj.nextLine(); //To get the full name of the student.
            //Condition check if the entered name string is empty.
            while(name.trim().equals("")){
                System.out.print("Student name should not be empty. "
                        + "\nPlease enter the full name (Firstname "
                             + "Lastname): ");
                name = scannerObj.nextLine(); //To get the full name of the student through console.
            }
            
            System.out.print("Please enter the number of pre-requisites: ");
            int prerequisites = scannerObj.nextInt(); //To get number of pre-requisites of the student through console.
            //Condition to check if the given pre-requisites are in 0,1 or 2.
            while(!(prerequisites==0 || prerequisites==1 || prerequisites==2)){
                System.out.print("You have entered invalid number, please "
                        + "re-enter either 0 or 1 or 2: ");
                prerequisites = scannerObj.nextInt(); //To get number of pre-requisites of the student through console.
            }
            
            System.out.print("Please enter the number of semesters you want to "
					+ "calculate the cumulative fee: ");
            int semester = scannerObj.nextInt(); //To get number of semester of the student through console.
            //Condition to check if the given semester is in 1,2,3 or 4.
            while(!(semester==1 || semester==2 || semester==3 || semester==4)){
                System.out.print("You have entered invalid number, please "
                        + "re-enter either 1 or 2 or 3 or 4: ");
                semester = scannerObj.nextInt(); //To get number of semester of the student through console.
            }
            
            double gpa = 0.0;
            if(semester!=1){
                System.out.print("Enter the cumulative GPA: ");
                gpa = scannerObj.nextDouble(); // To get the cumulative gpa from console.
                //Condition to check if the gpa is in between 0 and 4.
                while(gpa<0 || gpa>4){
                    System.out.print("The GPA value should be in between 0 "
                            + "and 4, please re-enter: ");
                    gpa = scannerObj.nextDouble(); // To get the cumulative gpa from console.
                }
            }
            
            //Print the details of the fee of the student based on the inputs.
            FeeCalculator feeCalculator = new FeeCalculator(name);
            System.out.println("\n****************************************\n" 
                + "* Hello, "+feeCalculator.getNameInitials()+"\n*----------"
                        + "--------------------------\n* Your Account Summary"
                        + "\n*------------------------------------\n*________"
                        + "__________________________");
        
            for(int i=1; i<=semester; i++){
                System.out.printf("* Semester "+ i +" fee is:    $ %.2f * \n",
                    feeCalculator.calcSemCost(i, prerequisites, gpa));
            }
            
            double totalFee=
                    feeCalculator.calcTotalCost(semester, prerequisites, gpa);
            System.out.printf("*----------------------------------    \n* "
                    + "Total cost:           $ %.2f\n*---------------------"
                    + "-------------    \n*\n",totalFee);
            System.out.printf("* USD to INR: Rs. %.2f\n"
                    ,feeCalculator.exchUSDToINR(totalFee));
            System.out.printf("* USD to Euro: € %.2f\n"
                    ,feeCalculator.exchUSDToEuro(totalFee));
            System.out.println("****************************************");
                    feeCalculator.printReceipt(semester, prerequisites, gpa);
            System.out.print("\nDo you want to calculate again?(Y/N): ");
            
            stopFlag = scannerObj.next().charAt(0);
            scannerObj.nextLine(); //Get the input from student to continue or not.
        }while(Character.toUpperCase(stopFlag) == 'Y'); //Loop through the code until the value equals to "y".
        
        System.out.println("\nThank You! All the best.");
        scannerObj.close();
    }
}
