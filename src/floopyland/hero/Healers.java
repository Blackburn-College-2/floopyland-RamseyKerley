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
public class Healers extends Hero{

    /**
     *
     * @param game
     * @param place
     */
    public Healers(GameBoard game, Point place){
        super(game, place);
        super.color = "red";
        super.name = "Healer Man";
        
    }
}
