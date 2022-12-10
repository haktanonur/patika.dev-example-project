import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas,yolculukTipi;
        double km,indirimliBilet;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gideceğiniz mesafeyi (KM cinsinden) yazınız : ");
        km = scanner.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz ( 1 => Tek Yön, 2=> Gidiş-Dönüş) : ");
        yolculukTipi = scanner.nextInt();

        if (km<=0){
            System.out.println("Hatalı değer girdiniz.");
        }
        else if (yas < 0){
            System.out.println("Hatalı değer girdiniz.");
        }
        else if (yolculukTipi>2 && yolculukTipi<1){
            System.out.println("Hatalı değer girdiniz.");
        }
        else {
            if (yas<=12 && yolculukTipi==2){
                double biletFiyatı = (km * 0.10);
                double yasIndirimi = (biletFiyatı * 0.5);
                indirimliBilet = (biletFiyatı - yasIndirimi);
                double gidisDonus = (indirimliBilet * 0.2);
                indirimliBilet = (indirimliBilet - gidisDonus);
                System.out.println(indirimliBilet);
             }
            else if (yas<=12 && yolculukTipi == 1){
                double biletFiyatı = (km * 0.10);
                double yasIndirimi = (biletFiyatı * 0.5);
                indirimliBilet = (biletFiyatı - yasIndirimi);
                System.out.println(indirimliBilet);
            }
            else if (yas>12 && yas<=24 && yolculukTipi==2){
                double biletFiyatı = (km * 0.10);
                double yasIndirimi = (biletFiyatı * 0.1);
                indirimliBilet = (biletFiyatı - yasIndirimi);
                double gidisDonus = (indirimliBilet * 0.2);
                indirimliBilet = (indirimliBilet - gidisDonus);
                System.out.println(indirimliBilet);
            }
            else if (yas>12 && yas<=24 && yolculukTipi==1){
                double biletFiyatı = (km * 0.10);
                double yasIndirimi = (biletFiyatı * 0.1);
                indirimliBilet = (biletFiyatı - yasIndirimi);
                System.out.println(indirimliBilet);
            }
            else if (yas>65 && yolculukTipi==2){
                double biletFiyatı = (km * 0.10);
                double yasIndirimi = (biletFiyatı * 0.3);
                indirimliBilet = (biletFiyatı - yasIndirimi);
                double gidisDonus = (indirimliBilet * 0.2);
                indirimliBilet = (indirimliBilet - gidisDonus);
                System.out.println(indirimliBilet);
            }
            else if (yas>65 && yolculukTipi==1){
                double biletFiyatı = (km * 0.10);
                double yasIndirimi = (biletFiyatı * 0.3);
                indirimliBilet = (biletFiyatı - yasIndirimi);
                System.out.println(indirimliBilet);
            }
            else if (yas<=65 && yas>24 && yolculukTipi == 2){
                double biletFiyatı = (km * 0.10);
                double gidisDonus = (biletFiyatı * 0.2);
                biletFiyatı = (biletFiyatı - gidisDonus);
                System.out.println(biletFiyatı);
            }
            else {
                double biletFiyatı = (km * 0.10);
                System.out.println(biletFiyatı);
            }
        }

    }
}
