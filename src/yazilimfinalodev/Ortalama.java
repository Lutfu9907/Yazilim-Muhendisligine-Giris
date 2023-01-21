package yazilimfinalodev;


import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Vize Notunu Giriniz: ");
        int vize = scanner.nextInt();
        System.out.print("Lütfen Final Notunu Giriniz: ");
        int finall = scanner.nextInt();

        while (vize < 0 || vize > 100 || finall < 0 || finall > 100) {
            System.out.print("Lütfen Vize Notunu Tekrar Giriniz: ");
            vize = scanner.nextInt();
            System.out.print("LütfenFinal Notunu Tekrar Giriniz: ");
            finall = scanner.nextInt();
        }

        System.out.println(OrtHesaplama(vize, finall));

    }

    public static String OrtHesaplama(int Vize, int Final) {

        double ortalama = (Vize * 0.4) + (Final * 0.6);

        if (ortalama >= 90 && ortalama <= 100) {
            return "AA";
        } else if (ortalama >= 85 && ortalama < 90) {
            return "BA";
        } else if (ortalama >= 80 && ortalama < 85) {
            return "BB";
        } else if (ortalama >= 75 && ortalama < 80) {
            return "CB";
        } else if (ortalama >= 70 && ortalama < 75) {
            return "CC";
        } else if (ortalama > 0 && ortalama < 70) {
            return "FD";
        } else if (ortalama == 0) {
            return "FF";
        } else {
            return "ERROR";
           
        }

    }

}