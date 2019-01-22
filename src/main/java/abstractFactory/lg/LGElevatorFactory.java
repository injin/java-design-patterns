package abstractFactory.lg;

import abstractFactory.factory.Door;
import abstractFactory.factory.ElevatorFactory;

public class LGElevatorFactory extends ElevatorFactory {
    private static ElevatorFactory factory;
    private LGElevatorFactory() { }

    public static ElevatorFactory getInstance() {
        if(factory == null)
            factory = new LGElevatorFactory();

        return factory;
    }

    public Door createDoor() { return new LGDoor(); }
}