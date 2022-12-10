import java.util.ArrayList;

public class Notebook extends Product {
    private static int nId;
    private static ArrayList<Notebook> notebooks = new ArrayList<>();

    public Notebook(String name, int price, int discountRate, int amount,
                    Brand brand, String memory, String inch, String ram) {
        super(nId, name,price, discountRate, amount, brand, memory, inch, ram);
        nId++;
    }
    public Notebook() {
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
                brandFilter();
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

        Notebook notebook = new Notebook(name, price,discountRate,amount,brand,memory,inch,ram);
        this.notebooks.add(notebook);
        System.out.println("Eklenen ürünün id numarası : " + notebook.getId());
    }

    @Override
    public void delete() {
        getProducts();
        System.out.print("Silmek istediğiniz ürünün Id numarasını giriniz : ");
        int id = scanner.nextInt();
        notebooks.remove(id - 1);
        System.out.println("----------------   Güncel ürün listesi --------------------");
        getProducts();
    }

    @Override
    public void getProducts() {
        print(null);
    }

    public void print(ArrayList<Notebook> notebookList){
        if(notebookList==null){
            notebookList=this.notebooks;
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook n:notebookList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(),n.getName(),n.getPrice(),n.getBrand().getBrandName(),n.getAmount(),
                    n.getDiscountRate(),n.getRam(),n.getInch(),n.getMemory());
        }
    }
    public void brandFilter(){
        scanner.nextLine();
        System.out.print("Filtrelemek istediğiniz markayı giriniz : ");
        String filter = scanner.nextLine();
        ArrayList<Notebook> filterNotebook = new ArrayList<>();
            for (Notebook n: notebooks){
                if (filter.equals(getBrand().getBrandName())){
                    filterNotebook.add(n);
            }
        }
            print(filterNotebook);
    }
    public static int getnId() {
        return nId;
    }
}
