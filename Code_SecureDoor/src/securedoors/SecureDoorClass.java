/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securedoors;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S530458
 */
public class SecureDoorClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<User> u = new ArrayList<User>();
        boolean status = false;
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Enetr the size of the log:");
        Integer n = stdin.nextInt();
        
        for(int i=0;i<n;i++)
        {
            String logEntry = stdin.nextLine();
            if(logEntry.indexOf("entry") != -1)
                 status = true;
            else if(logEntry.indexOf("exit") != -1)
                status = false;
            u.add(new User(logEntry,status));
        }
        
        
    }
    
}
