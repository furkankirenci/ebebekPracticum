package Hafta_3;

import java.util.Scanner;

public class RecursiveOruntu {
    static int pattern(int n, int i) {
//Örüntü oluşturma
        if (n > 0) {
            System.out.println(n);
            i++;
            return pattern(n - 5, i);

        } else {
            System.out.println(n);
            for (i = i; i > 1; i--) {
                n += 5;
                System.out.println(n);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//Kullanıcıdan Girdi Alma
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi  giriniz : ");
        int n = input.nextInt();
        pattern(n, 1);
    }
}
