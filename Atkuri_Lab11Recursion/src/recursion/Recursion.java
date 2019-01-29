/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Ashok Atkuri
 */
public class Recursion {
    private ArrayList<ArrayList<Student>> studCombosList = new ArrayList<ArrayList<Student>>();

    //Sum of N odd numbers.
    public int sumOfOdd(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return (2 * n - 1) + sumOfOdd(n - 1);
        }
    }
    
    //Method to organize seats.
    public ArrayList<ArrayList<Student>> organizeSeats(ArrayList<Student> studentList)
    {        
        studCombosList = new ArrayList<ArrayList<Student>>();
        int n = studentList.size();
        possibilites(studentList, 0, n-1);
        return studCombosList;
    }

    private void possibilites(ArrayList<Student> studList, int l, int r)
    {   
        if (l == r){            
            studCombosList.add(new ArrayList(studList));            
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                studList = swap(studList,l,i);
                possibilites(studList, l+1, r);
                studList = swap(studList,l,i);
            }            
        }
    }
 
    private ArrayList<Student> swap(ArrayList<Student> studList, int i, int j)
    {
        Student temp;        
        temp = studList.get(i);
        studList.set(i,studList.get(j));
        studList.set(j,temp);        
        return studList;
    }
    
    //Organizing With Restrictions
    public ArrayList<ArrayList<Student>> organizeSeatsRestricted(ArrayList<Student> studentList, Student stud1, Student stud2) {
        ArrayList<ArrayList<Student>> studCombosList = new ArrayList<ArrayList<Student>>();
        
        for(ArrayList<Student> sList : organizeSeats(studentList)){            
            for(int i=0; i < sList.size() - 1; i++){                
                if((sList.get(i).getFname().equals(stud1.getFname()) || sList.get(i).getFname().equals(stud2.getFname()))
                        &&(sList.get(i+1).getFname().equals(stud1.getFname()) || sList.get(i+1).getFname().equals(stud2.getFname())))
                {
                    studCombosList.add(sList);
                }
            }
        }
        
        return studCombosList;
    }

    //Method to eval expression
    public int evaluateExpression(String exp) {
        if (exp != null && exp.length() > 0) {
            int openBrace, closeBrace = -1;
            openBrace = exp.indexOf(")");
            if (openBrace != -1) {
                closeBrace = exp.lastIndexOf("(", openBrace);
            }
            if (closeBrace != -1 && openBrace > closeBrace) {
                String subExp = exp.substring(closeBrace + 1, openBrace);
                exp = exp.replace("(" + subExp + ")", "" + evaluateSubExp(subExp));
                return evaluateExpression(exp);
            } else if (closeBrace == -1 && openBrace == -1) {
                return evaluateSubExp(exp);
            }
        }
        return 0;
    }

    private int evaluateSubExp(String expression) {
        char[] expArray = expression.toCharArray();

        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> operators = new Stack<Character>();

        for (int i = 0; i < expArray.length; i++) {
            if (expArray[i] == ' ') {
                continue;
            }
            if (expArray[i] >= '0' && expArray[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();
                sbuf.append(expArray[i]);
                while (i < expArray.length - 1 && expArray[i + 1] >= '0' && expArray[i + 1] <= '9') {
                    sbuf.append(expArray[i + 1]);
                    i++;
                }
                values.push(Integer.parseInt(sbuf.toString()));
            } else if (expArray[i] == '+' || expArray[i] == '-'
                    || expArray[i] == '*' || expArray[i] == '/') {

                while (!operators.empty() && hasPrecedence(expArray[i], operators.peek())) {
                    values.push(evaluateExp(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(expArray[i]);
            }
        }

        while (!operators.empty()) {
            values.push(evaluateExp(operators.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    private boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    private int evaluateExp(char op, int op1, int op2) {
        switch (op) {
            case '*':
                return op1 * op2;
            case '/':
                if (op2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return op1 / op2;
            case '%':
                return op1 % op2;
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
        }
        return 0;
    }
}
