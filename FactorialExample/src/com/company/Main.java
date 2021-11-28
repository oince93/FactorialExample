package com.company;
import  java.util.Scanner;
public class Main {

    private static int i;

    public static void main(String[] args) {
        int girdi;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Sayı Giriniz : ");
            girdi = s.nextInt();
        }while (girdi < 0 || girdi > 20);
        System.out.println(girdi + "! = " + faktoriyel(girdi));

    }

    public  static long faktoriyel(int sayi) {
        if (sayi < 0 || sayi > 20) {
            return  -1;
        }
        long sonuc = 1;
        for (int i = 0; i < sayi; i++) {
            sonuc *= i + 1;
        }
        return  sonuc;
    }

}


