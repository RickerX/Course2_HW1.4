import Transport.Autosport.Bus;
import Transport.Autosport.PassengerCars;
import Transport.Autosport.Trucks;
import Transport.Car;
import Transport.Drivers.Driver;
import Transport.Drivers.DriverB;
import Transport.Drivers.DriverC;
import Transport.Drivers.DriverD;

public class Main {
    public static void separation() {
        System.out.println("=============================");
    }
    public static void main(String[] args) {
        Car volvoBus = new Bus("", "", 0);
        Car audiBus = new Bus("Ауди", "А2", 6);
        Car bmwBus = new Bus("БМВ", "А3", 7);
        Car mersedesBus = new Bus("Мерседес", "А4", 5);
        Car volvo = new PassengerCars("Вольво", "S 90", 2.5);
        Car audi = new PassengerCars("Ауди", "RS 6", 4.0);
        Car bmw = new PassengerCars("БМВ", "M5 CS", 4.4);
        Car mersedes = new PassengerCars("Мерседес", "С 63 AMG", 6.3);
        Car volvoTruck = new Trucks("Вольво", "Б1", 10);
        Car audiTruck = new Trucks("Ауди", "Б2", 12);
        Car bmwTruck = new Trucks("БМВ", "Б3", 11);
        Car mersedesTruck = new Trucks("Мерседес", "Б4", 15);
        separation();
        System.out.println(volvoBus);
        System.out.println(audiBus);
        System.out.println(bmwBus);
        System.out.println(mersedesBus);
        separation();
        System.out.println(volvoTruck);
        System.out.println(audiTruck);
        System.out.println(bmwTruck);
        System.out.println(mersedesTruck);
        separation();
        System.out.println(volvo);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(mersedes);
        separation();
        System.out.println(mersedesBus + " лучший круг: " + mersedesBus.bestLapTime() +
                " максимальная скорость: " + mersedesBus.maxSpeed() + " " + mersedesBus.pitStop());
        System.out.println(mersedes + " лучший круг: " + mersedes.bestLapTime() +
                " максимальная скорость: " + mersedes.maxSpeed() + " " + mersedes.pitStop());
        System.out.println(mersedesTruck + " лучший круг: " + mersedesTruck.bestLapTime() +
                " максимальная скорость: " + mersedesTruck.maxSpeed() + " " + mersedesTruck.pitStop());
        separation();
        DriverC ivan = new DriverC("Иван", "10", "права категории С");
        DriverB artem = new DriverB("Артем", "5", "права категории В");
        DriverD oleg = new DriverD("Олег", "15", "права категории D");
        ivan.driveCar();
        System.out.println("Управляет автомобилем: " + volvoTruck + "И будет учавствовать в заезде.");
        separation();
        artem.driveCar();
        System.out.println("Управляет автомобилем: " + volvo + "И будет учавствовать в заезде.");
        separation();
        oleg.driveCar();
        System.out.println("Управляет автомобилем: " + volvoBus + "И будет учавствовать в заезде.");
        separation();
    }
}