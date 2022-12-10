import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk kenarın uzunluğunu girin : ");
        a = scanner.nextInt();
        System.out.print("İkinci kenarın uzunluğunu girin : ");
        b = scanner.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs = "+ c);

        double u = ((a+b+c) / 2);

        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Alan: " + area);





    }
}
