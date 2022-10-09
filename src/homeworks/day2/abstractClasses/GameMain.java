package homeworks.day2.abstractClasses;

public class GameMain {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

//        GameCalculator gameCalculator = new GameCalculator() {
//            @Override
//            public void hesapla() {
//
//            }   ABSTRACT SINIFLAR ASLA NEW LENEMEZ
//        }
        GameCalculator gameCalculator= new WomanGameCalculator(); // olabilir abstract clas diger
        // class in referansini tutabilir buradaki gibi
    }
}
