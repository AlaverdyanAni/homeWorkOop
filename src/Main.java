public class Main {
    public static void main(String[] args) {
        Bicycle [] bicycles = {
                new Bicycle("Bicycle1",2),
                new Bicycle("Bicycle2",2),
        };

        Car[] cars = {
                new Car("Car1",4),
                new Car("Car2",4),
        };

        Truck [] trucks = {
                new Truck("Truck1",6),
                new Truck("Truck2",8),
        };

        ServiceStation station = new ServiceStation();
        station.updateTyre(bicycles);
        station.updateTyre(cars);
        station.updateTyre(trucks);
        station.checkEngine(cars);
        station.checkEngine(trucks);
        station.checkTrailer(trucks);
    }
}