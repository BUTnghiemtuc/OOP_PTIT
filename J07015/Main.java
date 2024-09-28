package J07015;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new TreeMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"))) {
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
            if (list != null) {
                for (Integer it : list) {
                    if (nt(it)) {
                        mp.put(it, mp.getOrDefault(it, 0) + 1);
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Map.Entry<Integer, Integer> en : mp.entrySet()) {
            System.out.println(en.getKey() + " " + en.getValue());
        }
    }

    public static boolean nt(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
