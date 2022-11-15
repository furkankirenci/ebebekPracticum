package Hafta_4;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Kullanıcıdan Girdi Alma
        System.out.print("Sayi adeti nedir ? ");
        int n = input.nextInt();
        int[] arr = new int[n]; //n elemanlı dizi oluşturma
        int start = 0;
        for (int i = 0; i < n; i++) {  //for döngüsü ile n defa sayı alma
            System.out.print("Sayi giriniz : ");
            int number = input.nextInt();
            arr[start++] = number;  //elemanı diziye ekleme
        }
        Arrays.sort(arr);   //elemanları sıralama
        System.out.println(Arrays.toString(arr)); //array elemanlarını yazdırma
    }
}
