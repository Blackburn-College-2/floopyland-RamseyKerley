/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floopyland.gamecontroller;

import com.pauliankline.floopyconnector.*;
import floopyland.hero.*;
import floopyland.items.*;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ramsey.kerley
 */
public class GameControl extends GameController {

    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard arg0, int arg1) {
        // System.out.println("Rzn");
          Random rand = new Random();
        ArrayList<BaseHero> heroOnBoard = new ArrayList<>();
        for (int i = 0; i < arg1; i++) {
            heroOnBoard.add(randomHero(arg0));
        }
 
        
         
        return heroOnBoard;
    }

    @Override
    public GameBoard mkGameBoard() {
        GameBoard gB = new GameBoard();
        return gB;
    }

    /**
     * this makes a random hero and returns it
     *
     * @param arg0
     * @return BaseHero
     */
    public BaseHero randomHero(GameBoard arg0) {
        Random rand = new Random();
        int x = rand.nextInt(6);

        switch (x) {
            case 0:
                return new Healers(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight())));
            case 1:
                return new Tankers(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight())));
            case 2:
                return new Ninjas(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight())));
            case 3:
                return new Thieves(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight())));
            case 4:
                return new LoopMan(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight())));
            case 5:
                return new Soldiers(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight())));
            default:
                break;
        }
        return null;
    }
    
    
    public BoardItems randomItems() {
        Random rand = new Random();
        int x = rand.nextInt(4);

        switch (x) {
            case 0:
                return new HealthPotion();
            case 1:
                return new Tome();
            case 2:
                return new ExtraLife();
            case 3:
                return new StrengthPotion();
            default:
                break;
        }
        return null;
    }

}


