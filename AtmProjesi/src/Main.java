import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int hak = 3;
        int bakiye = 2000;
        int islem = 0;
        while (hak>0) {
            System.out.print("Kullanıcı Adı : ");
            userName = scanner.nextLine();
            System.out.println();
            System.out.print("Şifre : ");
            password = scanner.nextLine();
            if (userName.equals("onurhaktan") && password.equals("123asd")) {
                System.out.println("Sisteme başarılı şekilde giriş yapılmıştır");
                while (islem != 4){
                    System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz;\n" +
                            "1-Bakiye sorgulama\n" +
                            "2-Para Yatırma\n" +
                            "3-Para Çekme\n" +
                            "4- Sistemden Çıkış");
                    islem = scanner.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.println("Güncel Bakiyeniz : " + bakiye);
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz miktarı giriniz : ");
                            int miktar = scanner.nextInt();
                            bakiye+=miktar;
                            System.out.println("Paranız başarıyla yatmıştır.\n" +
                                    "Güncel bakiye = " + (bakiye));
                            break;
                        case 3:
                            System.out.println("Çekmek istediğiniz miktarı giriniz :");
                            int miktar2 = scanner.nextInt();
                            if (miktar2>bakiye){
                                System.out.println("Yetersiz Bakiye !");
                            }
                            else {
                                bakiye-=miktar2;
                                System.out.println("Paranız başarıyla çekilmiştir.\n" +
                                        "Güncel bakiye = " + (bakiye));
                            }
                            break;
                        case 4:
                            break;
                    }
                }

            }
            else {
                hak--;
                if (hak == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }
    }
}
