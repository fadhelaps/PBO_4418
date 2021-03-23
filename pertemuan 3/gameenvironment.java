/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenvironment;

/**
 *
 * @author adrian
 */
public class gameenvironment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gameplayer coba = new gameplayer();
        coba.setPotition(30,20);
        coba.run(60);
        coba.run();
    }
    
}