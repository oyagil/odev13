package org.example;

import java.util.Scanner;

public class MuhasebeProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çalışanın Adı: ");
        String ad = scanner.nextLine();

        System.out.print("Çalışanın Soyadı: ");
        String soyad = scanner.nextLine();

        System.out.print("Çalışılan Gün Sayısı: ");
        int calisilanGunSayisi = scanner.nextInt();

        double maas = hesaplaMaas(calisilanGunSayisi);

        System.out.println(ad + " " + soyad + " adlı çalışanın maaşı: " + maas + " TL");
    }

    public static double hesaplaMaas(int calisilanGunSayisi) {
        double gunlukMaas = 500; // Günlük maaş
        double ekstraPrim = 1000; // Ekstra prim her fazla gün için

        if (calisilanGunSayisi > 25) {
            // 25 günü aşan her gün için ekstra prim eklenir
            int fazlaGunSayisi = calisilanGunSayisi - 25;
            double ekstraPrimToplam = fazlaGunSayisi * ekstraPrim;

            return (25 * gunlukMaas) + ekstraPrimToplam;
        } else {
            // 25 günden azsa sadece günlük maaş çarpılır
            return calisilanGunSayisi * gunlukMaas;
        }
    }
}
