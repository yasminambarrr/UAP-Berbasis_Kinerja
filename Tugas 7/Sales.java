/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Yasmin Ambar Athirah Soamole
 */
public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double gajiSales(){
        double gajiSales = getPenjualan() * getKomisi();
        return gajiSales;
    }
    @Override
    public String toString() {
        return  "\nSales           : " + getNama() +
                "\nNo. KTP         : " + getNoKTP() +
                "\nTotal Penjualan : " + (double)getPenjualan() +
                "\nBesaran Komisi  : " + getKomisi() +
                "\nPendapatan      : " + "Rp " + (int)gajiSales();
    }
}
