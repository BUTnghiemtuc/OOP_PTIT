/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04004;

/**
 *
 * @author dkmme
 */
public class PS {
    private long tu;
    private long mau;
    
    public long GetTu() {
        return tu;
    }
    public long GetMau() {
        return mau;
    }
    
    public PS(long tu,long mau) {
        this.tu = tu ;
        this.mau = mau;
    }
    
    public PS() {
        this.tu = 1;
        this.mau = 1;
    }
    
    public long GCD(long a, long b) {
        while(b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public void RutGon() {
        long c = GCD(this.tu, this.mau);
        this.tu = this.tu / c;
        this.mau = this.mau / c;
    }
    public static PS sum(PS a, PS b) {
        long y = a.GetMau() * b.GetMau();
        long x = a.GetTu() * (y / a.GetMau()) + b.GetTu() * (y / b.GetMau());
        PS res = new PS(x, y);
        res.RutGon();
        return res;
    }
    
    public String toString() {
        return tu + "/" + mau;
    }
}
