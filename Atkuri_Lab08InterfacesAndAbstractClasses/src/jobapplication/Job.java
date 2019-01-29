/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

import java.util.Date;

/**
 * This class contains the details about the Job
 * @author Ashok Atkuri
 */
public class Job {  
    /**
     * The integer value that store the ID of the job
     */
    int jobID;
    /**
     * The string value that stores the title of the job
     */
    String jobTitle;
    /**
     * The string value that stores the minimum required degree for the job
     */
    String minimumRequiredDegree;
    /**
     * The variable of type Date that stores the opening date of the job
     */
    Date openingDate;
    /**
     * The variable of type Date that stores the closing date of the job
     */
    Date closingDate;
    /**
     * The double value that stores the salary for the job
     */
    double salary;
    /**
     * The string value that stores the responsibilities of the job
     */
    String responsibilities;
    /**
     * Instance variable of type Supervisor
     */
    Supervisor supervisor;

    /**
     * Eight argument constructor to initialize the instant variables
     * @param jobID contains the ID of the job
     * @param jobTitle contains the title of the job
     * @param minimumRequiredDegree contains the minimum required degree of 
     * the job contains the opening date for the job
     * @param openingDate
     * @param closingDate contains the closing date of the job
     * @param salary contains the salary of the job
     * @param responsibilities contains the responsibilities of the job
     * @param supervisor the supervisor object
     */
    public Job(int jobID, String jobTitle, String minimumRequiredDegree, Date openingDate, Date closingDate, double salary, String responsibilities, Supervisor supervisor) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.minimumRequiredDegree = minimumRequiredDegree;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.supervisor = supervisor;
    }

    /**
     * This method returns a statement like "The job details are as follows: " 
     * and invoke the toString() to print the details
     * @return a value of type String
     */
    public String printJobDetails(){
        return "The job details are as follows:\n" + this.toString();
    }

    /**
     * This method returns the details of the job which consists of job ID, 
     * job title, minimum required degree, opening date, closing date, salary, 
     * responsibilities and supervisor details
     * @return a value of type String
     */
    @Override
    public String toString() {
        return "JobID: " + this.jobID
                + "\nJobTitle: " + this.jobTitle
                + "\nMinimumRequiredDegree: " + this.minimumRequiredDegree
                + "\nOpeningDate: " + this.openingDate
                + "\nClosingDate: " + this.closingDate
                + "\nSalary: " + this.salary
                + "\nResponsibilities of the job includes:" + this.responsibilities
                + this.supervisor.toString();
    }
}
