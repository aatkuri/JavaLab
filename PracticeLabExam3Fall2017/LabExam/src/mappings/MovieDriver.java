/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class MovieDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        //Create a Scanner object to read Actor and movie details from "input.txt" file.
        Scanner stdin = new Scanner(new File("input.txt"));

        //Create an object of MovieMapping and name it as "directed".
        MovieMapping directed = new MovieMapping();
        String name = null;
        String[] values = null;
        Movie movie = null;

        //Declare an object for Person, name it as "actor" and initialize it to null
        Person actor = null;

        //while input.txt has more data(While loop starts here) {
        while (stdin.hasNext()) {
            //Read the first line,If the passed type is "Actor" then, read in the "name".
            if (stdin.nextLine().equals("Actor")) {
                name = stdin.nextLine();
                //Create an object for Person with above read value and assign it to "actor" variable.
                actor = new Person(name);
            } else {
                //Else, read the next line, It will be in the following order: revenue, director name and moviereleaseyear separated by '-' separator.
                values = stdin.nextLine().split("-");
                // With above read values, create an object Movie and name it a "movie".
                movie = new Movie(values[0], new Person(values[1]), values[2]);
                //Invoke addMovie() on "directed" object and add the "actor","movie".
                directed.addMovie(actor, movie);
            }
            // } (while loop ends here)
        }

        // Invoke findNumberOfActors() on "directed" object and find
        // number of actors acted with "Sanjay Leela Bansali" in the year "2015", with revenue "40k"
        System.out.println("actors acted with \"Sanjay Leela Bansali\" in the year \"2015\", with revenue \"40k\": "
                            + directed.findNumberOfActors("Sanjay Leela Bansali", "2015", "40k"));
        // Invoke findRevenuesMadeByDirector() on "directed" object and find
        // Revenues made by "Pete Docter".
        System.out.println("Revenues made by \"Pete Docter\": " +directed.findRevenuesMadeByDirector("Pete Docter"));
        // Invoke findActorsActed() on "directed" object and find
        // actor acted for "130k" in "2016"
        System.out.println("actor acted for \"130k\" in \"2016\": " +directed.findActorsActed("130k", "2016"));
        // Print size of the hash map.
        System.out.println("size of the hash map: "+directed.size());
    }

}
