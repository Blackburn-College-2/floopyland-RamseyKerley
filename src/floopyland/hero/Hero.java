/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floopyland.hero;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author ramsey.kerley
 */
public class Hero extends BaseHero {

    public Hero(GameBoard game, Point place) {
        super(game, place);
        boolean addHero = game.getGameSquare(place).addHero(this);
        //System.out.println(addHero);

    }

    /**
     * Checks the surrounding squares to see if there are other heros around.
     *
     * @return boolean
     */
    @Override
    public boolean isInBattle() {
        try{
        for (int i = clamp(location.x - 1, 0, gameboard.getWidth() - 1); i <= location.x + 1; i++) {
            for (int j = clamp(location.y - 1, 0, gameboard.getHeight() - 1); j <= location.y + 1; j++) {
                if (super.gameboard.getGameSquare(new Point(i, j)).heroesArePresent()) {
                    if ((i == location.x && j == location.y) && super.gameboard.getGameSquare(new Point(i, j)).getHeroesPresent().size() == 1) {
                       
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        }catch(Exception e){
            
        }
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public String enemy() {
        return "hero";
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void gameTickAction(long arg0) {
        System.out.println(this + "but " + isInBattle());
        move(gameboard);

    }

    /**
     *
     */
    @Override
    protected void die() {
        if (isDead()) {
            super.gameboard.getGameSquare(location).removeHero(this);
            location = null;
        }
    }

    /**
     * if the hero's health is lower than 0
     *
     * @return boolean
     */
    @Override
    public boolean isDead() {
        return super.hp <= 0;
    }

    /**
     * This take the hero off the board and place it in a new location in one of
     * the cardinal directions around it's current location.
     *
     * @param gb
     * @return the new location
     */
    public void move(GameBoard gb) {
        super.gameboard.getGameSquare(this.location).removeHero(this);
        Random rand = new Random();
        int x = rand.nextInt(4);

        if (location.x == gb.getWidth() - 1) {
            location.x -= 1;
        } else if (location.x == 0) {
            location.x += 1;

        } else if (location.y == gb.getHeight() - 1) {
            location.y -= 1;
        } else if (location.y == 0) {
            location.y += 1;
        } else if (x == 0) {
            location.x -= 1;
        } else if (x == 1) {
            location.y += 1;
        } else if (x == 2) {
            location.y -= 1;
        } else if (x == 3) {
            location.x += 1;
        }
        super.gameboard.getGameSquare(location).addHero(this);

    }

    public void fight() {

    }

    public int clamp(int val, int min, int max) {
        return Math.max(min, Math.min(max, val));
    }

}
