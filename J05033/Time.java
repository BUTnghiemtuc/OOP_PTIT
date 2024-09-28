/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05033;

/**
 *
 * @author dkmme
 */
public class Time {
    private int gio;
    private int phut;
    private int giay;
    
    public int Get1() {
        return gio;
    }
    public int Get2() {
        return phut;
    }
    public int Get3() {
        return giay;
    }
    
    public Time(int gio, int p, int giay) {
        this.gio = gio;
        this.phut = p;
        this.giay = giay;
    }
    

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}
