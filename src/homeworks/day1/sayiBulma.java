package homeworks.day1;

public class sayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 3;
        boolean varMi= false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                // System.out.println("Sayi mevcuttur");
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayi mevcuttur");
        }else {
            System.out.println("Sayi mevcut degildir");
        }
    }
}
