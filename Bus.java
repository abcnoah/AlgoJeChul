
public class Bus {
    publicTransport common = new publicTransport();

    int passengerCount; // 현재 승객 수
    int money;
    public Bus(int busNumber) //버스 생성시 번호 부여생성자
    {
        common.maxPassengerCount = 30; //버스 최대 승객수
        common.fee = 1000; //버스 요금
        common.number = busNumber;
        common.status = "운행중";

        common.fuelVolume = 100;
    }

    public void take(int passengers) // 승객을 태움
    {
        if((this.passengerCount + passengers) > common.maxPassengerCount){
            System.out.println("죄송합니다. 만원입니다.");
        }
        else {
            this.passengerCount += passengers;
            this.money += passengers * common.fee;
        }
    }

    public void changeStatus(int fuelVolume){
        common.changeStatus(fuelVolume);
    }

    public void changeSpeed(int speed){
        common.changeSpeed(speed);
    }
    public void toDrive(){
        common.toDrive();
    }
    public void toGarage(){
        common.toGarage();
        this.passengerCount = 0;
    }
    public void showInfo()
    {
        System.out.println("버스 " + common.number + "번의 승객은 " + this.passengerCount + "명이고, 잔여 승객 수는 " + (common.maxPassengerCount-this.passengerCount) + "명 " + "버스 수입은 "
                + this.money + "원 입니다.");
    }
    public void showStatus(){
        System.out.println("상태 = " + common.status);
    }
    public void showFuel(){
        System.out.println("주유량 = " + common.fuelVolume);
    }
}
