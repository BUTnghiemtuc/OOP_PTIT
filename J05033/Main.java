/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05033;

/**
 *
 * @author dkmme
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        List<Time> list = new ArrayList<>();
        
        while(t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            Time A = new Time(a, b, c);
            list.add(A);
        }
        
        Collections.sort(list, new Comparator<Time>() {
            @Override
            public int compare(Time a, Time b) {
                if (a.Get1() != b.Get1()) {
                    return Integer.compare(a.Get1(), b.Get1());
                }
                if (a.Get2() != b.Get2()) {
                    return Integer.compare(a.Get2(), b.Get2());
                }
                return Integer.compare(a.Get3(), b.Get3());
            }
        });
        
        for (Time it : list) {
            System.out.println(it);
        }
    }
}
