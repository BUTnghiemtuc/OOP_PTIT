/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05081;

/**
 *
 * @author dkmme
 */
public class Hang {
    private String ma;
    private String ten;
    private String DV;
    private int Gmua;
    private int Gban;
    private int LN;
    
    public Hang(int cnt, String ten, String DV, int Gmua, int Gban) {
        this.ten = ten;
        this.DV = DV;
        this.Gmua = Gmua;
        this.Gban = Gban;
        this.LN = Gban - Gmua;
        
        String tmp = cnt + "";
        while(tmp.length() != 3) {
            tmp = "0" + tmp;
        }
        tmp = "MH" + tmp;
        this.ma = tmp;
    }
    public int GetLN() {
        return this.LN;
    }

    public String GetMa() {
        return this.ma;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + DV + " " + Gmua + " " + Gban + " " + LN;
    } 
}
