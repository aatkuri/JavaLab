/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam2a;

/**
 *
 * @author Ashok Atkuti
 */
public abstract class GameCharacter {
    private int life;
    private String name;
    private int points;

    public GameCharacter(int life, String name, int points) {
        this.life = life;
        this.name = name;
        this.points = points;
    }

    public int getLife() {
        return life;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    public abstract String printState();
}
