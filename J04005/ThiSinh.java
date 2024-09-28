/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04005;

/**
 *
 * @author dkmme
 */
public class ThiSinh {
    private String name;
    private String Ns;
    private double d1;
    private double d2;
    private double d3;
    
    
    public ThiSinh() {
        name = "";
        Ns = "";
        d1 = d2 = d3 = 0;
    }
    
    public ThiSinh(String name, String Ns, double a, double b, double c) {
        this.name = name;
        this.Ns = Ns;
        this.d1 = a;
        this.d2 = b;
        this.d3 = c;
    }
    
    public String toString(){
        double sum = d1 + d2 + d3;
        return String.format("%s %s %.1f\n", name, Ns, sum);
    }
}
