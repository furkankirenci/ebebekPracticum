package Hafta_1;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo, boy, indeks;
//Kullanıcıdan Girdi Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("kilo (kg) : ");
        kilo = inp.nextDouble();

        System.out.print("Boy (m) : ");
        boy = inp.nextDouble();
//index hesaplatma
        indeks = kilo / boy /boy;

        System.out.println("Vücut Kitle İndeksiniz : "+ indeks);

//Koşullandırma
        boolean kosul1 = indeks < 18.5;
        boolean kosul2 = indeks < 25;
        boolean kosul3 = indeks < 30;
        boolean kosul4 = indeks < 40;
        String son = kosul1 ? "Zayıf" : "";
        System.out.println(son);




    }
}
