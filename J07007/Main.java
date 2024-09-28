/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07007;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> se = new TreeSet<>();
        try(Scanner in = new Scanner(new File("VANBAN.in"))) {
            while(in.hasNext()) {
                String s = in.next().toLowerCase();
                se.add(s);
            }
        } catch(FileNotFoundException e) {
            
        }
        for(String it : se) {
            System.out.println(it);
        }
    }
    
}
