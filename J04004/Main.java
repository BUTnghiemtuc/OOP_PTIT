/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04004;

/**
 *
 * @author dkmme
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        
        PS x = new PS(a, b);
        PS y = new PS(c, d);
        
        PS ans = new PS();
        ans = PS.sum(x, y);
        System.out.println(ans);
    }
}
