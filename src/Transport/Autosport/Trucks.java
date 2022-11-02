package Transport.Autosport;

import Transport.Car;

public class Trucks extends Car {

    public Trucks(String brand, String model, double engineVolume) {
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
        return "3 минуты 56 секунд";
    }

    @Override
    public String maxSpeed() {
        return "100 км/ч";
    }
}
