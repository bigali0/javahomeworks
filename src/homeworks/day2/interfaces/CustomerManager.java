package homeworks.day2.interfaces;

public class CustomerManager {

    private ICustomerDal customerDal;  //Disaridan erisime kapali

    public CustomerManager(ICustomerDal customerDal){ // customerDal yerine   mysqldal gonderebilirsin
        this.customerDal =customerDal;
    }

    public void add(){
        // is kodlari
        customerDal.Add();

    }
}
