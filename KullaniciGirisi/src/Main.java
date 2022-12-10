import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz :");
        username = scanner.nextLine();
        System.out.print("Şifrenizi giriniz :");
        password = scanner.nextLine();
        while (true){

            if (username.equals("onurhaktan")&& password.equals("12345")){
                System.out.println("Girişiniz başarıyla gerçekleşmiştir");
                break;
            }
            else if (username.equals("onurhaktan")&& !(password.equals("12345"))){
                System.out.println("Şifreniz yanlış girilmiştir.");
            }
            else if (!(username.equals("onurhaktan"))&& password.equals("12345")){
                System.out.println("Kullanıcı adınız yanlış girilmiştir.");
                break;
            }
            else {
                System.out.println("Giriş Başarısız.");
                break;
            }

        }
    }
}
