package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secim;

        komutlar();

        while (true) {
            System.out.print("Bir seçenek girin (1-4): ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    test();
                    break;
                case 2:
                    cizKucukKare();
                    break;
                case 3:
                    istediginKare(scanner);
                    break;
                case 4:
                    System.out.println("Uygulama kapatiliyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Yanlis secim yaptın. Lutfen tekrar deneyin.");
            }
        }
    }


    private static void komutlar() {

        System.out.println();
        System.out.println("Konsol Uygulamasi Komutlari:");
        System.out.println();//boş
        System.out.println("1. 'test': Programin calisip calismadigini kontrol eder.");
        System.out.println("2. 'kare': Ekrana 3x3 kare oluşturur.");
        System.out.println("3. 'istedigin kare': İstediğin buyuklukte kare oluşturur.");
        System.out.println("4. 'kapat': Uygulamayi kapatir.");
    }


    private static void test() {
        System.out.println("_-_-_-_-_-_");
    }


    private static void cizKucukKare() {
        System.out.println("3x3 Kare:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private static void istediginKare(Scanner tarayici) {
        System.out.print("Kare buyuklugunu girin : ");
        int boyut = tarayici.nextInt();
        tarayici.nextLine(); // Boş satır için

        System.out.println(boyut + "x" + boyut + " Kare:");
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}