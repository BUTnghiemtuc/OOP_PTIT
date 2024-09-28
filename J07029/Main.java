/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07029;

import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new TreeMap<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"))) {
            ArrayList<Integer> list = (ArrayList<Integer>)ois.readObject();
            
            for(Integer it : list) {
                if(nt(it)) {
                    mp.put(it, mp.getOrDefault(it, 0) + 1);
                }
            }
        }catch (IOException e) {
            
        } 
        List<String> list = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> en : mp.entrySet()) {
            
            String tmp = String.valueOf(en.getKey()) + " " + String.valueOf(en.getValue());

            list.add(tmp);
        }
        int start = Math.max(0, list.size() - 10);
        for (int i = list.size() - 1; i >= start; i--) {
            System.out.println(list.get(i));
        }

    }
    public static boolean nt(int a) {
        if(a <= 1) return false;
        for(int i = 2; i <= Math.sqrt((a)); i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
