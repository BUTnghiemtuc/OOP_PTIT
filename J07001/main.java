/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07001;

/**
 *
 * @author dkmme
 */

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        File file = new File("DATA.in");
        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            return;  // Thoát nếu file không tồn tại
        }
        
        try {
            Scanner in = new Scanner(file);
            if (!in.hasNextLine()) {
                System.out.println("File rỗng!");
            }
            while(in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
            in.close();
        } catch(FileNotFoundException e) {
            System.out.println("Không thể tìm thấy file: " + e.getMessage());
        }
    }
}

