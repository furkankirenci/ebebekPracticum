package Hafta_3;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
//Kullanıcıdan Girdi Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = inp.nextInt();
        int i = 1;
        int total = 0;
//Sayıya bölünen sayıları bulma
        while (i < num) {
            if (num % i == 0) {
                total += i;
                i++;
            } else {
                ++i;
            }
        }
        if (total == num){
            System.out.println(num+" bir mukemmel sayidir.");
        }else {
            System.out.println(num+" bir mukemmel sayi degildir.");
        }
    }
}
