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
    Definisi Program : Biaya Mas Kawin
 */
public class PBO210117063Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        masKawin kwn = new masKawin();
        kwn.setHargaMas(570000);
        kwn.setTotBerat(15.7);
        
        System.out.println("Masukkan Total Berat Emas yang akan dibeli : " +kwn.getTotBerat()+ " Gram");
        System.out.println("Total Yang Harus Anda Bayar : Rp. " +kwn.hitungEmas(kwn.getHargaMas(),kwn.getTotBerat()));
    }
    
}
