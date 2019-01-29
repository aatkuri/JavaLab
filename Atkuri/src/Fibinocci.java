
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author S530458
 */
public class Fibinocci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter number");
        int number = stdin.nextInt();
        System.out.println("result is:" );
        for (int i = 0; i <= number; i++) {
            System.out.print(fibinocci(i)+ ",");
        }

    }

    public static long fibinocci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibinocci(n - 1) + fibinocci(n - 2);
    }

}
