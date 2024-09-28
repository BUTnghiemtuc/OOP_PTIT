/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04006;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String Ten = in.nextLine();
        String Lop = in.next();
        String NS = in.next();
        float d = in.nextFloat();
        
        SinhVien A = new SinhVien(Ten, Lop, NS, d);
        System.out.println(A);
    }
}
