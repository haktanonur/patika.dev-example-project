import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int[] listMin = new int[list.length];
        int[] listMax = new int[list.length];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int sayi = scanner.nextInt();

        int a=0, b=0;

        for (int i = 0; i < list.length; i++){
            if (list[i] >= sayi){
                listMax[a] = list[i];
                a++;
            }
            if (list[i] <= sayi){
                listMax[b] = list[i];
                b++;
            }
        }

        int min = listMax[0];
        int max = listMin[0];

        for (int i:listMax){
            if (i<min && i>sayi){
                min=i;
            }
        }

        for (int i:listMin){
            if (i>max && i<sayi){
                max=i;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi: " + max);
        System.out.println("Girilen sayidan buyuk en yakin sayi: " + min);

    }
}
