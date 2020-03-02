/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floopyland.hero;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 *
 * @author ramsey.kerley
 */
public class Hero extends BaseHero {

    public Hero(GameBoard game, Point place) {
        super(game, place);
        super.color = "blue";
        boolean addHero = game.getGameSquare(place).addHero(this);
        System.out.println(addHero);

    }

    @Override
    public boolean isInBattle() {
        return false;
    }

    @Override
    public String enemy() {
        return "hero";
    }

    @Override
    public void gameTickAction(long arg0) {
        
    }

    @Override
    protected void die() {
      
        //super.location = null;
    
    }

    @Override
    public boolean isDead() {
        //return super.hp <= 0;
        return false;
    }

}
