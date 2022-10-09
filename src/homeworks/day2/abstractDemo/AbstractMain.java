package homeworks.day2.abstractDemo;

public class AbstractMain {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
       // customerManager.dataBaseManager = new OracleDataBaseManager();  bu referansi verdigimizde
        // customerManagerin database manager Oracle olur istenirse degistirilir
        //customerManager.dataBaseManager = new SqlServerDatabaseManager(); // SQL managere gecti
        customerManager.dataBaseManager = new MySqlDatabaseManager(); //My Sql oldu
        customerManager.getCustomers();


    }
}
