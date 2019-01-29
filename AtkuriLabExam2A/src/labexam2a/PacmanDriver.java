/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam2a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ashok Atkuri;
 */
public class PacmanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner stdin = new Scanner(new File("PacmanMaze.txt"));
        
        while (stdin.hasNext()) {
            ArrayList<TerrainBlock> terrain = new ArrayList<TerrainBlock>();
            Pacman pacman = new Pacman();
            String next = stdin.nextLine();
            for (int i = 0; i < next.length(); i++) {
                initialiseTerrainBlock(next.charAt(i), terrain);
            }

            for (TerrainBlock t : terrain) {
                pacman.setPoints(pacman.getPoints() + t.getPoints());
                if (t.isPowerPallet()) {
                    pacman.setInvincible(true);
                }
                if (t.containsGhost()) {
                    if (!pacman.isInvincible()) {
                        pacman.setLife(0);
                        t.setGameCharacter(pacman);
                    }
                    if (pacman.isInvincible()) {
                        t.getGameCharacter().setLife(t.getGameCharacter().getLife() - 1);
                    }
                }
            }

            if (pacman.getLife() > 0) {
                TerrainBlock lastTerrain = terrain.get(terrain.size() - 1);
                lastTerrain.setGameCharacter(pacman);
            }
            
            System.out.println(pacman.printState());
            System.out.println("\n");
        }

    }

    private static void initialiseTerrainBlock(char c, ArrayList<TerrainBlock> terrain) {
        switch (c) {
            case '*':
                terrain.add(new TerrainBlock(false, null));
                break;
            case 'O':
                terrain.add(new TerrainBlock(true, null));
                break;
            case 'B':
                terrain.add(new TerrainBlock(false, new Ghost(2, "Blinky", 40)));
                break;
            case 'Y':
                terrain.add(new TerrainBlock(false, new Ghost(2, "Pinky", 30)));
                break;
            case 'I':
                terrain.add(new TerrainBlock(false, new Ghost(1, "Inky", 20)));
                break;
            case 'C':
                terrain.add(new TerrainBlock(false, new Ghost(1, "Clyde", 10)));
                break;
        }
    }

}
