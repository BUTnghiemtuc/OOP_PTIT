/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04007;

/**
 *
 * @author dkmme
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String Ten = in.nextLine();
        String GT = in.next();
        String NS = in.next();
        in.nextLine();
        String DC = in.nextLine();
        
        String MST = in.next();
        String NHD = in.next();
        
        NhanVien X = new NhanVien(Ten, GT, NS, DC, MST, NHD);
        
        System.out.println(X);
    }
}
