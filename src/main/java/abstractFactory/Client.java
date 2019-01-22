package abstractFactory;

import abstractFactory.factory.ElevatorFactory;
import abstractFactory.factory.ElevatorFactoryFactory;
import abstractFactory.factory.VendorID;

public class Client {
    public static void main(String[] args) {
      String vendorName = args[0];
      VendorID vendorID;

      // 인자에 따라 LG 또는 Samsung 또는 Hyundai 팩토리를 생성
      if(vendorName.equalsIgnoreCase("LG"))
        vendorID = VendorID.LG;
      else if(vendorName.equalsIgnoreCase("Samsung"))
        vendorID = VendorID.SAMSUNG;
      else
        vendorID = VendorID.HYUNDAI;

      ElevatorFactory factory = ElevatorFactoryFactory.getFactory(vendorID);
      
    }
}
