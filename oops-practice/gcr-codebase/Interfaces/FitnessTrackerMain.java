package Interfaces;

public class FitnessTrackerMain {
    public static void main(String[] args) {


        FitnessDevice f = new FitnessDevice(4000, 100);
        f.sendAlert();
        f.generateReport();
        f.logActivity();
        f.resetData();
    }
}
