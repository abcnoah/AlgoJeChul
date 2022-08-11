public class Taxi {
    publicTransport common = new publicTransport();
    static int addMoney = 1000; // 거리당 추가요금

    int passengerCount; // 현재 승객 수
    int sumMoney; // 총 요금

    String destination; // 목적지
    int distanceToDest; // 목적지까지 거리


    public Taxi(int taxiNumber) //택시 생성시 번호 부여생성자
    {
        common.maxPassengerCount = 4; //택시 최대 승객수
        common.fee = 3000; //택시 기본 요금
        common.number = taxiNumber;
        common.status = "일반";

        common.fuelVolume = 100;
    }
    public void take(int passengers, String destination, int distanceToDest) // 승객을 태움
    {
        if(this.passengerCount > 0){
            System.out.println("승객이 탑승중입니다.");
            return;
        }
        else if(passengers > common.maxPassengerCount){
            System.out.println("최대 승객 수 초과입니다.");
        }
        else {
            common.status = "운행중";
            this.passengerCount = passengers;
            this.destination = destination;
            this.distanceToDest = distanceToDest;
            this.sumMoney += common.fee + this.distanceToDest * this.addMoney;
        }
    }
    public void showInfo()
    {
        if(common.fuelVolume < 10){
            showFuel(); //주유량 출력
            showStatus(); //운행상태 출력
            showSumMoney(); // 누적요금 출력
        }
        else{
            System.out.println("탑승 승객 수 = " + this.passengerCount);
            System.out.println("잔여 승객 수 = " + (common.maxPassengerCount - this.passengerCount));
            System.out.println("기본 요금 확인 = " + common.fee);
            System.out.println("목적지 = " + this.destination);
            System.out.println("목적지까지 거리 = " + this.distanceToDest + "km");
            System.out.println("지불할 요금 = " + common.fee + this.distanceToDest * this.addMoney);
            showStatus();
        }
    }

    public void showStatus(){
        System.out.println("상태 = " + common.status);
    }

    public void changeStatus(int fuelVolume){
        common.changeStatus(fuelVolume);
    }

    public void payMent(){
        if(common.fuelVolume < 10) {
            common.status = "운행불가";
        }
        else {
            common.status = "일반";
            this.passengerCount = 0;
            this.destination = "";
            this.distanceToDest = 0;
        }
    }

    public void showFuel(){
        if(common.fuelVolume < 10) {
            System.out.println("주유량 = " + common.fuelVolume);
            System.out.println("주유 필요");
        }
        else {
            System.out.println("주유량 = " + common.fuelVolume);
        }
    }
    public void showSumMoney(){
        System.out.println("누적 요금 = " + this.sumMoney);
    }
}
