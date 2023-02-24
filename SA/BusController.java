package SA;

public class BusController extends Bus {
    public BusController(int maxPassenger, int fare, int busNumber, int speed) {
        super(maxPassenger, fare, busNumber, speed);
    }

    @Override
    public void busState(String str) {
        if (str.equals("차고지행")) {
            setState("차고지행");
            setPassenger(0);
        } else setState("운행중");
        System.out.println("상태 = " + getState());
    }

    @Override
    public void gasDecrease(int num) {
        int nowgas = getFuelLevel();
        if ((getFuelLevel() + num) < 10) {
            setState("차고지행");
            setFuelLevel(nowgas + num);
            System.out.println("현재 주유량 = " + getFuelLevel());
            System.out.println("상태 = " + getState());
            System.out.println("주유필요");
        } else {
            setFuelLevel(nowgas + num);
            System.out.println("현재 주유량 = " + getFuelLevel());
        }
    }

    @Override
    public void addPassenger(int num) {
        if (num > getMaxPassenger()) System.out.println("최대 승객 수 초과");
        else {
            setPassenger(getPassenger() + num);
            System.out.println("탑승 승객 수 = " + getPassenger());
            int maxnum = getMaxPassenger();
            int nownum = getPassenger();
            System.out.println("잔여 승객 수 = " + (maxnum - nownum));
            int fare = getFare();
            System.out.println("요금 확인 = " + (fare * num));
        }
    }
}
