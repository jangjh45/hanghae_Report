package SA_Taxi;

public class Taxi implements TaxiFunction {
    private int maxPassenger; // 최대 승객 수
    private int passenger; // 승객
    private int numBer; // 번호
    private int fuelLevel; // 주유량
    private int speed; // 현재속도
    private String destination; // 목적지
    private int basicDistance; // 기본거리
    private int distance; // 목적지까지 거리
    private int basicFare; // 기본요금
    private int distanceFare; // 거리당 요금
    private String status; // 운행상태

    public Taxi(int numBer) {
        this.maxPassenger = 4;
        this.passenger = 0;
        this.numBer = numBer;
        this.fuelLevel = 100;
        this.speed = 0;
        this.destination = "";
        this.basicDistance = 1;
        this.distance = 0;
        this.basicFare = 3000;
        this.distanceFare = 1000;
        this.status = "";
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getNumBer() {
        return numBer;
    }

    public void setNumBer(int numBer) {
        this.numBer = numBer;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getBasicDistance() {
        return basicDistance;
    }

    public void setBasicDistance(int basicDistance) {
        this.basicDistance = basicDistance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getBasicFare() {
        return basicFare;
    }

    public void setBasicFare(int basicFare) {
        this.basicFare = basicFare;
    }

    public int getDistanceFare() {
        return distanceFare;
    }

    public void setDistanceFare(int distanceFare) {
        this.distanceFare = distanceFare;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void StartOperation() {
        if (getFuelLevel() < 10) {
            System.out.println("기름이 부족합니다.");
        } else {
            this.status = "일반";
            System.out.println("운행을 시작합니다. 안전운전하세요.");
        }
    }

    @Override
    public void boardingPassengers(int pgnum, String destination, int distance) {
        if (getStatus().equals("일반")) {
            this.passenger += pgnum;
            this.destination = destination;
            this.distance = distance;
            this.status = "운행중";
        } else {
            System.out.println("탑승 불가");
        }
    }

    //    private int basicDistance; // 기본거리
//    private int distance; // 목적지까지 거리
//    private int basicFare; // 기본요금
//    private int distanceFare; // 거리당 요금
    @Override
    public void payment() {
        System.out.println(getFuelLevel());
        if (getDistance() < getBasicDistance()) {
            System.out.println("기본요금 = " + getBasicFare());
        } else {
            int pay = getBasicFare() + (getDistance() - getBasicDistance()) * getDistanceFare();
            System.out.println("누적요금 = " + pay);
        }
    }

    @Override
    public void fuelReduction(int fuelnum) {

    }

    @Override
    public void speedupdown(int num) {
        if (num > 0) {
            this.speed += num;
            System.out.println("스피드가 " + num + "증가했습니다.");
        } else {
            this.speed -= num;
            System.out.println("스피드가 " + num + "감소했습니다.");
        }
    }
}
