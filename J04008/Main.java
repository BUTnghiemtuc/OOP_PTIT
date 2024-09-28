/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-- > 0) {
            double x1 = in.nextDouble();
            double y1 = in.nextDouble();
            
            double x2 = in.nextDouble();
            double y2 = in.nextDouble();
            
            double x3 = in.nextDouble();
            double y3 = in.nextDouble();
            
            Point A = new Point(x1, y1);
            Point B = new Point(x2, y2);
            Point C = new Point(x3, y3);
            
            if(isCollinear(A, B, C)) {
                System.out.println("INVALID");
            }
            else {
                System.out.printf("%.3f\n", A.distance(B) + A.distance(C) + B.distance(C));
            }
        }
    }
    
    public static boolean isCollinear(Point A, Point B, Point C) {
        double area = A.GetX() * (B.GetY() - C.GetY()) + B.GetX() * (C.GetY() - A.GetY()) + C.GetX() * (A.GetY() - B.GetY());
        return area == 0;
    }
}
