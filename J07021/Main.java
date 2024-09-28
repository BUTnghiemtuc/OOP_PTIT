/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07021;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(new File("DATA.in"))) {
            while(in.hasNextLine()) {
                String s = in.nextLine();
                if(s.equals("END")) {
                    break;
                }
                String[] arr = s.trim().split("\\s+");
                for (int i = 0; i < arr.length; i++) {
                   
                    arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase(); 
//                    
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
            }
            
        } catch(FileNotFoundException e) {
            
        }
    }
}
