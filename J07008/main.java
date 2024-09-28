/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07008;

import java.util.*;
import java.io.*;

public class Main {    
    public static void main(String[] args) {
        try (Scanner in = new Scanner(new File("DAYSO.in"))) {
            int n = in.nextInt();
            int[] a = new int[n];
            
            int cnt = 0;
            while (cnt < n) {
                a[cnt] = in.nextInt();
                ++cnt;
            }
            
            int[] arr = new int[n];
            boolean ok = true;
            List<String> list = new ArrayList<>();
            while (ok) {
                StringBuilder tmp = new StringBuilder();
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 1) {
                        ++count;
                        tmp.append(a[i]).append(" ");
                    }
                }
                
                if (check(tmp.toString().trim()) && count > 1) {
                    list.add(tmp.toString().trim());
                }
                ok = Try(arr, n);
            }
            Collections.sort(list);
            for (String it : list) {
                System.out.println(it);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    public static boolean Try(int[] arr, int n) {
        int i = n - 1;
        while (i >= 0 && arr[i] == 1) {
            arr[i] = 0;
            --i;
        }
        if (i < 0) {
            return false;
        } else {
            arr[i] = 1;
            return true;
        }
    }

    public static boolean check(String tmp) {
        String[] u = tmp.split("\\s+");
        
        for (int i = 1; i < u.length; i++) {
            if (Integer.parseInt(u[i]) < Integer.parseInt(u[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
