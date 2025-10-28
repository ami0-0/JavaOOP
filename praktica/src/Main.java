//Разработайте систему классов и интерфейсов для следующей предметной области:
//
//Автомобили (car) могут быть грузовыми (truck) и легковыми (passenger car).
// У любого автомобиля есть двигатель (engine), который может быть бензиновым (gasoline) или
// дизельным (diesel), а также коробка передач (transmission), ручная (manual) или автоматическая (automatiс).
//
// Автомобили должны иметь метод getPassport, выводящий на экран строчку вида:
//This is a <truck | passenger car> with <gasoline | diesel> engine and <manual | automatic> transmission

public class Main {
    public static void main(String[] args) {
        Car truck1 = new Car(new Truck(), new Diesel(), new Automatic());
        truck1.getPassport();

        Car passengerCar1 = new Car(new PassengerCar(), new Gasoline(), new Manual());
        passengerCar1.getPassport();

        Car truck2 = new Car(new Truck(), new Gasoline(), new Automatic());
        truck2.getPassport();
    }
}