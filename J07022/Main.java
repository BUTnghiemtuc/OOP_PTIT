/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07022;

/**
 *
 * @author dkmme
 */
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(new File("DATA.in"))) {
            List<String> list = new ArrayList<>();
            while(in.hasNext()) {
                String s = in.next();
                try {
                    Integer.parseInt(s);
                }
                catch(NumberFormatException e) {
                    list.add(s);
                }
            }
            Collections.sort(list);
            for(String it : list) {
                System.out.print(it + " ");
            }
            
        }catch (FileNotFoundException e) {
            
        }
    }
}
