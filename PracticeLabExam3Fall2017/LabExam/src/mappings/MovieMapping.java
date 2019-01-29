/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Instructor
 */
public class MovieMapping implements Iterable {

    private HashMap<Person, LinkedList<Movie>> actorsActed;

    public MovieMapping() {
        this.actorsActed = new HashMap<>();
    }

    public void addMovie(Person person, Movie movie) {
        if (actorsActed.containsKey(person)) {
            if (actorsActed.isEmpty()) {
                actorsActed.put(person, new LinkedList<>());
                actorsActed.get(person).add(movie);
            } else {
                actorsActed.get(person).add(movie);
            }
        } else {
            actorsActed.put(person, new LinkedList<>());
            actorsActed.get(person).add(movie);
        }
    }

    //Assume a director only directs one movie in a given year.
    public int findNumberOfActors(String directorName, String releasedYear, String revenue) {
        int noOfActors = 0;
        
        for (Person p : actorsActed.keySet()) {
            for (Movie m : actorsActed.get(p)) {
                if (m.getMovieReleasedYear().equals(releasedYear) 
                      && m.getDirector().getName().equals(directorName)
                      && m.getRevenue().equals(revenue)) {
                    noOfActors += 1;
                }
            }
        }
        
        return noOfActors;
    }

    public Set<String> findRevenuesMadeByDirector(String directorName) {
        HashSet<String> revSet = new HashSet<>();
        for (LinkedList<Movie> m : actorsActed.values()) {
            for (Movie mm : m) {
                if (mm.getDirector().getName().equals(directorName)) {
                    revSet.add(mm.getRevenue());
                }
            }
        }
        return revSet;
    }

    public List<Person> findActorsActed(String revenue, String releasedYear) {
        List<Person> actorList = new ArrayList<>();

        for (Person p : actorsActed.keySet()) {
            for (Movie m : actorsActed.get(p)) {
                if (m.getMovieReleasedYear().equals(releasedYear)) {
                    if (m.getRevenue().equals(revenue)) {
                        actorList.add(p);
                    }
                }
            }
        }
        return actorList;
    }

    public HashMap<Person, LinkedList<Movie>> getActorsActed() {
        return this.actorsActed;
    }

    @Override
    public Iterator iterator() {
        return this.actorsActed.entrySet().iterator();
    }

    public int size() {
        return this.actorsActed.size();
    }

}
   