/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04001;

/**
 *
 * @author dkmme
 */
public class point {
    private double x;
    private double y;
    
    public point() {
        this.x = 1;
        this.y = 1;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static double distance(point p1, point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() -p2.getY(), 2));
    }
    
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
