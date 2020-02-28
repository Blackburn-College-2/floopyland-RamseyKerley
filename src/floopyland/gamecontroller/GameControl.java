/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floopyland.gamecontroller;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameBoard;
import com.pauliankline.floopyconnector.GameController;
import floopyland.hero.Healers;
import floopyland.hero.Ninjas;
import floopyland.hero.Soldiers;
import floopyland.hero.Tankers;
import floopyland.hero.Thieves;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author ramsey.kerley
 */
public class GameControl extends GameController {
    
    

    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard arg0, int arg1) {
        Point p = new Point(arg1, arg1); 
        
        BaseHero h = new Healers(arg0,p);
        BaseHero t = new Tankers(arg0,p);
        BaseHero th = new Thieves(arg0,p);
        BaseHero n = new Ninjas(arg0,p);
        BaseHero s = new Soldiers(arg0,p);
        ArrayList<BaseHero> heroArray = new ArrayList<>();
        heroArray.add(h);
        heroArray.add(t);
        heroArray.add(th);
        heroArray.add(n);
        heroArray.add(s);
        return heroArray;
    }

    @Override
    public GameBoard mkGameBoard() {
        GameBoard gB = new GameBoard(10,5);
        return gB;
    }
    
}
