import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz: ");
        int satirSayisi = in.nextByte();

        System.out.println("Sutun sayisini giriniz: ");
        int sutunSayisi = in.nextByte();

        MineSweeper2 ms = new MineSweeper2(satirSayisi,sutunSayisi);
        ms.baslat();

        in.close();
    }
}