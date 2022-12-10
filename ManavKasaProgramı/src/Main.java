import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç kilo : ");
        kilo = scanner.nextInt();
        System.out.print("Elma Kaç kilo : ");
        kilo = scanner.nextInt();
        System.out.print("Domates Kaç kilo : ");
        kilo = scanner.nextInt();
        System.out.print("Muz Kaç kilo : ");
        kilo = scanner.nextInt();
        System.out.print("Patlıcan Kaç kilo : ");
        kilo = scanner.nextInt();

        double total = (armut*kilo) +(elma*kilo) +(muz*kilo)+(domates*kilo)+(patlican*kilo);

        System.out.println("Toplam tutar : " +total);
    }
}
