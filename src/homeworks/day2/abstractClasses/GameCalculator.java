package homeworks.day2.abstractClasses;

public abstract class GameCalculator {
    public abstract void hesapla(); //Abstract method ta diger classlarda inherit ediliyorsa
    // bu methodu kendince yazmak overide etmek zorunda

    public final void gameOver(){ //bu method baska classlarda override edilemez oldugu gibi kullanilir

        System.out.println("Oyun bitti ");
    }
}
