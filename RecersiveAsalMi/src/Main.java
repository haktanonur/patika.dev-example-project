import java.util.Scanner;

public class Main {
    static boolean asalMi(int number, int i){
        if (number <=1){
            return false;
        }
        if (i * i > number){
            return true;
        }
        if (number % i == 0){
            return false;
        }
        return asalMi(number, i+1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("Enter Number: ");
            int number=scanner.nextInt();
            if(asalMi(number,2)){
                System.out.println(number+" is a Prime Number!!");
            }else{
                System.out.println(number+" is not a Prime Number! Try Again...");
            }
        }
    }
}
