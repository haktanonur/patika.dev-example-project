import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i<n; i++){
            if (n % i ==0){
                toplam +=i;
            }
        }
        if (toplam == n){
            System.out.println(n + " mükemmel sayıdır.");
        }
        else {
            System.out.println(n + " mükemmel sayı değildir.");
        }
    }
}
