package abstractFactory.samsung;

import abstractFactory.factory.Door;
import abstractFactory.factory.ElevatorFactory;

public class SamSungElevatorFactory extends ElevatorFactory {
    private static ElevatorFactory factory;
    private SamSungElevatorFactory() { }

    public static ElevatorFactory getInstance() {
        if(factory == null)
            factory = new SamSungElevatorFactory();

        return factory;
    }

    public Door createDoor() { return new SamSungDoor(); }
}
