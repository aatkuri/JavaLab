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
public class TerrainBlock {

    private boolean powerPallet;
    private GameCharacter gameCharacter;

    public TerrainBlock(boolean powerPallet, GameCharacter gameCharacter) {
        this.powerPallet = powerPallet;
        this.gameCharacter = gameCharacter;
    }
    
    public int getTerrainPoints(){
        if(this.powerPallet)
            return 100;
        return 10;            
    }
    
    public int getPoints(){
        if(this.gameCharacter != null)
            return this.gameCharacter.getPoints();
        return this.getTerrainPoints();
    }
    
    public boolean containsGhost(){
        if(this.gameCharacter != null)
            return true;
        return false;
    }

    public boolean isPowerPallet() {
        return powerPallet;
    }

    public GameCharacter getGameCharacter() {
        return gameCharacter;
    }

    public void setGameCharacter(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }
}
