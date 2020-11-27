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
public class Bola extends BangunRuang{
    @Override
    public double volume() {
        double volume = Math.pow(r, 3) * PI * 1.3;
        System.out.println("Volume : " + volume);
        return volume;
    }


}
