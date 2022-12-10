import java.util.Comparator;
import java.util.TreeSet;

public class Brand {
    private String brandName;
    private int brandId;

    private static TreeSet<Brand> brands = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
           return o1.brandName.compareTo(o2.brandName);
        }
    });
    static {
        createBrand();
    }
    public Brand(int brandId,String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }
    public static void createBrand(){
        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));
    }
    public static void printBrands(){
        System.out.println("Markalarımız\n" +
                "--------------");
        for (Brand b: brands){
            System.out.println(b.brandId + " - " + b.getBrandName());
        }
    }
    public static Brand getBrand(int brandId){
        for (Brand b: brands){
            if (brandId==b.getBrandId()){
                return b;
            }
        }
        return null;
    }
}
