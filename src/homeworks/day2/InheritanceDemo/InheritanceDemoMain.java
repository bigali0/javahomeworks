package homeworks.day2.InheritanceDemo;

public class InheritanceDemoMain {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        //krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager()); // istenilen argument buraya konabilir  POLYMORPHISM

    }
}
