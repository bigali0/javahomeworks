package homeworks.day2.polymorphismDemo;

public class ConcoleLogger extends BaseLogger {
    public void log(String message){
        System.out.println("Logged to console : " + message);
    }


}
