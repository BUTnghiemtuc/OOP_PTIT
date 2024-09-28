/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J02023;

/**
 *
 * @author dkmme
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        if(s > 9 * n ) {
            System.out.println("-1 -1");
           
        }
        
        else {
            int[] a = new int[n];
            int tmp = s;
            for(int i = n - 1; i >= 0; i--) {
                if(tmp > 9) {
                    a[i] = 9;
                    tmp -= 9;
                }
                else if(tmp != 0) {
                    a[i] = tmp;
                    tmp = 0;
                }
                else {
                    a[i] = 1;
                    a[i + 1] -= 1;
                }
            }
            for(int i = 0; i < n; i++) {
                System.out.print(a[i]);
            }
            System.out.print( " ");
            int[] b = new int[n];
            tmp = s;
            for(int i = 0; i < n; i++) {
                if(tmp > 9) {
                    b[i] = 9;
                    tmp -= 9;
                }
                else if(tmp != 0) {
                    b[i] = tmp;
                    tmp = 0;
                }
                else {
                    b[i] = 0;
                }
            }
            for(int it : b) {
                System.out.print(it);
            }
        }
        
    }
}
