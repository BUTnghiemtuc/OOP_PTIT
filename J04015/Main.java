/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04015;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String Ma = in.next();
        in.nextLine();
        String Ten = in.nextLine();
        long luong = in.nextLong();
        
        NhanVien A = new NhanVien(Ma, Ten , luong);
        System.out.println(A);
    }
}
