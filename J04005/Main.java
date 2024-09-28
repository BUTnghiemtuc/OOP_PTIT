/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04005;

/**
 *
 * @author dkmme
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String Ten = in.nextLine();
        String NS = in.next();
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        
        ThiSinh A = new ThiSinh(Ten, NS, a, b, c);
        System.out.println(A);
    }
}
