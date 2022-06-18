/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    private double gaji = 10;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    static int jumlah2 = 0;
    
    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.gaji = gaji;
        this.bonus = bonus;
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    
    public double Gaji() {
        return (getHariKerja()*getJamKerja()*15);
 }
 
    public double Bonus() {
        double totalHari = 0;
        double hariLembur = ((hariKerja/7)*7 + (hariKerja % 7))*(jamKerja - 7)*15;
        double hariLibur = (hariKerja/7) * 2 * jamKerja *20;       
        if (jamKerja <= 7) {
            return hariLibur;
        }else {
            return hariLembur + hariLibur;
        }
    }

    public String getStatus() {
        String Kantor = "", Cabang, Departemen = "";
        switch (NIP.substring(0, 1)) {
            case "1":
                Kantor = "Mondstadt";
                break;
            case "2":
                Kantor = "Liyue";
                break;
            case "3":
                Kantor = "Inazuma";
                break;
            case "4":
                Kantor = "Sumeru";
                break;
            case "5":
                Kantor = "Fontaine";
                break;
            case "6":
                Kantor = "Natlan";
                break;
            case "7":
                Kantor = "Snezhnaya";
                break;
        }
        Cabang = " cabang " + NIP.substring(2, 3);
        switch (NIP.substring(6, 7)) {
            case "1":
                Departemen = "Pemasaran";
                break;
            case "2":
                Departemen = "Humas";
                break;
            case "3":
                Departemen = "Riset";
                break;
            case "4":
                Departemen = "Teknologi";
                break;
            case "5":
                Departemen = "Personalia";
                break;
            case "6":
                Departemen = "Akademik";
                break;
            case "7":
                Departemen = "Administrasi";
                break;
            case "8":
                Departemen = "Operasional";
                break;
            case "9":
                Departemen = "Pembangunan";
                break;
        }
        return Departemen + " , " + Kantor + " " + Cabang;
    }
    
    public void totalPekerja() {
        System.out.println(jumlah2);
 }

    public String toString() {
        jumlah2++;
        return "\nNama\t\t: " + getNama() + "\nNIK\t\t: " + getNIK() + "\nJenis Kelamin\t: " + (jenisKelamin?"Laki-Laki":"Perempuan") 
                + "\nPendapatan\t: " + (getPendapatan()+Gaji()+Bonus())+"$" + "\nBonus\t\t: " + Bonus() + "$" +"\nGaji\t\t: " 
                + Gaji() + "$" + "\nStatus\t\t: " + getStatus();
 
    }
    
}

