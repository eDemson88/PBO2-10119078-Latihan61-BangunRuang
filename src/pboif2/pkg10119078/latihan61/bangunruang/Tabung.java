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
public class Tabung extends BangunRuang{

    protected int t;
    
    public void setT(int t){
        this.t=t;
    }
    public int getT(){
        return t;
    }
    @Override
    public double volume() {
       double volume = (PI * Math.pow(r,2)) * t;
        System.out.println("Volume : " + volume);
        return volume;
    }
    
}
