import java.util.ArrayList;
import java.util.Scanner;

public class AddressManager {
    private static Scanner scanner = new Scanner(System.in);
    public static void addAddress(User user){
        Address newAddress;
        System.out.println("Yeni adres ekleme alanı : ");
        System.out.print("1 - Ev adresi\n" +
                "2 - İş adresi\n" +
                "Adres seçimini giriniz : ");
        int address = scanner.nextInt();
        System.out.println("Şehir giriniz : ");
        String city = scanner.nextLine();
        System.out.println("İlçe giriniz : ");
        String district = scanner.nextLine();
        System.out.println("Sokak giriniz : ");
        String street = scanner.nextLine();
        System.out.println("Adres tarifini giriniz : ");
        String addressDetail = scanner.nextLine();
        if (address == 1){
            newAddress = new HomeAddress(city,district,street,addressDetail);
        }
        else {
            newAddress = new BusinessAddress(city,district,street,addressDetail);
        }
        user.setAddressList(newAddress);
    }
    public static void deleteAddress(User user, int id){
        user.getAddressList().remove(id - 1);
        System.out.println("Silme işlemi gerçekleşti.");
    }
}
