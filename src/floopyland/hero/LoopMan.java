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
public class LoopMan extends Hero {
    public LoopMan(GameBoard gameboard, Point place){
        super(gameboard, place);
        super.color = "https://thumbs.gfycat.com/DependableWhisperedEagle-size_restricted.gif";
        super.name = "Hit hit";
    }
}
