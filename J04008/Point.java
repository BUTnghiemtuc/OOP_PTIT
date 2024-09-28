/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04008;

/**
 *
 * @author dkmme
 */
public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double GetX(){
        return this.x;
    }
    public double GetY() {
        return this.y;
    }
    
    public double distance(Point A) {
        return Math.sqrt(Math.pow(this.x - A.GetX(), 2) + Math.pow(this.y - A.GetY(), 2));
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
