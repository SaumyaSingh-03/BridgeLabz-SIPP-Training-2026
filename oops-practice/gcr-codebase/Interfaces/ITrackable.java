package Interfaces;

public interface ITrackable {

    void logActivity();

    default void resetData(){
        System.out.println("..................................................................");
        System.out.println("Your Data Has Been Reset");
        System.out.println("..................................................................");
    }
}
