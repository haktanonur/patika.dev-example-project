import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz : ");
        int n = scanner.nextInt();

        for (int i = 1; i<=n; i++){
            for (int k = 1; k <= (n-i); k++ ){
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = (n - i) * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
