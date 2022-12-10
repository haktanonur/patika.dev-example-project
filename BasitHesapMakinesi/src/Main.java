import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        a = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b = scanner.nextInt();
        int islem;
        System.out.println("Yapmak istediğiniz işlemi seçiniz;\n" +
                            "1.Toplama\n" +
                            "2.Çıkarma\n" +
                            "3.Çarpma\n" +
                            "4.Bölme\n");
        islem = scanner.nextInt();

        switch (islem){
            case 1:
                int c = a+b;
                System.out.println(a +"+" +b +" = "+c);
                break;

            case 2:
                int d = a-b;
                System.out.println(a +"-" +b +" = "+d);
                break;

            case 3:
                int e = a*b;
                System.out.println(a +" x " +b +" = "+e);
                break;

            case 4:
                int f = a/b;
                System.out.println(a +" / " +b +" = "+f);
                break;
        }

    }
}
