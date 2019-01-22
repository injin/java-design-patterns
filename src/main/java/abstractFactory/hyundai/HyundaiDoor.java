package abstractFactory.hyundai;

import abstractFactory.factory.Door;

public class HyundaiDoor extends Door {
    @Override
    protected void doClose() { System.out.println("close Hyundai Door"); }
    @Override
    protected void doOpen() { System.out.println("open Hyundai Door"); }
}
