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
public class HitungKeramik {
    double sisiA;
    double sisiB;
    double harga;
    double isi;
    char merk;
    private double biaya;
    private double jml;
    
    HitungKeramik(double a, double b, double h, double i, char m){
        this.sisiA = a;
        this.sisiB = b;
        this.harga = h;
        this.isi = i;
        this.merk = m;
    }
    
    
    public double hitungHarga(){
        double bagi = 100 / ((this.sisiA * this.sisiB) / 10000);
        jml = Math.ceil(bagi);
        double box = jml / this.isi;
        double boxActual = Math.ceil(box);
        biaya = this.harga * boxActual;
        return biaya;
 
    }
    public void tampilkan(){
        System.out.println("\nJumlah keramik merk " + merk + " yang dibutuhkan adalah " + jml);
        System.out.println("Total harga merk " + merk + " yang harus dibayar adalah " + biaya);
    }
}
