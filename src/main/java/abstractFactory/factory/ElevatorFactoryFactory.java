package abstractFactory.factory;

import abstractFactory.hyundai.HyundaiElevatorFactory;
import abstractFactory.lg.LGElevatorFactory;
import abstractFactory.samsung.SamSungElevatorFactory;

public class ElevatorFactoryFactory {
    public static ElevatorFactory getFactory(VendorID vendorID) {
      ElevatorFactory factory = null;

      switch (vendorID) {
        case LG: // LG 팩토리 생성
          factory = LGElevatorFactory.getInstance();
          break;
        case HYUNDAI: // Hyundai 팩토리 생성
          factory = HyundaiElevatorFactory.getInstance();
          break;
        case SAMSUNG: // Samsung 팩토리 생성
          factory = SamSungElevatorFactory.getInstance();
          break;
      }
      return factory;
    }
  }
