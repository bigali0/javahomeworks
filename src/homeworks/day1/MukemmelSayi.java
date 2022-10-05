package homeworks.day1;

public class MukemmelSayi {
    public static void main(String[] args) {
        //kendinden baska pozitif tum tam bolunenlerin sayisi toplami  kendisine esit olan sayi
        // 6 --->1,2,3
        //28 --->1,2,4,7,14
        int number = 28;
        int total = 0;

        for(int i=1; i<number;i++){
            if(number % i ==0){
                total = total + i;
            }
        }

        if(total == number){
            System.out.println("Mukemmel sayidir");
        }else {
            System.out.println("Mukemmel sayi degildir");
        }
    }
}
