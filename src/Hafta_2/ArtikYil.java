package Hafta_2;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year, dort, dortyuz = 0;
//Kullanıcıdan Girdi Alma
        Scanner inp = new Scanner(System.in);

        System.out.println("Yil Giriniz : ");
        year = inp.nextInt();
        dort = year % 4;
//koşullandırma
        if (year % 100 == 0) {
            dortyuz = year % 400;
        }
        if ((dort == 0) && (dortyuz == 0)) {
            System.out.println("Artik Yildir");
        } else {
            System.out.println("Artik yil  degildir");
        }
    }
}
