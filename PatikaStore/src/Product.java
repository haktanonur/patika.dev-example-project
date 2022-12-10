import java.util.HashSet;
import java.util.Scanner;

public abstract class Product {
    protected Scanner scanner=new Scanner(System.in);
    static HashSet<Brand> brands = new HashSet<>();
    private int id;
    private String name;
    private int price;
    private int discountRate;
    private int amount;
    private Brand brand;
    private String memory;
    private String inch;
    private String ram;

    public Product(int id, String name, int price, int discountRate, int amount, Brand brand, String memory, String inch, String ram) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.brand = brand;
        this.memory = memory;
        this.inch = inch;
        this.ram = ram;
    }
    public Product(){

    }
    public abstract void menu();
    public abstract void add();
    public abstract void delete();
    public abstract void getProducts();

    public int getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getInch() {
        return inch;
    }

    public void setInch(String inch) {
        this.inch = inch;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
