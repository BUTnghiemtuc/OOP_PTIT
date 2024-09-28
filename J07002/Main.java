/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07002;

/**
 *
 * @author dkmme
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("DATA.in");
        long sum = 0;
//        Scanner in = new Scanner(System.in);
        try (Scanner in = new Scanner(file)){
            while(in.hasNext()) {
                String s = in.next();
                if(check(s)) {
                    sum += toNum(s);
                }
            }
        }catch(FileNotFoundException e) {
            
        }
        System.out.println(sum);
    }
    
    public static boolean check(String s) {
        if(s.length() > 9) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > '9' || s.charAt(i) < '0') {
                return false;
            }
        }
        return true;
    }
    public static int toNum(String s) {
        int tmp = 0;
        for(int i = 0; i < s.length(); i++) {
            tmp = tmp * 10 + (s.charAt(i) - '0');
        }
        return tmp;
    }
}
