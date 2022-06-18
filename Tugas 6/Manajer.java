/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author ASUS
 */
public class Manajer extends Pekerja{
    
    private int lamaKerja;
    private int status;
    static int jumlah3 = 0;

    public Manajer(int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK,
            boolean jenisKelamin, boolean menikah) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
    
    public double BonusManajer() {
        return Bonus()*0.35;
    }
    
    public void totalManajer() {
        System.out.println(jumlah3);
    }
  
    @Override
    public String toString() {
        jumlah3++;
        return "\nNama\t\t: " + getNama() + 
                "\nNIK\t\t: " + getNIK() + 
                "\nJenis Kelamin\t: " + (jenisKelamin?"Laki-Laki":"Perempuan") + 
                "\nPendapatan\t: " + (Bonus()+Gaji()+ Bonus() + Gaji()+ getTunjangan() + 15)+"$" + 
                "\nBonus\t\t: " + Bonus() +
                "\nGaji\t\t: " +  Gaji() + "$" + 
                "\nStatus\t\t: " + getStatus() + 
                "\nLama Kerja\t: " + this.getLamaKerja() + " hari";
    }
}

