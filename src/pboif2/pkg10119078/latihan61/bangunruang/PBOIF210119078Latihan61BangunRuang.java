/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan61.bangunruang;


/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola();
        b.setR(7);
        b.volume();
        
        Tabung t = new Tabung();
        t.setR(10);
        t.setT(21);
        t.volume();
        
        Kerucut k = new Kerucut();
        k.setR(14);
        k.setT(9);
        k.volume();
    }
    
}
