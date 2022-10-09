package homeworks.day2.polymorphismDemo;

public class PolymorphismMain {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(),new ConcoleLogger()};
//        for(BaseLogger logger:loggers){
//            logger.Log("Log mesaji");
//        }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger()); // new FileManager ve digerleride konabilir
        customerManager.add();
    }
}
