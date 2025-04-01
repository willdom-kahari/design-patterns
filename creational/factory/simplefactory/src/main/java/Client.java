/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class Client {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle car = factory.createVehicle(VehicleType.CAR);
        Vehicle bike = factory.createVehicle(VehicleType.BIKE);
        Vehicle truck = factory.createVehicle(VehicleType.TRUCK);

        car.drive();
        bike.drive();
        truck.drive();
    }
}
