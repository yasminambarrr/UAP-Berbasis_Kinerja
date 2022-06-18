/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;
import java.util.*;
/**
 *
 * @author yasmeen
 */
public class RentArchive {
    private static ArrayList <CarRent> rentData = new ArrayList<CarRent>();
 
    public void Rent(CarRider rider, Car car, int rentDur){
        CarRent rent = new CarRent(rider, car, rentDur);
        rentData.add(rent);
 }

    public void info() {
        System.out.println("------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("------------------------------");
        for (CarRent data : RentArchive.rentData) {
            System.out.println("NAMA PEMINJAM : " + data.getRider().getName());
            System.out.println("TIPE MOBIL : " + data.getCar().getCarType());
            System.out.println("NO. POLISI : " + data.getCar().getPolNum());
            System.out.println("LAMA RENTAL : " + data.getRentDur());
            System.out.println("-------------------------------");
        }

    }

}