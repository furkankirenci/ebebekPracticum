package Hafta_3;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac elemanli bir seri olacak : ");
        int digitNum = input.nextInt();
        int total = 0;
        int a = 1, b = 0;
        if (digitNum == 0){
            System.out.println(b);
        }else if(digitNum == 2) {
            System.out.println(b);
            System.out.println(a);
        }else {
            System.out.println(b);
            System.out.println(a);
            int lastToplam = a+b;
            for (int i = 3; i <= digitNum; i++) {
                total = a+b;
                b=a;
                a=total;
                System.out.println(total);
            }
        }
    }
}
