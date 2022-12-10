import java.util.Scanner;

public class Main {
    static boolean isPalindrome(int number){
        int temp = number, lastNumber, reverseNumber = 0;
        while (temp != 0){
            lastNumber =  temp % 10; // Son basamağı öğreniriz.
            reverseNumber = (reverseNumber*10)+lastNumber; // son basamağı yeni sayının ilk basamağı yaparız.
            temp /= 10; // elimizdeki sayıyı 10 a bölerek diğer basamaklarına bakmak için başa döneriz.
        }
        if (number == reverseNumber){
            System.out.println(number + " sayısı palindrom sayıdır.");
            return true;

        }
        else {
            System.out.println(number + " sayısı palindrom sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        isPalindrome(scanner.nextInt());
    }
}
