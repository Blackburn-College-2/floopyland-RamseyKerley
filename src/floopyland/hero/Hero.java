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
        boolean addHero = game.getGameSquare(place).addHero(this);
        //System.out.println(addHero);

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
        if(isDead()){
        super.location = null;
        }
    }

    @Override
    public boolean isDead() {
        return super.hp <= 0;
    }
    
    /**
     * This take the hero off the board and place it in a new location in one of the cardinal directions
     * around it's current location.
     * @param gb
     * @return the new location
     */
    public Point move(GameBoard gb){
       super.gameboard.getGameSquare(this.location).removeHero(this);
       while(!isInBattle()){
           if(location.x == gb.getWidth() ){
               
               if( location.y == gb.getHeight()){
                   
               }
           
           }else if(Math.random()*3 +1 == 1){
               
           }else if(Math.random()*3 +1 == 2){
               
           }else if(Math.random()*3 +1 == 3){
               
           }else if(Math.random()*3 +1 == 4){
               
           }
               
           
           }
       super.gameboard.getGameSquare(this.location).addHero(this);
       return new Point();
    }

}
