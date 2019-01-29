/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Class Route.
 * @author Ashok Atkuri
 */
public class Route {

    private String source;
    private String destination;
    private String departingDate;
    private String returningDate;

    /**
     * Parameterized Constructor of Route.  
     * @param source Value to initialize the source attribute of type String.
     * @param destination Value to initialize the destination attribute of type String.
     * @param departingDate Value to initialize the departingDate attribute of type String.
     * @param returningDate Value to initialize the returningDate attribute of type String.
     */
    public Route(String source, String destination, String departingDate,
            String returningDate) {
        this.source = source;
        this.destination = destination;
        this.departingDate = departingDate;
        this.returningDate = returningDate;
    }

    /**
     * Gets the value of Source attribute.
     * @return String value of attribute source.
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of source.
     * @param source Value to set the source.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Gets the value of destination attribute.
     * @return String value of attribute destination.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of destination.
     * @param destination Value to set the destination.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Gets the value of departingDate attribute.
     * @return String value of attribute departingDate.
     */
    public String getDepartingDate() {
        return departingDate;
    }

    /**
     * Sets the value of departingDate.
     * @param departingDate Value to set the departingDate.
     */
    public void setDepartingDate(String departingDate) {
        this.departingDate = departingDate;
    }

    /**
     * Gets the value of returningDate attribute.
     * @return String value of attribute returningDate.
     */
    public String getReturningDate() {
        return returningDate;
    }

    /**
     * Sets the value of returningDate.
     * @param returningDate Value to set the returningDate.
     */
    public void setReturningDate(String returningDate) {
        this.returningDate = returningDate;
    }

    /**
     * Method to return the day of week based on given string.
     * @param date String Value to calculate date. 
     * @return DayOfWeek value calculated from the string value.  
     */
    public DayOfWeek getDay(String date) {
        LocalDate localDate = LocalDate.of(Integer.parseInt(date.substring(6, 10)),
                Integer.parseInt(date.substring(0, 2)),
                Integer.parseInt(date.substring(3, 5)));

        //Getting the day of week for a given date
        return localDate.getDayOfWeek();
    }

    /**
     * Method to return if either returningDate or departingDate is weekend.
     * @return boolean value if either returningDate or departingDate is weekend.
     */
    public boolean isWeekend() {
        DayOfWeek returnDate = getDay(this.returningDate);
        DayOfWeek departDate = getDay(this.departingDate);
        boolean isWeekend;

        isWeekend = checkDay(departDate);
        if(!isWeekend)
            isWeekend = checkDay(returnDate);
        
        return isWeekend;
    }
    
    private boolean checkDay(DayOfWeek day)
    {
        switch (day) {
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
                return true;
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return "From : " + this.source + ", To : " + this.destination +
               ", Departing On : " + this.departingDate +
               ", Returning On : " + this.returningDate;
    }
}
