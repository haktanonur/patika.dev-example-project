import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hava sıcaklığını giriniz : ");
        heat = scanner.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsin .");
        }
        else if (5 <= heat && heat <= 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (15< heat && heat<=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else {
            System.out.println("Yüzme'ye gidebilirsin.");
        }

    }
}
