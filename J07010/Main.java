/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07010;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(new File("SV.in"))) {
            int t = in.nextInt();
            
            int cnt = 0;
            List<String> list = new ArrayList<>();
            while(t-- > 0) {
                ++cnt;
                in.nextLine();
                String ten = in.nextLine();
                String lop = in.nextLine();
                String ns = in.nextLine();
                float gpa = in.nextFloat();
                String num = Integer.toString(cnt);
                if(num.length() == 1) {
                    num = "00" + num;
                }
                else if(num.length() == 2) {
                    num = "0" + num;
                }
                
                String ma = "BB20DCCN" + num;
                if(ns.charAt(1) == '/') {
                    ns = "0" + ns;
                }
                if(ns.charAt(4) == '/') {
                    ns = ns.substring(0, 3) + "0" + ns.substring(3);
                }
                
                String res = String.format("%s %s %s %s %.2f", ma, ten, lop, ns, gpa);
                list.add(res);
            }
            for(String it : list) {
                System.out.println(it);
            }
        }catch(FileNotFoundException e) {
            
        }
    }
}
