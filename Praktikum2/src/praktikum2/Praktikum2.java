/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author Isnaini Fatmala
 */
public class Praktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HitungKeramik p1 = new HitungKeramik(30, 30, 54000, 10, 'A');
        
        p1.hitungHarga();
        p1.tampilkan();
        
        HitungKeramik p2 = new HitungKeramik(40, 40, 65000, 5, 'B');
        
        p2.hitungHarga();
        p2.tampilkan();
        
        HitungKeramik p3 = new HitungKeramik(30, 40, 60000, 8, 'C');
        
        p3.hitungHarga();
        p3.tampilkan();
    }
    
}
