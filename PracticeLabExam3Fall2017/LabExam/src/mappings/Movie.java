/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

/**
 *
 * @author Instructor
 */
public class Movie {
    
    private String revenue;//revenue of the movie
    private Person director;//director of the movie
    private String movieReleasedYear;//release year of the movie

    public Movie(String revenue, Person director, String movieReleasedYear) {
        this.revenue = revenue;
        this.director = director;
        this.movieReleasedYear = movieReleasedYear;
    }

    public String getRevenue() {
        return revenue;
    }

    public Person getDirector() {
        return director;
    }

    public String getMovieReleasedYear() {
        return movieReleasedYear;
    }
}
