/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ashok Atkuri
 */
public class BalancedParens {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner stdin = new Scanner(new File("expressions.txt"));
        while (stdin.hasNext()) {
            String exprn = stdin.nextLine();
            AStack<Character> parenStack = new AStack<Character>();
            boolean flag = false;
            for (char c : exprn.toCharArray()) {
                if (c == '(') {
                    parenStack.push(c);
                } else if (c == ')') {
                    if (parenStack.peek() != null) {
                        parenStack.pop();
                    } else {
                        flag = true;
                    }
                }
            }
            if (flag) {
                System.out.println(exprn + ": INVALID:\n"
                        + "Trying to pop, but the stack is empty!\n");
            } else if (parenStack.isEmpty()) {
                System.out.println(exprn + ": VALID\n");
            } else {
                System.out.println(exprn + ": INVALID:\n"
                        + "Parsing complete, but the stack is not empty!\n");
            }
        }
    }
}
