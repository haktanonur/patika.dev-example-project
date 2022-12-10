import java.util.ArrayList;

public class MobilePhone extends Product{

    private static ArrayList<MobilePhone> mobilePhones = new ArrayList<>();
    private static int pId=1;
    private int battery;
    private String color;
    private int camResolution;

    public MobilePhone( String name, int price, int discountRate, int amount, Brand brand, String memory, String inch, String ram, int battery, String color, int camResolution) {
        super(pId, name, price, discountRate, amount, brand, memory, inch, ram);
        pId++;
        this.battery = battery;
        this.color = color;
        this.camResolution = camResolution;
    }

    public MobilePhone() {
    }

    @Override
    public void menu() {
        System.out.println("""
                1 - Ürünleri listeleme
                2 - Yeni ürün ekleme
                3 - Listeden ürün silme
                4 - Ürünleri id numarasına göre sıralama
                5 - Ürünleri markaya göre filtreleme""");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                getProducts();
                break;
            case 2:
                add();
                break;
            case 3:
                delete();
                break;
            case 4:
                getProducts();
                break;
            case 5:
                //brandFilter();
                break;
        }
    }

    @Override
    public void add() {
        scanner.nextLine();
        System.out.print("Ürünün adı : ");
        String name = scanner.nextLine();

        System.out.print("Ürünün fiyatı : ");
        int price = scanner.nextInt();

        System.out.print("Ürünün indirim oranı : ");
        int discountRate = scanner.nextInt();

        System.out.print("Ürünün stok sayısı : ");
        int amount = scanner.nextInt();

        Brand.printBrands();
        System.out.print("Ürünün markasını seçiniz : ");
        Brand brand = Brand.getBrand(scanner.nextInt());

        scanner.nextLine();
        System.out.print("Ürünün hafızası : ");
        String memory = scanner.nextLine();

        System.out.print("Ürünün ekran boyutu : ");
        String inch = scanner.nextLine();

        System.out.print("Ürünün ram'i : ");
        String ram = scanner.nextLine();

        System.out.print("Ürünün pil gücü : ");
        int battery = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Ürünün rengi : ");
        String color = scanner.nextLine();

        scanner.nextLine();
        System.out.print("Ürünün kamera çözünürlüğü : ");
        int camResolution = scanner.nextInt();

        MobilePhone mobilePhone = new MobilePhone(name, price,discountRate,amount,brand,memory,inch,ram,battery,color,camResolution);
        this.mobilePhones.add(mobilePhone);
        System.out.println("Eklenen ürünün id numarası : " + mobilePhone.getId());


    }

    @Override
    public void delete() {
        getProducts();
        System.out.print("Silmek istediğiniz ürünün Id numarasını giriniz : ");
        int id = scanner.nextInt();
        mobilePhones.remove(id - 1);
        System.out.println("----------------   Güncel ürün listesi --------------------");
        getProducts();
    }

    @Override
    public void getProducts() {
        print(null);
    }
    public void print(ArrayList<MobilePhone> phoneList){
        if(phoneList==null) phoneList=this.mobilePhones;
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   | Pil Kapasitesi  | Renk           | Kamera    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (MobilePhone n:phoneList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | %-9s | \n",
                    n.getId(),n.getName(),n.getPrice(),n.getBrand().getBrandName(),n.getAmount(),
                    n.getDiscountRate(),n.getRam(),n.getInch(),n.getMemory(),n.getBattery(),n.getColor(),n.getCamResolution());
        }
    }

    public void brandFilter(){
        scanner.nextLine();
        System.out.print("Filtrelemek istediğiniz markayı giriniz : ");
        String filter = scanner.nextLine();
        ArrayList<MobilePhone> filterphone = new ArrayList<>();
        for (MobilePhone m: mobilePhones){
            if (filter.equals(getBrand().getBrandName())){
                filterphone.add(m);
            }
        }
        print(filterphone);
    }

    public static int getpId() {
        return pId;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCamResolution() {
        return camResolution;
    }

    public void setCamResolution(int camResolution) {
        this.camResolution = camResolution;
    }
}
