package SA;

abstract class Bus implements BusFunction {
    private int maxPassenger;
    private int passenger;
    private int fare;
    private int busNumber;
    private int fuelLevel;
    private int speed;
    private String state;


    public Bus(int maxPassenger, int fare, int busNumber, int speed) {
        this.maxPassenger = maxPassenger;
        this.passenger = 0;
        this.fare = fare;
        this.busNumber = busNumber;
        this.fuelLevel = 100;
        this.speed = speed;
        this.state = "운행중";
        System.out.println("버스번호 " + busNumber + "번 생성되었습니다.");
        System.out.println("탑승가능 총원은 " + maxPassenger + "명, 요금은 " + fare + "원 입니다.");
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

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}