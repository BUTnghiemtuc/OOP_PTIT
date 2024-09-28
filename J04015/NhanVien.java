/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04015;

/**
 *
 * @author dkmme
 */
public class NhanVien {
    private String Ten;
    private String MaGach;
    private long Luong;
    private long ThuNhap;
    private int x;
    private long PC;
    
    public NhanVien(String MaGach, String Ten, long Luong) {
        this.Ten = Ten;
        this.Luong = Luong;
        this.MaGach = MaGach;
        
        String ma = MaGach.substring(0, 2);
        
        switch (ma) {
            case "HT":
                this.PC = 2000000;
                break;
            case "HP":
                this.PC = 900000;
                break;
            default:
                this.PC = 500000;
                break;
        }
        
        String Bac = this.MaGach.substring(2);
        this.x = (Bac.charAt(0) - '0' ) * 10 + (Bac.charAt(1) - '0');
        
        this.ThuNhap = this.Luong * x + this.PC;
    }
    
    @Override
    public String toString() {
        return MaGach + " " + Ten + " " + x + " " + PC + " " + ThuNhap;
    }
    
}
