package Hafta_3;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
//Kullanıcıdan Girdi Alma
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz : ");
        int digitNum = input.nextInt();
//üçgen oluşturma
        int tempBasNum = digitNum;
        for (int i = 1; i <= digitNum; i++) {
            for (int j = 1; j < (i); j++) {   //Başa boşluk koyma
                System.out.print(" ");
            }
            int k = 1;
            do {                                //yıldız koyma
                System.out.print("*");
                k++;
            } while (k <= 2 * tempBasNum - 1);
            System.out.println();
            tempBasNum--;
        }
    }
}

