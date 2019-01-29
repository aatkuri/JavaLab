/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feecalculator;

/**
 * Class FeeCalculator
 * @author Ashok Atkuri
 */
public class FeeCalculator {
    /**
     * Non-Resident Undergraduate Incidental fee value per credit hour in USD.
     */
    public static final double UG_INCIDENTAL_FEE = 406.35;

    /**
     * Non-Resident Undergraduate Designated fee value per credit hour in USD.
     */
    public static final double UG_DESIGNATED_FEE = 104.80;

    /**
     * Non-Resident Undergraduate Textbook fee value per credit hour in USD.
     */
    public static final double UG_TEXTBOOK_FEE = 6;

    /**
     * Non-Resident Undergraduate Technology fee value per credit hour in USD.
     */
    public static final double UG_TECHNOLOGY_FEE = 20.70;

    /**
     * Non-Resident Undergraduate Computer Science fee value per 
     * credit hour in USD.
     */
    public static final double UG_COMPUTERSCIENCE_FEE = 38;
    
    /**
     * Non-Resident Graduate Incidental fee value per credit hour in USD.
     */
    public static final double G_INCIDENTAL_FEE = 505.72;

    /**
     * Non-Resident Graduate Designated fee value per credit hour in USD.
     */
    public static final double G_DESIGNATED_FEE = 115.55;

    /**
     * Non-Resident Graduate Textbook fee value per credit hour in USD.
     */
    public static final double G_TEXTBOOK_FEE = 0;

    /**
     * Non-Resident Graduate Technology fee value per credit hour in USD.
     */
    public static final double G_TECHNOLOGY_FEE = 20.70;

    /**
     * Non-Resident Graduate Computer Science fee value per 
     * credit hour in USD.     
     */
    public static final double G_COMPUTERSCIENCE_FEE = 38;
    
    /**
     * International Graduate Achievement Scholarship worth $1,000
     *   This scholarship is only for the first semester.
     */    
    public static final double INTL_GRAD_ACHIEVEMENT_SCHOLARSHIP = 1000;

    /**
     * Graduate Non-Resident Waiver 50% of incidental tuition 
     *                          (for all the courses in that semester).
     *   International students achieve this scholarship only in their 2nd , 
     *   3rd and 4th semester if their GPA is greater than or equal to 3.33.
     */
    public static final double GRADUATE_WAIVER_PERCENT = 50;
    
    /**
     * Semester 1 : $456.48		
     *               Student insurance for the first semester.
     */
    public static final double INSURENCE_FEE_SEMESTER_I = 456.48;

    /**
     * Semester 2 (including semester 3) : $760.2		
     *                             Student insurance for both second semester 
     *   and third semester is $760.20. Use this value only while calculating 
     *   the second-semester fee.
     */
    public static final double INSURENCE_FEE_SEMESTER_II = 760.2;

    /**
     * Semester 3 : $ 0.0		
     *              Student insurance for semester 3 is already included in
     *   semester 2.
     */
    public static final double INSURENCE_FEE_SEMESTER_III = 0;

    /**
     * 3.Semester 4 : $456.48
     *               Student insurance for the fourth semester.
     */
    public static final double INSURENCE_FEE_SEMESTER_IV = 456.48;
    
    /**
     * International student service fee : $75
     *       International student service fee is the fee charged towards every 
     *       semester for international students.
     */
    public static final double INTL_STUDENT_SERVICE_FEE = 75;

    /**
     * Orientation Fee	: $75
     *      Orientation fee is charged only when a new student attends Northwest
     *      and will be applied only to the first-semester fee
     */
    public static final double ORIENTATION_FEE = 75;
    
    /**
     * Currency conversion from Dollar to Rupee
     */
    public static final double DOLLAR_TO_RUPEE = 64.55;

    /**
     * Currency conversion from Dollar to Euro
     */
    public static final double DOLLAR_TO_EURO = 0.83;
    
    private String studentName;
    
    /**
     * Initializes a newly created Student object by accepting student name
     * attribute.
     * @param studentName Name of the student
     */
    public FeeCalculator(String studentName){
        this.studentName=studentName;
    }

    /**
     * Gets the value in student name attribute.
     * 
     * @return a String of Name of the Student
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets student name attribute
     * 
     * @param studentName Name of the Student
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    /**
     * Extracts initials in the given student name.
     * 
     * @return a string of Initials of Student Name
     */
    public String getNameInitials(){
        String temp = studentName.replaceAll("[^\\S]+", " ").trim();
        int idx = temp.indexOf(" ");
        String initials = ""+temp.charAt(0)+".";
        while(idx != -1){
            initials = initials+temp.charAt(idx+1)+".";
            idx = temp.indexOf(" ", idx+1);
        }
        return initials.toUpperCase();
    }
    
    private double calcPrereqCost(int numberOfPrereq)
    {
        return numberOfPrereq *(UG_INCIDENTAL_FEE + UG_DESIGNATED_FEE +
                                       UG_TEXTBOOK_FEE + UG_TECHNOLOGY_FEE +
                                       UG_COMPUTERSCIENCE_FEE) * 3; 
    }
    
    private int findReqCoursesForSem1(int numberOfPrereq)
    {
        
        switch (numberOfPrereq) {
            case 1:
            case 2:    
                return 2;
            default:
                return 3;
        }             
    }
    
    private double calcReqCourseCostForOneCourse()
    {
        return (G_INCIDENTAL_FEE + G_DESIGNATED_FEE + G_TEXTBOOK_FEE + 
               G_TECHNOLOGY_FEE + G_COMPUTERSCIENCE_FEE) * 3;
    }
    
    
    private double calcScholarship(int semester,int numberOfPrereq,double gpa){
        double scholarship = 0.0;
        
        switch (semester) {
            case 1:
                scholarship = 1000;
                break;
            case 2:
            case 3:
                if(gpa >= 3.33)
                    scholarship = (0.5 * G_INCIDENTAL_FEE) * 3 * 3;
                break;
            case 4:
                if(gpa >= 3.33)
                {
                    if( numberOfPrereq == 0)
                        scholarship = (0.5 * G_INCIDENTAL_FEE) * 3 * 2;
                    else
                        scholarship = (0.5 * G_INCIDENTAL_FEE) * 3 * 3;                        
                }                    
                break;
            default:
                scholarship = 0.0;
                break;
        }
        return scholarship;
    }
    
    private double calcTotalScholarship(int semester,int numberOfPrereq
            ,double gpa){
        double totalScholarship = 0.0;
        
        for(int i=1; i<= semester ; i++)
            totalScholarship += calcScholarship(i,numberOfPrereq,gpa);
        
        return totalScholarship;
    }
    
    /**
     * Calculates and returns total cost for given semester.
     * 
     * @param semester Semester number between 1-4 given by student.
     * @param numberOfPrereq Number of numberOfPrereq of a student.
     * @param gpa GPA of the student.
     * @return a double vale of Total cost for a semester.
     */
    public double calcSemCost(int semester, int numberOfPrereq, double gpa){
        double semCost;
        switch(semester){
                case 1:  
                    semCost = (this.calcReqCourseCostForOneCourse()
                              * this.findReqCoursesForSem1(numberOfPrereq))
                              + this.calcPrereqCost(numberOfPrereq)
                              + INSURENCE_FEE_SEMESTER_I
                              + INTL_STUDENT_SERVICE_FEE
                              + ORIENTATION_FEE
                              - this.calcScholarship(1, numberOfPrereq, gpa);
                    break;
                case 2:  
                    semCost = this.calcReqCourseCostForOneCourse()*3
                              + INSURENCE_FEE_SEMESTER_II
                              + INTL_STUDENT_SERVICE_FEE
                              - this.calcScholarship(2, numberOfPrereq, gpa);
                    break;
                case 3: 
                    semCost = this.calcReqCourseCostForOneCourse()*3
                              + INSURENCE_FEE_SEMESTER_III
                              + INTL_STUDENT_SERVICE_FEE
                              - this.calcScholarship(3, numberOfPrereq, gpa);
                    break;
                case 4:
                    semCost = this.calcReqCourseCostForOneCourse()
                              * (numberOfPrereq == 0 ? 2 : 3)
                              + INSURENCE_FEE_SEMESTER_IV
                              + INTL_STUDENT_SERVICE_FEE
                              - this.calcScholarship(4, numberOfPrereq, gpa);
                    break;  
                default :
                    semCost = 0.0;
                    break;
            }
        return semCost;
    }
    
    /**
     * Calculates and returns total cost upto the given semester.
     * 
     * @param semester Semester number between 1-4 given by student.
     * @param numberOfPrereq Number of numberOfPrereq of a student.
     * @param gpa GPA of the student.
     * @return a double value of Total cost till the given semester.
     */
    public double calcTotalCost(int semester,int numberOfPrereq,double gpa){
        double totalCost = 0.0;
        
        for(int i=1; i<= semester ; i++)
            totalCost += calcSemCost(i,numberOfPrereq,gpa);
        
        return totalCost;
    }
    
    /**
     * Converts and returns amount in rupees for the value passed in dollars.
     * 
     * @param costInDollars Amount in dollar
     * @return a double value of dollars converted to rupees 
     */
    public double exchUSDToINR(double costInDollars){
        return costInDollars * DOLLAR_TO_RUPEE;
    }
    
    /**
     * Converts and returns amount in Euro for the value passed in dollars.
     * 
     * @param costInDollars Amount in dollar
     * @return a double Value of dollars converted to Euro 
     */
    public double exchUSDToEuro(double costInDollars){
        return costInDollars * DOLLAR_TO_EURO;
    }
    
    @Override
    public String toString(){
        return this.getNameInitials();
    }
    
    /**
     * Prints Receipt of a Student by calculating the total scholarship 
     * earned and total fee need to be paid till given semester.
     * 
     * @param semester Semester of the course of a student.
     * @param numberOfPrereq Number of numberOfPrereq of a student.
     * @param gpa GPA of the student.
     */
    public void printReceipt(int semester, int numberOfPrereq, double gpa){
        System.out.printf(this.getNameInitials()+", on a whole the total "
                + "scholarship till semester "+semester+" is: $ %.2f"
                , this.calcTotalScholarship(semester, numberOfPrereq, gpa) );
        System.out.printf("\nTotal fee till semester "+semester+" is: $ %.2f\n"
                ,this.calcTotalCost(semester, numberOfPrereq, gpa));
    }
}
