package Interfaces;

public class FitnessDevice implements ITrackable, IReportable, INotifable{
    int steps;
    int calories;

    public FitnessDevice(int steps, int calories) {
        this.steps = steps;
        this.calories = calories;
    }
    @Override
    public void logActivity(){
        System.out.println("................................................................");
        System.out.println("Activity is Logged");
        System.out.println("Steps"+steps);
        System.out.println("Calories Burned:- "+calories);
        System.out.println("................................................................");
    }
    @Override
    public void generateReport(){
        System.out.println("................................................................");
        System.out.println("FITNESS REPORT");
        System.out.println("................................................................");
        System.out.println("Total Steps:- "+steps);
        System.out.println("Calories Burned:- "+calories);
        System.out.println("................................................................");
    }
    @Override
    public void sendAlert() {
        int remainingSteps = 5000 - steps;
        if (steps < 5000)
            System.out.println("You need to walk more " + remainingSteps + " steps");
        else
            System.out.println("Foal of 5000 steps is Achieved");
    }
}
