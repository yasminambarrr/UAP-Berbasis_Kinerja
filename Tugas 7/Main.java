/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Yasmin Ambar Athirah Soamole
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\n DATA PEGAWAI TETAP");
        Pegawai tetap1 = new PegawaiTetap("Bayu", "350728490327424892342", 2000000.0);
        System.out.println(tetap1.toString());
        Pegawai tetap2 = new PegawaiTetap("Jisoo", "3501102000333378797", 3000000.0);
        System.out.println(tetap2.toString());
        Pegawai tetap3 = new PegawaiTetap("Lisa", "320668757982444567812", 2500000.0);
        System.out.println(tetap3.toString());
        Pegawai tetap4 = new PegawaiTetap("Rose", "225001986456016745634", 4500000.0);
        System.out.println(tetap4.toString());
        System.out.println("--------------------------------------------------------");

        System.out.println("\n DATA PEGAWAI HARIAN");
        Pegawai harian1 = new PegawaiHarian("Edo", "350728490327424892343", 8500.0, 40);
        System.out.println(harian1.toString());
        Pegawai harian2 = new PegawaiHarian("Mingyu", "350500119988797768", 7500.0, 30);
        System.out.println(harian2.toString());
        Pegawai harian3 = new PegawaiHarian("Wonwoo", "21100299709365456", 9000.0, 46);
        System.out.println(harian3.toString());
        Pegawai harian4 = new PegawaiHarian("Haruto", "2011110550001223456", 6000.0, 28);
        System.out.println(harian4.toString());
        System.out.println("--------------------------------------------------------");

        System.out.println("\n DATA SALES");
        Pegawai sales1 = new Sales("Tika", "350728490327424892344", 50, 50000.0);
        System.out.println(sales1.toString());
        Pegawai sales2 = new Sales("Doyoung", "34990277000123998056", 66, 60000.0);
        System.out.println(sales2.toString());
        Pegawai sales3 = new Sales("Junghwan", "31050300110009656897",77 , 65000.0);
        System.out.println(sales3.toString());
        Pegawai sales4 = new Sales("Asahi", "3012298779000657501",45 , 45000.0);
        System.out.println(sales4.toString());
        System.out.println("--------------------------------------------------------");

    }
}
