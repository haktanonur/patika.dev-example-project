import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        value = input.nextInt();
        for (int i = 1; i < value; i*=2){
            System.out.println(i);
        }
    }
}
