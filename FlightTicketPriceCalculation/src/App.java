import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        int yolculukTipi = scanner.nextInt();

        scanner.close();

        double toplamTutar = 0;

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double normalTutar = mesafe * 0.10;

            if (yas < 12) {
                normalTutar *= 0.50;
            } else if (yas >= 12 && yas <= 24) {
                normalTutar *= 0.90;
            } else if (yas > 65) {
                normalTutar *= 0.70;
            }

            double indirimliTutar = 0;

            if (yolculukTipi == 2) {
                indirimliTutar = normalTutar * 0.80;
                toplamTutar = (normalTutar + indirimliTutar);
            } else {
                toplamTutar = normalTutar;
            }

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}