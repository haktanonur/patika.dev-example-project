import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını girin (n):");
        int n = scan.nextInt();
        System.out.print("Kümenin grup sayısını girin (r) :");
        int r = scan.nextInt();
        int total = 1;
        int total2 =1;
        int total3 =1;
        for (int i = 1; i<=n; i++){
            total *= i;
        }
        for (int i = 1; i<=r; i++){
            total2 *= i;
        }
        for (int i = 1; i<=(n-r); i++){
            total3 *= i;
        }
        double c = (total)/(total2 * total3 );
        System.out.println("N' in, r'li kombinasyonu  = " + c);
    }
}
