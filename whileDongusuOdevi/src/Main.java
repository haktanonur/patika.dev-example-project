import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int deger;
        int toplam =0;
        Scanner scanner = new Scanner(System.in);
       do {
            System.out.print("Bir değer giriniz : ");
            deger = scanner.nextInt();
            if ((deger % 2) ==0){
                if(deger % 4 ==0){
                    toplam += deger;
                }
            }
        } while (deger % 2 ==0);

       System.out.println(toplam);
    }
}
