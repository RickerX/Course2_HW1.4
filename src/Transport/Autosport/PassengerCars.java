package Transport.Autosport;

import Transport.Car;

public class PassengerCars extends Car {

    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stopMoving() {

    }

    @Override
    public String pitStop() {
        return "Еду на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "1 минуты 25 секунд";
    }

    @Override
    public String maxSpeed() {
        return "160 км/ч";
    }

}
