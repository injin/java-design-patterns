package abstractFactory.samsung;

import abstractFactory.factory.Door;

public class SamSungDoor extends Door {
    @Override
    protected void doClose() { System.out.println("close SamSung Door"); }
    @Override
    protected void doOpen() { System.out.println("open SamSung Door"); }
}
