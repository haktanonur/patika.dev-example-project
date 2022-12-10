import java.util.Scanner;

public class Store {
    public Scanner scanner = new Scanner(System.in);
    public void run(){
        while (true){
            System.out.println("Patika Store Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri\n" +
                    "2 - Cep Telefonu İşlemleri\n" +
                    "3 - Marka Listele\n" +
                    "0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.menu();
                    break;
                case 2:
                    MobilePhone mobilePhone = new MobilePhone();
                    mobilePhone.menu();
                    break;
                case 3:
                    Brand.printBrands();
                    break;
                case 0:
                    System.out.println("Sistemden çıkış yapılıyor.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz !");
                    break;
            }
        }
    }
}
