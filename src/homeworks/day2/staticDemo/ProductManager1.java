package homeworks.day2.staticDemo;

public class ProductManager1 {
    public void add(Product product) {
       // ProductValidator validator = new ProductValidator();  eger
        // public static boolean isValid(Product product);  static method olmasaydi new ile kullanilirdi
       // if (validator.isValid(product)) {
        if (ProductValidator.isValid(product)) { //seklinde kullanilir static olunca class ismiyle cagirilir
            System.out.println("Eklendi");
        } else {
            System.out.println("Urun bilgileri gecersizdir");
        }
        ProductValidator productValidator = new ProductValidator(); // bisy() methodu static
        // olmadigindan new kullanilmali
        productValidator.bisey();


    }
}