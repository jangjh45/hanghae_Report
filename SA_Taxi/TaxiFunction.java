package SA_Taxi;

public interface TaxiFunction {
    void StartOperation();

    void boardingPassengers(int pgnum, String destination, int distance);

    void payment();

    void fuelReduction(int fuelnum);
    void speedupdown(int num);
}
