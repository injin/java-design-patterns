package abstractFactory.hyundai;

import abstractFactory.factory.Door;
import abstractFactory.factory.ElevatorFactory;

public class HyundaiElevatorFactory extends ElevatorFactory {
    private static ElevatorFactory factory;
    private HyundaiElevatorFactory() { }

    public static ElevatorFactory getInstance() {
        if(factory == null)
            factory = new HyundaiElevatorFactory();

        return factory;
    }

    public Door createDoor() { return new HyundaiDoor(); }
}
