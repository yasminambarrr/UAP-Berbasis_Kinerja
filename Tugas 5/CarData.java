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
public class CarData {
    static ArrayList <Car> carList = new ArrayList<Car>();

    public ArrayList<Car> getCarList() {
        return carList;
 }
    
    public void setCarList(ArrayList<Car> carList) {
        CarData.carList = carList;
 }
 
    public void addCar(String carType, String polNum, String merk){
        Car car = new Car(carType, polNum, merk);
        carList.add(car);
 }

    public void listOfCar(){
        System.out.println("===============================");
        System.out.println(" DAFTAR MOBIL ");
        System.out.println("===============================");
        for (Car data : carList) {
            System.out.println("TIPE MOBIL : " + data.getCarType());
            System.out.println("NO.POLISI : " + data.getPolNum());
            System.out.println("MERK MOBIL : " + data.getMerk());
            System.out.println("-------------------------------");
 
        }
    }
}
