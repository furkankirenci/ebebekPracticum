package Hafta_4;

import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspozuBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Kullanıcıdan Girdi Alma
        System.out.print("matris kac satirdan olusuyor : ");
        int i = input.nextInt();
        System.out.print("matris kac sutundan olusuyor : ");
        int j = input.nextInt();
//matris ve traspozu olacak şekilde 2 boyutlu 2 array oluşturma
        int[][] matris = new int[i][j];
        int[][] transpoz = new int[j][i];

        for (int x = 0; x < i; x++) { //satır sayısı kadar döngü
            System.out.println("---Siradaki Satir---");
            for (int y = 0; y < j; y++) { // sütun sayısı kadar döngü
                System.out.print("satir elemani giriniz : ");
                int number = input.nextInt();
                matris[x][y] = number;
                transpoz[y][x] = number; //girilen sayıyı transpoz matriste yerine yazma
            }
        }
        System.out.println("---Transpoz Matris---");
        for (int x = 0; x < transpoz.length; x++) {
            System.out.println(Arrays.toString(transpoz[x])); //transpoz matrisi yazdırma
        }
    }
}
