import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        double kdvTutari = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz : ");
        tutar = input.nextInt();

        System.out.println("KDV'siz tutar : " + tutar);

        double kdvlitutar = tutar + (tutar * kdvTutari);

        System.out.println("KDV'li tutar : " + kdvlitutar);

        System.out.println("KDV tutarı : " + (kdvlitutar-tutar));

    }
}
