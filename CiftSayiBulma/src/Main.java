import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value;
        int sum = 0,counter =0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir değer giriniz : ");
        value = scanner.nextInt();

        /*for (int i = 0; i<value; i+=2){
            System.out.print(i + ", ");
        }*/
        // üç ve dörde tam bölünen sayıların ortalaması

        for (int i =0; i<value; i++) {
            if (i % 3==0 && i%4 ==0 && i !=0){
                sum+=i;
                counter++;
            }
            else {
                System.out.println("4 ve 3'e tam bölünen bir sayısı yoktur.");
                break;
            }
        }
        double avg = (sum / counter);
        System.out.println("3'e ve 4'e tam bölünen sayıların toplamlarının ortalaması = " + avg );


    }
}
