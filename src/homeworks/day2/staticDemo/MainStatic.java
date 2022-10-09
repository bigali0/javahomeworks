package homeworks.day2.staticDemo;

public class MainStatic {
    public static void main(String[] args) {
        ProductManager1 manager = new ProductManager1();
        Product product = new Product();
        product.price = 10;
        product.name="Mause";

        manager.add(product);

        DatabaseHelper.Crud.Delete(); // seklinde kullanilabilir
        DatabaseHelper.Connection.createConnection(); // seklinde kullanilabilir


    }
}
