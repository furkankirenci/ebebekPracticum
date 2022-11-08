package Hafta_3;

import java.util.Scanner;

public class BuyukKucukSayi {
    public static void main(String[] args) {
//Kullanıcıdan Girdi Alma
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi  gireceksiniz : ");
        int num = input.nextInt();
        int max = 0, min = 0, newNum;
//sayıları döngüye sokma
        for (int i = 1; i <= num; i++) {
            System.out.print("Sayiniz : ");
            newNum = input.nextInt();
            if (i == 1) {                        //Giren sayının ilk sayı olup olmadığını kontrol etme
                max = newNum;
                min = newNum;
            } else {                            //Büyüklük kontrolu
                if (newNum > max) {
                    max = newNum;
                } else if (newNum < min) {       //Küçüklük kontrolu
                    min = newNum;
                }
            }
        }
        System.out.println("En buyuk sayi : " + max);
        System.out.println("En kucuk sayi : " + min);
    }
}


