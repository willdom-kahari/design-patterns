/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class VehicleFactory {

    public Vehicle createVehicle(VehicleType vehicleType){
        return switch (vehicleType) {
            case TRUCK -> new Truck();
            case CAR -> new Car();
            case BIKE -> new Bike();
            default -> null;
        };
    }
}
