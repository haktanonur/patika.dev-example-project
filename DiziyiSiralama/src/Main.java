import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int n = scanner.nextInt();

        int[] list = new int[n];
        int startIndex = 0;
        for (int i = 1; i <= n; i++){
            System.out.print(i + ". Elemanı : ");
            int eleman = scanner.nextInt();
            list[startIndex++] = eleman;
            eleman++;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
