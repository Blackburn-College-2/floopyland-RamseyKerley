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
public class Soldiers extends Hero {

    /**
     *
     * @param gameboard
     * @param place
     */
    public Soldiers(GameBoard gameboard, Point place) {
        super(gameboard, place);
        super.name = "John Fortnight";
        super.color = "purple";
    }
}
