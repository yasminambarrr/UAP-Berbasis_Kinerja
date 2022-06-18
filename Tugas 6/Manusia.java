/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author ASUS
 */
public class Manusia {
    private String nama;
    private String NIK;
    boolean jenisKelamin;
    private boolean menikah;
    static int jumlah = 0;
 
    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama; 
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
 }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    
    public double getTunjangan() {
        double tunjangan;
        if (this.getMenikah() == true) {
            if (this.getJenisKelamin() == true) {
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 25;
        }
        return tunjangan;
    }
    
    public double getPendapatan() {
        double pendapatan = getTunjangan();
        return pendapatan;
    }
    
    public void totalManusia() {
        System.out.println(jumlah);
    }

    @Override
   public String toString() {
       jumlah++;
       return "\nNama\t\t : " + getNama() +"\nNIK\t\t : " + getNIK() +"\nJenis Kelamin\t : " + (getJenisKelamin()?"Laki-laki" : "Perempuan") + "\nPendapatan\t : " + getPendapatan() + "$" + "\n";
   }
}
