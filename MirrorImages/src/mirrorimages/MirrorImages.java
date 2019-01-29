/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirrorimages;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S530458
 */
public class MirrorImages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int noOfTests = s.nextInt();
        s.nextLine();
        ArrayList<char[][]> testcases = new ArrayList<char[][]>();
        
        for(int n=0; n<noOfTests; n++){
            int rows = s.nextInt();
            int cols = s.nextInt();
            s.nextLine();
            char[][] c = new char[rows][cols];
            for(int i=0; i<rows ; i++){
                String string = s.nextLine();
                for(int j=0; j<string.length() ; j++){
                    c[i][j] = string.charAt(j);
                }
            }            
            testcases.add(c);
        }
        
        for(int i=0; i<noOfTests; i++){
            System.out.println("Test "+(i+1));
            char[][] c = testcases.get(i);
            for(int j=c.length-1; j>=0 ; j--){                
                for(int k=c[j].length-1 ;k>=0; k--){
                    System.out.print(c[j][k]);
                }
                System.out.println("");
            } 
        }
    }
    
}
