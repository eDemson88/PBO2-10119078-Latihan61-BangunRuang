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
public class Kerucut extends BangunRuang{

    protected int t; 
    
    public void setT(int t){
        this.t=t;
    }
    public int getT(){
        return t;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double volume() {
       double volume = ((PI * Math.pow(r,2)) * t)  / 3;
        System.out.println("Volume : " + volume);
        return volume;
    }
    
}
