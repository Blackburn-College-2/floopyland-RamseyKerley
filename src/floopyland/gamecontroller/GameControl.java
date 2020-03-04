/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floopyland.gamecontroller;

import com.pauliankline.floopyconnector.*;
import floopyland.hero.*;
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

        ArrayList<BaseHero> heroArray = new ArrayList<>();
        heroArray.add(new Healers(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight()))));
        heroArray.add(new Tankers(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight()))));
        heroArray.add(new Ninjas(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight()))));
        heroArray.add(new Thieves(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight()))));
        heroArray.add(new LoopMan(arg0, new Point(rand.nextInt(arg0.getWidth()), rand.nextInt(arg0.getHeight()))));

        return heroArray;
    }

    @Override
    public GameBoard mkGameBoard() {
        GameBoard gB = new GameBoard();
        return gB;
    }

}
