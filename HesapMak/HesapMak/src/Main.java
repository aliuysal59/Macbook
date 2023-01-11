import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sayi1, sayi2, sonuc, islem;
        String toplama = "+", cikartma = "-", carpma = "*", bolme = "/";

        Scanner giris = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz.......:");
        sayi1 = giris.nextDouble();
        System.out.print("İkinci Sayiyi Giriniz........:");
        sayi2 = giris.nextDouble();

        System.out.println("----------------------------:");
        System.out.println("HESAPLAMA ICIN ISLEM SECINIZ");
        System.out.println("----------------------------:");
        System.out.println("1-) Toplama");
        System.out.println("2-) Çıkartma");
        System.out.println("3-) Çarpma");
        System.out.println("4-) Bölme");
        System.out.print("Seçiminiz:");
        islem = giris.nextDouble();

        if (islem == 1) {
            sonuc = sayi1 + sayi2;
            System.out.print("Toplam....:" + sonuc);
        }
        if (islem == 2) {
            sonuc = sayi1 - sayi2;
            System.out.print("Çıkartma....:" + sonuc);
        }
        if (islem == 3) {
            sonuc = sayi1 * sayi2;
            System.out.print("Çarpma....:" + sonuc);
        }
        if (islem == 4) {
            sonuc = sayi1 / sayi2;
            System.out.print("Bölme....:" + sonuc);
        } else {
            System.out.print("Hatali Seçim Yaptınız!!!!");
        }
    }
}