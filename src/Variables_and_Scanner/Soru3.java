package Variables_and_Scanner;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi ve yasinizi giriniz: ");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("Isminiz: "+isim+"\nSoyisminiz: "+soyisim+"\nYasiniz: "+yas+"\nKaydiniz basarila tamamlanmistir.");
    }
}
