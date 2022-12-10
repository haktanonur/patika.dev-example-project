

import java.util.Random;
import java.util.Scanner;

public class MineSweeper2 {
    int satirSayisi;
    int sutunSayisi;
    int mayinSayisi;
    int mayinSatir;
    int mayinSutun;
    int inputSatir;
    int inputSutun;
    int kontrolSatirMin;
    int kontrolSutunMin;
    int kontrolSatirMax;
    int kontrolSutunMax;
    int oyuncuSecimi = 0;
    boolean game = true;
    String[][] board;
    int[][] mayinlar;
    Random r;
    Scanner in = new Scanner(System.in);

    MineSweeper2(int satirSayisi, int sutunSayisi) {
        this.satirSayisi = satirSayisi;
        this.sutunSayisi = sutunSayisi;
    }
    public void baslat() {
        createArr();
        System.out.println("Oyuna Hosgeldin!");
       /* for (int i = 0; i < satirSayisi; i++) {                         //Mayinlarin tutuldugu diziyi yazdirir
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(mayinlar[i][j] + " ");
            }
            System.out.println();
        }*/
        while (game) {
            yazdir();
            veriAl();
            kontrolEt();
        }
        in.close();
    }

    private void kontrolEt() {                                                      //Mayina basip basmadigini eger basmadiysa sectigi noktanın etrafinda kac tane mayin oldugunu ekrana yazdiriyoruz
        mayinSayisi = 0;
        kontrolSatirMin = inputSatir - 1;
        kontrolSutunMin = inputSutun - 1;
        kontrolSatirMax = inputSatir + 1;
        kontrolSutunMax = inputSutun + 1;
        if (mayinlar[inputSatir][inputSutun] == 1) {
            game = false;
            System.out.println("Oyun bitti! Kaybettin!");

        } else {
            if (kontrolSatirMin < 0) {
                kontrolSatirMin = 0;
            }
            if (kontrolSutunMin < 0) {
                kontrolSutunMin = 0;
            }
            if (kontrolSatirMax > satirSayisi - 1) {
                kontrolSatirMax = inputSatir;
            }
            if (kontrolSutunMax > sutunSayisi - 1) {
                kontrolSutunMax = inputSutun;
            }

            for (int i = kontrolSatirMin; i <= kontrolSatirMax; i++) {
                for (int j = kontrolSutunMin; j <= kontrolSutunMax; j++) {
                    if (mayinlar[i][j] == 1) {
                        mayinSayisi++;
                    }
                }
            }
            board[inputSatir][inputSutun] = Integer.toString(mayinSayisi);
            oyuncuSecimi++;
        }

        if (oyuncuSecimi >= (satirSayisi * sutunSayisi) - ((satirSayisi * sutunSayisi) / 4)) {
            game = false;
            System.out.println("Tebrikler oyunu kazandiniz!");
        }
    }

    private void veriAl() {

        while (true) {
            System.out.println("Satir sayisi giriniz: ");
            while (true) {
                inputSatir = in.nextInt();
                if (inputSatir >= 0 && inputSatir < satirSayisi) {
                    break;
                } else {
                    System.err.println("Hatali deger girdiniz! Tekrar giriniz:");
                }
            }
            System.out.println("Sutun sayisi giriniz: ");

            while (true) {
                inputSutun = in.nextInt();
                if (inputSutun >= 0 && inputSutun < sutunSayisi) {
                    break;
                } else {
                    System.err.println("Hatali deger girdiniz! Tekrar giriniz:");
                }
            }
            if (board[inputSatir][inputSutun].equals("-")) {
                break;
            } else {
                System.err.println("Hatali secim. Acmis oldugun bir kutucugu tekrar acamazsin!");
            }
        }

    }

    private void createArr() {
        board = new String[satirSayisi][sutunSayisi];
        mayinlar = new int[satirSayisi][sutunSayisi];
        r = new Random();

        for (int i = 0; i < satirSayisi; i++) {                             //Ekranda gozukecek oyun tahtamizin elemanlarini board dizisine atadik
            for (int j = 0; j < sutunSayisi; j++) {
                board[i][j] = "-";
            }
        }
        for (int i = 0; i < satirSayisi; i++) {                             //Mayinlarin tutulacagi dizinin butun elemanlarini 0 yaptik.
            for (int j = 0; j < sutunSayisi; j++) {
                mayinlar[i][j] = 0;
            }
        }

        for (int i = 0; i < (satirSayisi * sutunSayisi) / 4; i++) {                           //Mayinlarin konumunu belirleyip tutuldugu dizide degerlerini 1 yapiyoruz.
            mayinSatir = r.nextInt(satirSayisi);
            mayinSutun = r.nextInt(sutunSayisi);
            if (mayinlar[mayinSatir][mayinSutun] != 1) {
                mayinlar[mayinSatir][mayinSutun] = 1;

            }
        }
    }

    private void yazdir() {
        for (int i = 0; i < satirSayisi; i++) {                         //Tahtanin tutuldugu diziyi yazdirir
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        //for (int i = 0; i < satirSayisi; i++) {                         //Mayinlarin tutuldugu diziyi yazdirir
        //    for (int j = 0; j <sutunSayisi; j++) {
        //        System.out.print(mayinlar[i][j] + " ");
        //    }
        //    System.out.println();
        //}
    }


}





