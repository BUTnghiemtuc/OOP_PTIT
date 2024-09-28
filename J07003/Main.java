/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07003;

/**
 *
 * @author dkmme
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "DATA.in";
        TreeMap<Integer, Integer> countMap = new TreeMap<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();

            for (Integer num : list) {
                if (num >= 0 && num < 1000) {
                    countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
