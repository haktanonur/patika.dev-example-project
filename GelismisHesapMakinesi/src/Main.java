import java.util.Scanner;

public class Main {
    static void toplama(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true){
            System.out.print(i++ +". sayı : ");
            number = scanner.nextInt();
            if (number == 0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuç = " + result);
    }

    static  void cikarma(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 0;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scanner.nextInt();
        for (int i = 1; i<=counter; i++){
            System.out.print(i + ". sayı : ");
            number = scanner.nextInt();
            if (i == 1){
                result+=number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç = " + result);
    }

    static  void carpma(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true){
            System.out.print(i++ +". sayı : ");
            number = scanner.nextInt();
            if (number == 1){
                break;
            }
            if (number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç = " + result);
    }

    static void bolme(){
        Scanner scanner = new Scanner(System.in);
        double number, result=0.0;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scanner.nextInt();
        for (int i = 1; i<=counter; i++){
            System.out.print(i + ". sayı : ");
            number = scanner.nextInt();

            if (i != 1 && number==0){
                System.out.println("Böleni 0 giremezsiniz !!!");
                continue;
            }
            if (i==1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç = " + result);
    }
    static void usAlma(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabanı giriniz : ");
        int taban = scanner.nextInt();
        System.out.print("Üssü giriniz : ");
        int üs = scanner.nextInt();
        int result = 1;
        for (int i=1; i<=üs; i++){
            result*=taban;
        }
        System.out.println("Sonuç = " + result);
    }
    static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaçıncı sayının faktöriyelini almak istediğinizi yazın : ");
        int counter = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= counter; i++){
            result = result *i;
        }
        System.out.println(counter +". sayının faktoriyeli =  " + result);
    }
    static void modAlma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = scanner.nextInt();
        int mod = (a % b);
        System.out.println(a + " sayısının " + b +" sayısına göre modu : " + mod );
    }
    static void dikdortgenHesabı(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk kenarın uzunluğunu giriniz : ");
        int a = scanner.nextInt();
        System.out.println("İkinci kenarın uzunluğunu giriniz : ");
        int b = scanner.nextInt();
        int alan = (a*b);
        int cevre = 2*(a+b);
        System.out.println("Dikdörtgen'in alanı : " + alan +"\n" +
                           "Dikdörtgen'in çevresi : " + cevre);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgenHesabı();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
