/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

/**
 * This ENUM contains the communication proficiency levels with a value 
 * assigned to it.
 * @author Ashok Atkuri
 */
public enum CommunicationSkill {

    /**
     * level of communication proficiency with value 1
     */
    EXCELLENT(1),

    /**
     * level of communication proficiency with value 2
     */
    PROFICIENT(2),

    /**
     * level of communication proficiency with value 3
     */
    KNOWLEDGEABLE(3),

    /**
     * level of communication proficiency with value 4
     */
    AVERAGE(4),

    /**
     * level of communication proficiency with value 5
     */
    FAMILIAR(5);
    
    /**
     * specifies the level in communication for the constants
     */
    private int levelOfCommincationSkills;
    
    private CommunicationSkill(int levelOfCommincationSkills) {
        this.levelOfCommincationSkills = levelOfCommincationSkills;
    }

    /**
     * This getter method is used to access the level of communication skills
     * @return an integer value
     */
    public int getLevelOfCommincationSkills() {
        return levelOfCommincationSkills;
    }
}
