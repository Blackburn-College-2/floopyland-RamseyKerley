/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floopyland.hero;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 *
 * @author ramsey.kerley
 */
public class Tankers extends Hero{

    /**
     *
     * @param gameboard
     * @param place
     */
    public Tankers(GameBoard gameboard, Point place){
        super(gameboard, place);
        super.color = "orange";
        super.hp = 1500+1;
        super.name = "Rhino";
    }
}
