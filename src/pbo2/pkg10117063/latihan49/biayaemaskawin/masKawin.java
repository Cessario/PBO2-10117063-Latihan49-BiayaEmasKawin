/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan49.biayaemaskawin;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : Mas Kawin
 */
public class masKawin {
    private double totBerat;
    private  double hargaMas;

    public masKawin() {
        this.hargaMas = 570000;
    }
    public double hitungEmas(double totBerat, double hargaMas ){
       return totBerat * hargaMas; 
    }

    public double getTotBerat() {
        return totBerat;
    }

    public void setTotBerat(double totBerat) {
        this.totBerat = totBerat;
    }

    public double getHargaMas() {
        return hargaMas;
    }

    public void setHargaMas(double hargaMas) {
        this.hargaMas = hargaMas;
    }
}
