package Hafta_4;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarınFrekansı {
    public static void main(String[] args) {
//Kullanıcıdan Girdi Alma
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi girilecek : ");
        int n = input.nextInt();
        int[] list = new int[n];  //n elemanlı liste oluşturma
        int add = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Sayi Giriniz : ");
            int number = input.nextInt();
            list[add++] = number;
        }
        Arrays.sort(list);
        System.out.println("Girilen Sayilar Sirayla " + Arrays.toString(list));
        for (int j = 0; j < n; j++) {
// Burada if kullanmamızın sebebi, tekrar eden sayıların her biri için tekrardan tekrar ediş sayısını yazdırmak istemememizdir.
            if ((j != 0) && (list[j] == list[j - 1])) {
                continue;
            }
            counter = 0;
            for (int k = 0; k < n; k++) {    //tekrar sayısını bulma
                if ((j != k) && (list[j] == list[k])) {
                    counter++;
                }
            }
            if (counter != 0) {  //Tekrar edilme sayısına göre çıktı verme
                System.out.println(list[j] + " sayisi " + (counter + 1) + " kere tekrar edilmistir.");
            }
        }
    }
}
