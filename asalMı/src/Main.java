import java.util.Scanner;

public class Main {

        static boolean IsPrime(int number, int i) {
            if (number == 2)
                return true;
            if (number < 2)
                return false;
            if (number % i == 0) {
                return false;
            }
            if (i + 1 == number) {
                return true;
            }
            return IsPrime(number, i + 1);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Sayı giriniz: ");
            int number = sc.nextInt();
            if (IsPrime(number, 2)) {
                System.out.println(number + " sayısı asaldır");
            } else {
                System.out.println(number + " sayısı  asal değildir");
            }
        }
    }
}