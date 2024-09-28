/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05081;

/**
 *
 * @author dkmme
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        List<Hang> list = new ArrayList<>();
        int cnt = 1;
        
        while(t-- > 0) {
            in.nextLine();
            String ten = in.nextLine();
            String DV = in.next();
            int Gm = in.nextInt();
            int Gb = in.nextInt();
            
            Hang A = new Hang(cnt, ten, DV, Gm, Gb);
            list.add(A);
            ++cnt;
        }
        
        Collections.sort(list, new Comparator<Hang>() {
            @Override
            public int compare(Hang h1, Hang h2) {
                if (h1.GetLN() != h2.GetLN()) {
                    return Integer.compare(h2.GetLN(), h1.GetLN());
                }
                return h1.GetMa().compareTo(h2.GetMa());
            }
        });
        
        for(Hang it : list) {
            System.out.println(it);
        }
    }  
}
