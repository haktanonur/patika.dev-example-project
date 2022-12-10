import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, chemistry, music,history, turkish;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Math grade : ");
        math = input.nextInt();

        System.out.print("Enter your Physics grade : ");
        physics = input.nextInt();

        System.out.print("Enter your Chemistry grade : ");
        chemistry = input.nextInt();

        System.out.print("Enter your Music grade : ");
        music = input.nextInt();

        System.out.print("Enter your History grade : ");
        history = input.nextInt();

        System.out.print("Enter your Turkish grade : ");
        turkish = input.nextInt();

        int total = (math+physics+chemistry+music+history+turkish);
        double average = total / 6 ;

        System.out.println("Your GPA is "+ average);

        System.out.println(average>=60 ? "Success" : "Failed");

    }
}
