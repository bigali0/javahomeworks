package homeworks.day2.interfaces;

public class InterfacesMain {
    public static void main(String[] args) {
//        ICustomerDal CustomerDal =new ICustomerDal() {  // Interfacelerde abstractlar gibi new lenemez
//            @Override
//            public void Add() {
//
//            }
//        }
       // ICustomerDal CustomerDal =new OracleCustomerDal();  // boyle referans olabilir

        CustomerManager customerManager =new CustomerManager(new OracleCustomerDal());  // argumant  degisebilir
       // customerManager.customerDal = new OracleCustomerDal(); Customer managerde
        // public CustomerManager(ICustomerDal customerDal) kullanildigindan new OracleDal() a gerek yok
        customerManager.add();
    }
}
