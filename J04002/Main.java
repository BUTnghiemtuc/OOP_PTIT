/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04002;

/**
 *
 * @author dkmme
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
        double dai = in.nextDouble();
        double rong = in.nextDouble();
        String mau = in.next();
            
        if(dai > 0 && rong > 0) {
            HCN rect = new HCN(dai, rong, mau);
            System.out.println(rect);
        }
        else System.out.println("INVALID");
    }
}
