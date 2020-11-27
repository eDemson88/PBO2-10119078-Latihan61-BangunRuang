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
public abstract class BangunRuang {
    protected  int r;
    public final double PI=3.14;

    
    public int getR(){
        return r;
    }
    
    public void setR (int r){
        this.r=r;
    }
    
    public abstract double volume();
}
