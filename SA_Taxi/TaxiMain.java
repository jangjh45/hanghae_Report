package SA_Taxi;

public class TaxiMain {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(3);
        taxi.StartOperation();
        taxi.boardingPassengers(3,"서울역",5);
    }

}
