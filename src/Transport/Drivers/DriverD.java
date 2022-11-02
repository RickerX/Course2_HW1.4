package Transport.Drivers;

public class DriverD extends Driver {

    public DriverD(String fio, String experience, String driversLicense) {
        super(fio, experience, driversLicense);
    }

    @Override
    public void driveCar() {
        System.out.println("Водитель: " + getFio() + " стаж: " + getExperience() +  " лет, наличие водительских прав: " + getDriversLicense());
    }
}
