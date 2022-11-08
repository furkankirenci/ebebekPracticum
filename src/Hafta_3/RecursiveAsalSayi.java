package Hafta_3;

import java.util.Scanner;

public class RecursiveAsalSayi {
//Asal kontrol etme methodu
    public static boolean isAsal(int n, int i) {
        if(n <= 2){     //2den küçük sayıları eleme
            return (n == 2) ? true : false;
        }
        if ((i >= n)) {   //asallık kontrol etme
            return true;
        }
        if ((n % i == 0)) { //n sayısına bölünebilmeyi kontrol etme
            return false;
        }
        return isAsal(n, i + 1);
    }

    public static void main(String[] args) {
//Kullanıcıdan Girdi Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz : ");
        int n = inp.nextInt();
        String str = (isAsal(n, 2)) ? "Asal" : "Asal degil";
        System.out.println(str);
    }
}
