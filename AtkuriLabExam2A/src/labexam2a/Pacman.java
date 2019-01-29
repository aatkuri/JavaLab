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
public class Pacman extends GameCharacter {

    private boolean invincible;

    public Pacman() {
        super(1, "Pacman", 0);
    }

    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }

    public int getFinalScore() throws DeadPacmanException {
        if (super.getLife() <= 0) {
            throw new DeadPacmanException();
        }
        return 1000 + super.getPoints();
    }

    @Override
    public String printState() {
        try{
            return "Pacman wins: " + this.getFinalScore() +" points.";
        }catch(DeadPacmanException ex){
            return "Pacman dies.";
        }
    }
}
