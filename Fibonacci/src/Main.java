import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int islemSayisi = 9;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i =1; i <= islemSayisi; i++){
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
            a = b;
            b = c;
        }
        }
    }
