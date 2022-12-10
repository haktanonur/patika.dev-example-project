import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=1;
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = scanner.nextInt();
        for (int i =1; i<=n; i++){
            System.out.print(i +". Sayıyı Giriniz : ");
            a = scanner.nextInt();
            if (i == 1){
                max = a;
                min = a;
            }
            else {
                if (a>max) {
                    max = a;
                }
                else if (a<min){
                    min = a;
                }
            }
        }
        System.out.println("En büyük değer = " + max);
        System.out.println("En küçük değer = " + min);
    }
}
