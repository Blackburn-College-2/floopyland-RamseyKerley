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


/**
 *
 * @author ramsey.kerley
 */
public class GameControl extends GameController {

    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard arg0, int arg1) {
        System.out.println("Rzn");
 

        
        ArrayList<BaseHero> heroArray = new ArrayList<>();
        for (int i = 0; i < arg1; i++) {
            heroArray.add(new Healers(arg0, new Point(0, i)));
        }
        return heroArray;
    }

    @Override
    public GameBoard mkGameBoard() {
        GameBoard gB = new GameBoard();
        return gB;
    }

}
