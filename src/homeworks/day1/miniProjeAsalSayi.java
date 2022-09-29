package homeworks.day1;

public class miniProjeAsalSayi {
    public static void main(String[] args) {
        int number = 11;
        int remainder = number % 2;
        System.out.println(remainder);

        boolean isPrime = true; // default olarak sayi asal kabul edilir

        if(number==1){
            System.out.println("Sayi asal degildir"); // en kucuk asal sayi 2 dir buyuzden 1 asal degildir
            return;

        }
        if(number<1){  //en kucuk asl sayi 2 dir buyuzden 1 den kucuk sayilar gecersiz olur
            System.out.println("Gecersiz sayi");

        }

        for (int i=2; i< number;i++){
            if(number % i ==0){
                isPrime =false;
            }
        }
        if(isPrime){
            System.out.println("Sayi asaldir");
        }else {
            System.out.println("Sayi asal degildir");
        }
    }
}
