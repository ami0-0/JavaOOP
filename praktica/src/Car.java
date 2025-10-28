public class Car {

    private CarType carType = null;
    private EngineType engineType = null;
    private TransmissionType transmissionType = null;

    public Car(CarType carType, EngineType engineType, TransmissionType transmissionType) {
        this.carType = carType;
        this.engineType = engineType;
        this.transmissionType = transmissionType;
    }

    public void getPassport() {
        System.out.println("This is a " + carType.getCarType()
                + " with " + engineType.getEngineType()
                + " engine and " + transmissionType.getTransmissionType()
                + " transmission\n");
    }
}
