package Transport.Drivers;

import Transport.Autosport.PassengerCars;

public class DriverB extends Driver {
    public DriverB(String fio, String experience, String driversLicense) {
        super(fio, experience, driversLicense);
    }

    @Override
    public void driveCar() {
        System.out.println("Водитель: " + getFio() + " стаж: " + getExperience() +  " лет, наличие водительских прав: " + getDriversLicense());
    }
}
