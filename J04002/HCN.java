/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04002;

/**
 *
 * @author dkmme
 */
public class HCN {
    private double dai;
    private double rong;
    private String mau;
    public HCN() {
        this.dai = this.rong = 1;
        this.mau = "";
    }
    
    public HCN(double dai, double rong, String mau) {
        this.dai = dai;
        this.rong = rong;
        this.mau = mau;
    }
    
    public double DT() {
        return this.dai * this.rong;
    }
    public double CV() {
        return 2 * (dai + rong);
    }
    
    public String formatMau() {
        return this.mau.substring(0, 1).toUpperCase() + this.mau.substring(1).toLowerCase();
    }
    
    public String toString() {
        return String.format("%d %d %s", (int)CV(), (int)DT(), formatMau());
    }
}
