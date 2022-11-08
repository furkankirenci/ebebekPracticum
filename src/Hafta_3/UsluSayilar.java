package Hafta_3;

import java.util.Scanner;

//Üslü sayılar için oluşturulan method
public class UsluSayilar {
    public static int us(int a, int b) {
        int result;
        if (b == 0) {
            return 1;
        }
        result = a * us(a, b - 1);
        return result;
    }
    public static void main(String[] args) {
//Kullanıcıdan Girdi Alma
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayiyi giriniz : ");
        int a = input.nextInt();
        System.out.print("Us sayiyi giriniz : ");
        int b = input.nextInt();
        System.out.println(us(a, b));
    }
}
