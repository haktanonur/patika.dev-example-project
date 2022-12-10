import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dateofBirth;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz : ");
        dateofBirth = scanner.nextInt();
        if (dateofBirth % 12 == 0){
            System.out.println("Çin Zodyağı burcunuz : Maymun");
        }
        else if (dateofBirth % 12 == 1){
            System.out.println("Çin Zodyağı burcunuz : Horoz");
        }
        else if (dateofBirth % 12 == 2){
            System.out.println("Çin Zodyağı burcunuz : Köpek");
        }
        else if (dateofBirth % 12 == 3){
            System.out.println("Çin Zodyağı burcunuz : Domuz");
        }
        else if (dateofBirth % 12 == 4){
            System.out.println("Çin Zodyağı burcunuz : Fare");
        }
        else if (dateofBirth % 12 == 5){
            System.out.println("Çin Zodyağı burcunuz : Öküz");
        }
        else if (dateofBirth % 12 == 6){
            System.out.println("Çin Zodyağı burcunuz : Kaplan");
        }
        else if (dateofBirth % 12 == 7){
            System.out.println("Çin Zodyağı burcunuz : Tavşan");
        }
        else if (dateofBirth % 12 == 8){
            System.out.println("Çin Zodyağı burcunuz : Ejderha");
        }
        else if (dateofBirth % 12 == 9){
            System.out.println("Çin Zodyağı burcunuz : Yılan");
        }
        else if (dateofBirth % 12 == 10){
            System.out.println("Çin Zodyağı burcunuz : At");
        }
        else if (dateofBirth % 12 == 11){
            System.out.println("Çin Zodyağı burcunuz : Koyun");
        }
        else {
            System.out.println("Geçersiz bir değer girdiniz ");
        }



    }
}
