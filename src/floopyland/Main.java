/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floopyland;

import com.pauliankline.floopyconnector.Floopy;
import floopyland.gamecontroller.GameControl;

/**
 * I believe it will take a little over 12 hours to finish the project
 *
 * @author Ramsey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Floopy floop = new Floopy(new GameControl());
        floop.begin(5);
    }
    
}
