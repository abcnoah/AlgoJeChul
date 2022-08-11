
public class Main {
    public static void main(String[] args) {
//        Bus bus1 = new Bus(1234);
//        Bus bus2 = new Bus(2345);
//
//        bus1.take(2);
//
//        bus1.showInfo();
//        bus1.changeStatus(-50);
//        bus1.showFuel();
//        bus1.toGarage();
//        bus1.changeStatus(10);
//        bus1.showStatus();
//        bus1.showFuel();
//        bus1.toDrive();
//        bus1.take(45);
//        bus1.take(5);
//        bus1.showInfo();
//        bus1.changeStatus(-55);
        /////////////////////////////////////
        Taxi taxi1 = new Taxi(3456);
        Taxi taxi2 = new Taxi(4567);

        taxi1.take(2, "서울역", 2);
        taxi1.showInfo();
        taxi1.changeStatus(-80);
        taxi1.payMent();

        taxi1.showFuel();
        taxi1.showSumMoney();

        taxi1.take(5, "어딘가", 2);

        taxi1.take(3, "구로디지털단지역", 12);
        taxi1.showInfo();

        taxi1.changeStatus(-20);
        taxi1.payMent();
        taxi1.showInfo();
    }
}