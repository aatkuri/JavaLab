/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam2a;

/**
 *
 * @author Ashok Atkuri
 */
public class Ghost extends GameCharacter {

    public Ghost(int life, String name, int points) {
        super(life, name, points);
    }

    @Override
    public String printState() {
        if(super.getLife() < 1)
            return super.getName() + " dies.";
        return super.getName() + " lives.";
    }   
}
