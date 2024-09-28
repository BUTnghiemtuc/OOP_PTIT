/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07017;

/**
 *
 * @author dkmme
 */
public class Pair<T1, T2> {
    private T1 first;
    private T2 second;
    
    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    
    private boolean nt(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isPrime() {
        return nt((Integer) first) && nt((Integer) second);
    }
    
    @Override
    public String toString() {
        return first + " " + second;
    }
}
