package dev.sanket;

import dev.sanket.db.DBLayer;
import dev.sanket.db.model.Address;
import dev.sanket.db.model.Vehicle;

public class HibernateDemo {
    public static void main(String args[]) {
        DBLayer.initialize();

        Address address = new Address();

        address.setCity("Ahmedabad");
        address.setPincode(380015);
        address.setState("Gujarat");

        DBLayer.saveOrUpdate(address);

        Vehicle vehicle = new Vehicle();

        vehicle.setManufacturer("Honda");

        DBLayer.saveOrUpdate(vehicle);
    }
}
