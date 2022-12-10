import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2;
        int ebob = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1' i giriniz : ");
        n1 = scanner.nextInt();
        System.out.print("n2' i giriniz : ");
        n2 = scanner.nextInt();

        for (int i = n1; i>=1; i--) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
                System.out.println("n1 ve n2 ' nin ebobu : " + i);
                break;
            }
        }
        //System.out.println("------------------------------");
        /*for (int k = 1; k<=n1; k++){
            if ((n1 % k == 0) && (n2%k == 0)){
                ebob = k;
                System.out.println("n1 ve n2 ' nin ebobu : " + k);
            }
        }*/
        System.out.println("------------------------------");
        for (int k=1; k <= (n1 * n2); k++){
            if ((k % n1 == 0) && (k % n2 == 0)) {
                System.out.println("n1 ve n2 ' nin ekoku : " + k);
                break;

            }
        }

        System.out.println("------------------------------");
        System.out.println("n1 ve n2 ' nin ekoku : " +(n1 * n2) / ebob);


    }
}
