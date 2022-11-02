package Transport.Drivers;

public class DriverC extends Driver {

    public DriverC(String fio, String experience, String driversLicense) {
        super(fio, experience, driversLicense);
    }

    @Override
    public void driveCar() {
        System.out.println("Водитель: " + getFio() + " стаж: " + getExperience() +  " лет, наличие водительских прав: " + getDriversLicense());
    }
}
