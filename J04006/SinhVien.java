/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04006;

/**
 *
 * @author dkmme
 */
public class SinhVien {
    private String Ten;
    private String Lop;
    private String NS;
    private float d;
    
    public SinhVien() {
        Ten = "";
        Lop = "";
        NS = "";
        d = 0;
    }
    
    public SinhVien(String ten , String lop, String ns, float d) {
        this.Ten = ten;
        this.Lop = lop;
        this.NS = ns;
        this.d = d;
    }
    
    public String ChuanHoa() {
        String[] word = this.NS.split("/");
        
        String day = word[0].length() == 1 ? "0" + word[0] : word[0];
        String month = word[1].length() == 1 ? "0" + word[1] : word[1];
        String year = word[2];
        
        return day + "/" + month + "/" + year;
    }
    
    public String toString() {
        return "B20DCCN001 " + Ten + " " + Lop + " " + ChuanHoa() + " " + String.format("%.2f", d);
    }
}
