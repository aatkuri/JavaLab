/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author S530458
 */
public class SumOfNOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter the value of N to calculate the sum of N odd numbers:");
        
        int n = stdin.nextInt();
        int total = 0;
        if(n > 0){
            for(int i = 0; i<n ; i++){
               total += (i*2)+1;   
            }                
            
            System.out.println("The total of N odd numbers: "+total);
        }
        else{
            System.out.println("You have entered a wrong number");
        }
            
    }
    
}
