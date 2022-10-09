package homeworks.day2.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager =new EmployeeManager();
        CustomerManager1 customerManager1 = new CustomerManager1();
        customerManager1.Add();
    }
}
