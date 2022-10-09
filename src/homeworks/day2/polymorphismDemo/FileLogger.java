package homeworks.day2.polymorphismDemo;

public class FileLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Logged to file : " + message);
    }
}
