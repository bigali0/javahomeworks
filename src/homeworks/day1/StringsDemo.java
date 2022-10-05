package homeworks.day1;

public class StringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";


        System.out.println(mesaj);

	   /*   System.out.println("Eleman sayisi : "+mesaj.length());
	        System.out.println("5.eleman :"+mesaj.charAt(4));  // 5. karakteri verir
	         System.out.println(mesaj.concat(" Yasasin! "));
			 System.out.println(mesaj.startsWith("B"));
			 System.out.println(mesaj.endsWith("."));
			 char[] karakterler = new char[5];
			 mesaj.getChars(0,5,karakterler,0);  // mesaj kelimesinin harflerini alip karakter array inde toplar 0 . indeksten itibaren
		     System.out.println(karakterler);
			 System.out.println(mesaj.indexOf('a'));  // index verir
			 System.out.println(mesaj.lastIndexOf('a'));*/

        String yeniMesaj = 	mesaj.replace(' ','-');

        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

        for(String kelime : mesaj.split(" ") ){
            System.out.println(kelime);

            System.out.println(mesaj.toLowerCase());
            System.out.println(mesaj.toUpperCase());
            System.out.println(mesaj.trim());  // mesajin basinda , sonunda bosluk varsa trim () ile bosluklar alinabilir
        }
    }
}
