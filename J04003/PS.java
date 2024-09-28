/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04003;

/**
 *
 * @author dkmme
 */
public class PS {
    private long tu;
    private long mau;
    
    public PS() {
        tu = 1;
        mau = 1;
    }
    public PS(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public long GCD() {
        long a = tu;
        long b = mau;
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public String toString() {
        long c = GCD();
        long a = this.tu / c;
        long b = this.mau / c;
        
        return String.format("%d/%d", a, b);
    }
}
