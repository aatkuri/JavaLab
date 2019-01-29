/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

import java.util.Date;
import java.util.Scanner;

/**
 * This class takes the input from the applicant and checks all the conditions and prints the job details.
 * @author Ashok Atkuri
 */
public class Application implements Available {
    /**
     * Instance variable of type Applicant
     */
    Applicant applicant;
    /**
     * Instance variable of type Job
     */
    Job job;
    /**
     * Instance variable of type Supervisor
     */
    Supervisor supervisor;

   /**
     * The no-argument constructor that has no body. Used to instantiate the 
     * object.
     */
    public Application() {
        applicant = new Applicant();
        supervisor = new Supervisor();
    }

    /**
     * Method to fill the details of applicant. It should prompt the user to 
     * enter the details like firstName, lastName, phoneNumber, workExperience, 
     * educationQualification, levelOfCommunication and age.
     */
    public void fillJobApplicationDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        applicant.setFirstName(sc.nextLine());
        System.out.println("Enter your last name:");
        applicant.setLastName(sc.nextLine());
        System.out.println("Enter your phone number:");
        applicant.setPhoneNumber(sc.nextLine());
        System.out.println("Enter your email id:");
        applicant.setEmailID(sc.nextLine());
        System.out.println("Do you have any work experience:");
        applicant.setWorkExperience(sc.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Enter your educational qualification:");
        applicant.setEducationQualification(sc.nextLine());
        System.out.println("Enter your level of communication skills:");
        assignLevelOfCommunicationSkills(sc.nextLine());
        System.out.println("Enter your age:");
        applicant.setAge(sc.nextInt());        
    }

    /**
     * This method is used to set levelOfCommunication by checking the argument 
     * "level" with the enum CommunicationSkill. If match found then assign the
     * value to the levelOfCommunication of applicant.
     * @param level 
     */
    private void assignLevelOfCommunicationSkills(String level) {
        applicant.levelOfCommunication = CommunicationSkill.valueOf(level.toUpperCase()).getLevelOfCommincationSkills();
    }

    /**
     * This method produces the job details by checking the conditions. 
     * (find detail description in the document).
     */
    public void produceTheJobDescriptionForApplicant() {
        
        //Condition 1:
        if (applicant.educationQualification.equals("masters")
                && applicant.levelOfCommunication <= 2
                && applicant.age >= 25 && applicant.isWorkExperience()) {
            job = new Job(1100,
                    "Senior Software Engineer",
                    "Masters",
                    new Date("09/16/2017"),
                    new Date("9/20/2017"),
                    50000,
                    "You have to develop software solutions and supervise the team under you",
                    supervisor = new Supervisor("John", "Ryan", "4125200909", "ryant@gmail.com"));
        } 
        //Condition 2:
        else if (applicant.educationQualification.equals("masters")
                && applicant.levelOfCommunication <= 3
                && applicant.age >= 23 && applicant.isWorkExperience()) {
            job = new Job(1103,
                    "Software Engineer",
                    "Bachelors",
                    new Date("8/27/2017"),
                    new Date("9/14/2017"),
                    50000,
                    "You have to develop software solutions",
                    supervisor = new Supervisor("Feon", "Tim", "5125280229", "timf@gmail.com"));

        } 
        //Condition 3:
        else if ((applicant.educationQualification.equals("masters")
                || applicant.educationQualification.equals("bachelors"))
                && applicant.levelOfCommunication <= 3
                && applicant.age >= 22 && applicant.isWorkExperience()) {
            job = new Job(1200,
                    "Back end Developing",
                    "Bachelors",
                    new Date("9/10/2017"),
                    new Date("9/13/2017"),
                    50000,
                    "Have to write the code for server operations and data bases",
                    supervisor = new Supervisor("William", "Lee", "3206300980", "leew@gmail.com"));

        } 
        //Condition 4:
        else if (applicant.educationQualification.equals("bachelors")
                && applicant.levelOfCommunication <= 3
                && applicant.age >= 22 && applicant.isWorkExperience()) {
            job = new Job(1300,
                    "front end",
                    "Bachelors",
                    new Date("9/13/2017"),
                    new Date("9/20/2017"),
                    50000,
                    "Have to write the code for front end and work with design aspects",
                    supervisor = new Supervisor("David", "Martin", "4126290129", "martindav@gmail.com")
            );
        } 
        //Condition 5:
        else if (applicant.educationQualification.equals(
                "bachelors")
                && applicant.levelOfCommunication == 5
                && applicant.age > 20) {
            job = new Job(1350,
                    "tech support",
                    "Bachelors",
                    new Date("9/16/2017"),
                    new Date("9/20/2017"),
                    50000,
                    "Have to collect the required documents and answer the call of customers",
                    supervisor = new Supervisor("Jose", "Ellizibeth", "3124482379", "s527890@gmail.com"));

        } 
        // Condition 6:
        else {
            System.out.println("Not Eligible to apply for the jobs that are currently available");
        }
    }

    /**
     * This method checks the educationQualification of the applicant. 
     * It returns true if the educationQualification is either bachelors or 
     * masters, otherwise returns false
     * @return a boolean value
     */
    @Override
    public boolean checkQualification() {
        return applicant.educationQualification.equals("bachelors")
                || applicant.educationQualification.equals("masters");
    }

    /**
     * This method checks the age of the applicant. Returns true if the age is 
     * greater than 20, false otherwise
     * @return a boolean value
     */
    @Override
    public boolean checkAge() {
        return applicant.age > 20;
    }

    /**
     * This method verifies the back ground of the applicant by prompting some
     * questions. If the answer to any one of the questions is yes then it 
     * returns "You are not eligible to apply", otherwise it returns "You are 
     * eligible to apply". (find detail description in the document).
     * @return a value of type String
     */ 
    @Override
    public String verifyBackGround() {
        Scanner sc = new Scanner(System.in);
        int quit = 0;
        System.out.println("Have you ever been convicted for felony:");
        quit = sc.nextLine().equalsIgnoreCase("yes") ? 1 : quit;
        System.out.println("Are you a social worker part of criminal justice system:");
        quit = sc.nextLine().equalsIgnoreCase("yes") ? 1 : quit;
        System.out.println("Have you ever charged for traffic violations:");
        quit = sc.nextLine().equalsIgnoreCase("yes") ? 1 : quit;      
        return quit != 0 ? "You are not eligible to apply" : "You are eligible to apply";
    }

    /**
     * This method returns true if the output from the verifyBackGround() 
     * is "You are eligible to apply", otherwise returns false
     * @return a boolean value
     */
    @Override
    public boolean haveAGoodBackGround() {
        return verifyBackGround().equals("You are eligible to apply");
    }

    /**
     * This method checks the availability of the job by checking the current 
     * date with the closingDate of job. It returns a string "The job is still
     * open, you can apply for this job" if the current date is before the 
     * closingDate, otherwise it returns a string "The job dead line is closed 
     * you cannot apply for it".
     * @return a String value
     */    
    @Override
    public String checkAvailabilityOfJob() {
        return job.openingDate.before(job.closingDate)
                ? "\nYou are eligible to apply for this job\n" + job.printJobDetails() 
                + "\nThe job is still open, you can apply for this job\n"
                : "\nThe job dead line is closed you cannot apply for it";
    } 

    /**
     * toString method to print the objects of applicant, job, supervisor.
     * @return a String value
     */
    @Override
    public String toString() {
        return applicant.toString() + "\n"
                + job.toString() + "\n"
                + "Details of supervisor for this job: \n"
                + "Name of the supervisor: " + this.supervisor.getFullName() 
                + "\nContact Details: " 
                + this.supervisor.getEmailID()+", "+ this.supervisor.getFormattedPhoneNumber(this.supervisor.phoneNumber);
    }
}
