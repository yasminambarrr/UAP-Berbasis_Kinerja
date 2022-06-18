/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Yasmin Ambar Athirah Soamole
 */
public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;


    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    public double gaji(){
        if (totalJam <= 40){
            return upahPerJam * totalJam;
        }else{
            return (40 *upahPerJam) + ((totalJam-40) * upahPerJam *1.5);
        }
    }

    @Override
    public String toString() {
        return  "\nPegawai Harian  : " + getNama() +
                "\nNo. KTP         : " + getNoKTP() +
                "\nUpah/Jam        : " + "Rp " + getUpahPerJam() +
                "\nTotal jam kerja : " + (double)getTotalJam() +
                "\nPendapatan      : " +  "Rp " + (int)gaji() ;
    }
}
