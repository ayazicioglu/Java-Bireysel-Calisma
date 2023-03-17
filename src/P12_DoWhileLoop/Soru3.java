package P12_DoWhileLoop;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int sayi= scan.nextInt();
        int i=1;
        boolean sonuc=false;
        do {
                if (i*i==sayi){
                    System.out.println("Karekök= "+i);
                    sonuc=true;
                    break;
                }else {
                    i++;

                }
        }while (i*i<=sayi);
        System.out.println(sonuc);



    }
}
