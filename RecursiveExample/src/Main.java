import java.util.Scanner;

public class Main {
    static int azaltma(int number){
        if (number <= 0){
            return number;
        }
        System.out.print(number + " ");
        return azaltma(number - 5);
    }
    static int arttirma(int number, int i){
        if (number > i){
            return number;
        }
        System.out.print(number + " ");
        return arttirma(number + 5, i);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Sayı : ");
        int a = scn.nextInt();

        arttirma(azaltma(a),a);
    }
}
