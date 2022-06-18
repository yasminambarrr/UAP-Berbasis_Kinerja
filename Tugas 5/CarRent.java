/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author yasmeen
 */
public class CarRent {
    private CarRider rider;
    private Car car;
    private int rentDur;
    
    public CarRent(CarRider rider, Car car, int rentDur){
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
 }

    public CarRider getRider() {
        return rider;
    }

    public Car getCar() {
        return car;
    }

    public int getRentDur() {
        return rentDur;
    }

}
