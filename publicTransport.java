public class publicTransport {

    static int maxPassengerCount; // 최대 승객수
    static int fee; // 요금

    int number; // 번호
    int fuelVolume; //주유량
    int speed; //현재 속도
    String status; //상태

    public publicTransport() {
    }


    public void changeStatus(int fuelVolume){
        this.fuelVolume += fuelVolume;
        if(this.fuelVolume < 10){
            showCaution();
        }
    }

    public void changeSpeed(int speed){
        if(this.fuelVolume < 10){
            showCaution();
        }
        this.speed += speed;
    }
    public void showCaution(){
        System.out.println("주유량 = " + this.fuelVolume);
        System.out.println("주유가 필요합니다.");
        this.toGarage();
    }
    public void toDrive(){
        this.status = "운행중";
    }
    public void toGarage(){
        this.status = "차고지행";
    }
}
