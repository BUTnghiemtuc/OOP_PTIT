/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04007;

/**
 *
 * @author dkmme
 */
public class NhanVien {
    private String Ten;
    private String GT;
    private String NS;
    private String DC;
    private String MST;
    private String NHD;
    
    public NhanVien(String ten, String gt, String ns, String dc,String mst, String nhd) {
        this.Ten = ten;
        this.GT= gt;
        this.NS = ns;
        this.DC = dc;
        this.MST = mst;
        this.NHD = nhd;
    }
    
    public String toString() {
        return "00001 " + Ten + " " + GT + " " + NS + " " + DC + " " + MST + " " + NHD;
    }
}
