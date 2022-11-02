package Transport.Autosport;


import Transport.Car;

public class Bus extends Car {

    public Bus(String brand, String model, double engineVolume) {
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
        return "еду на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "2 минуты 36 секунд";
    }

    @Override
    public String maxSpeed() {
        return "120 км/ч";
    }

}
