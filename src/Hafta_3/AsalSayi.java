package Hafta_3;

public class AsalSayi {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {    //100e kadar saydırma
            int sayac = 0;
            for (int j = 2; j < i; j++) {   //sayıya kadar olan sayıları kontrol etme
                if (i % j == 0) {
                    sayac++;
                    break;
                }
            }
            if (sayac == 0) {      //eğer sayaç sıfırsa sadece 2'yi yazdırma
                System.out.println(i);
            }
        }
    }
}
