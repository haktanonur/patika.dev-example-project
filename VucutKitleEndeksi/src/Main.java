import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo,boy;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = scanner.nextDouble();

        double vke = (kilo)/(boy*boy);

        System.out.println("Vücut kitle endeksiniz : " + vke);
    }
}
