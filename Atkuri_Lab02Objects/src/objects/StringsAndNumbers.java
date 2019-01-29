/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 *
 * @author Ashok Atkuri.
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String Question 1
        System.out.println("Output:\n" + "\n" 
                + "******** String Class ********\n") ;
        String string1 = "   Why";
        String string2 = " choose ";
        String string3 = "   Northwest  ";
        String string4 = "among";
        String string5 = " other     ";
        String string6 = " Universities ";
        String string_qns = "?";
        
        String concatString = string1.concat(string2.concat(string3
                              .concat(string4.concat(string5
                              .concat(string6)))));
        
        System.out.println("The length of the concatenated string is: "
                             +concatString.length());
        
        String trimString = string1.trim().concat(" ").concat(string2.trim()
                            .concat(" ").concat(string3.trim().concat(" ")
                            .concat(string4.trim().concat(" ")
                            .concat(string5.trim().concat(" ").concat(string6
                            .trim())))));                
        System.out.println("Whole sentence: "+trimString.concat(string_qns));
        System.out.println("The length of the trimmed string: "
                +trimString.length());  
        String tempWord = trimString.substring(trimString
                          .indexOf(string6.trim()));
        System.out.println("Index of first 'i' in Universities is: "
                   +tempWord.indexOf("i"));
        
        //String Question 2
        String string7 = "computer Applied science Applied Computer science "
                + "science Applied computer Appleid computer Science Applied "
                + "computer Applied";
        System.out.println("The first occurrence of word Computer is: "
                   +string7.indexOf("Computer"));        
        
        String appliedString = string7.substring(string7.indexOf("Applied"))
                .substring(0,("Applied").length());
        String computerString = string7.substring(string7.indexOf("Computer"))
                .substring(0,("Computer").length());
        String scienceString = string7.substring(string7.indexOf("Science"))
                .substring(0,("Science").length());
        String finalString = string3.trim().concat(" ").concat("is one")
                             .concat(" ").concat(string4.trim())
                             .concat(" ").concat("the").concat(" ")
                             .concat(string6.trim()).concat(" ")
                             .concat("which provides").concat(" ")
                             .concat(appliedString).concat(" ")
                             .concat(computerString).concat(" ")
                             .concat(scienceString).concat(" ");
        System.out.println("String of strings: "+finalString);
       
        System.out.println("\n******** Math Class ********\n");
                
        int value1;
        value1 = 27;
        int value2;
        value2 = 4;
        double powOfValue1_Value2=Math.pow(value1, value2);
        System.out.println("27 power 4 is: "+powOfValue1_Value2);
        int secOfValue1=(int) (1/Math.cos(value1));
        System.out.println("Secant of 27 is: "+secOfValue1);
        double myNumber;
        myNumber = 43.35;
        double sqrtOfMyNumber=Math.sqrt(myNumber);
        System.out.println("Square root of 43.35 is: "+sqrtOfMyNumber);
        System.out.println("Ceil Value of 43.35 is: "+Math.ceil(myNumber));
        System.out.println("Floor value is: "+Math.floor(myNumber));
                
        
        int myNumber1 = 30;
        int myNumber2 = 60;
        double cosOfMyNumber1,cosOfMyNumber2,tanOfMyNumber1,tanOfMyNumber2;
        cosOfMyNumber1 = Math.cos(myNumber1);
        cosOfMyNumber2 = Math.cos(myNumber2);
        tanOfMyNumber1 = Math.tan(myNumber1);
        tanOfMyNumber2 = Math.tan(myNumber2);
        //Cos(30)-rounded: 0
        System.out.println("Cos("+myNumber1+")-rounded: "
                          +Math.round(cosOfMyNumber1));
        //Cos(60)-rounded: -1
        System.out.println("Cos("+myNumber2+")-rounded: "
                          +Math.round(cosOfMyNumber2));       
        //Tan(30)-rounded: -6
        System.out.println("Tan("+myNumber1+")-rounded: "
                          +Math.round(tanOfMyNumber1));
        //Tan(60)-rounded: 0
        System.out.println("Tan("+myNumber2+")-rounded: "
                          +Math.round(tanOfMyNumber2));
        //Trigonometry: 2.0     (cosec(value1))(3²/v(4^2+5(3)(2)+3)) 
        double expResult = (1/Math.sin(value1))*((Math.pow(3, 2))/Math.sqrt(Math
                            .pow(4,2)+5*(3)*(2)+3));
        System.out.println("Trigonometry: "+Math.ceil(expResult));

        //End of Math Class
        
        System.out.println("\n******** Random Class ********\n" +"\n" +
            "**Without Seed value**\n" );
        
        int range = 300;
        Random randNoSeed = new Random();
        /*
            First Random value:60
            Second Random value:56
            Third Random value:270
            Fourth Random value:211
            Fifth Random value:574064081
            Sixth Random value:1389644856
            Seventh Random value:-1973490223
        */
        
        //Generates random values within the given range in nextInt().
        System.out.println("First Random value:"+randNoSeed.nextInt(300));
        System.out.println("Second Random value:"+randNoSeed.nextInt(300));
        System.out.println("Third Random value:"+randNoSeed.nextInt(300));
        System.out.println("Fourth Random value:"+randNoSeed.nextInt(300));
    
        /*Generates random values with no range since no range is specified in 
        nextInt().*/
        System.out.println("Fifth Random value:"+randNoSeed.nextInt());
        System.out.println("Sixth Random value:"+randNoSeed.nextInt());
        System.out.println("Seventh Random value:"+randNoSeed.nextInt());
    
        //4(b)
        System.out.println("**4(b) The Randonm class with no seed value "
                + "defined has generated different random values on "
                + "every execution");
        
    System.out.println("\n**Without Seed value**\n" );
    
    Random randWithSeed = new Random(20L);
    /*
      First Random value:53
      Second Random value:136
      Third Random value:201
      Fourth Random value:261
      Fifth Random value:-885414485
      Sixth Random value:-1791719506
      Seventh Random value:700408466 
    */
    
    //Generates random values within the given range in nextInt().
    System.out.println("First Random value:"+randWithSeed.nextInt(range));
    System.out.println("Second Random value:"+randWithSeed.nextInt(range));
    System.out.println("Third Random value:"+randWithSeed.nextInt(range));
    System.out.println("Fourth Random value:"+randWithSeed.nextInt(range));
    
     /*Generates random values with no range since no range is specified in 
        nextInt().*/
    System.out.println("Fifth Random value:"+randWithSeed.nextInt());
    System.out.println("Sixth Random value:"+randWithSeed.nextInt());
    System.out.println("Seventh Random value:"+randWithSeed.nextInt());
    
    //4(d)
    System.out.println("**4(d) The Random class has generated the same sequence"
            + " of random values when a seed value is specified"
            + "(20L in this case)");
    
    //4(d)
    System.out.println("**4(e) Random class with specified seed value generates"
                       + " the same sequence of random values on every "
                       + "execution where as the Random class with no "
                       + "seed value is generates different set of random "
                       + "values on every execution");

    }
    
}
