package abstractFactory.lg;

import abstractFactory.factory.Door;

public class LGDoor extends Door {
    @Override
    protected void doClose() { System.out.println("close LG Door"); }
    @Override
    protected void doOpen() { System.out.println("open LG Door"); }
}
