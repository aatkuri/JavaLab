/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semafori;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S530458
 */
public class Semafor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<DistanceLight> inputList = new ArrayList<DistanceLight>();
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter Distance:");
        int distance = stdin.nextInt();
        int noOfSignals = stdin.nextInt();
        
        System.out.println("semafori.Semafor.main()");
        for(int i=0; i<noOfSignals; i++){
            
        }
    }
    
}
