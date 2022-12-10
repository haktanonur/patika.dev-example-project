import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orjHealth;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    private Scanner scanner = new Scanner(System.in);
    // Constructor da sadece oyuncunun ismini alacağız diğer değerleri
    // oyunda kullanıcıya seçtireceğiz onun için constructor da kullanmaya gerek yok

    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("\t\tKarakterler");
        System.out.println("----------------------------------");
        for (GameChar gameChar : charList){
            System.out.println("ID : " + gameChar.getId()+
                    "\t Karakter Adı : " + gameChar.getName()+
                    "\t Hasar : " + gameChar.getDamage()+
                    "\t Sağlık : " + gameChar.getHealth()+
                    "\t Para : " + gameChar.getMoney());
        }
        System.out.println("----------------------------------");
        System.out.print("Bir karakter seçiniz : ");
        int selectChar = scanner.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
        }
        /*System.out.println("Seçtiğiniz karakter : " + this.getCharName() +
                ", Hasar : " + this.getDamage()+
                ", Sağlık : " + this.getHealth()+
                ", Para : " + this.getMoney());*/
    }
    public void playerInfo(){
        System.out.println("Silahınız : " + this.getInventory().getWeapon().getWeaponName()+
                ", Zırhınız : " + this.getInventory().getArmor().getArmorName()+
                ", Bloklama : " + this.getInventory().getArmor().getBlock()+
                ", Hasar : " + this.getTotalDamage()+
                ", Sağlık : " + this.getHealth()+
                ", Para : " + this.getMoney());
    }
    public void initPlayer(GameChar gameChar){
        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrjHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getWeaponDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrjHealth() {
        return orjHealth;
    }

    public void setOrjHealth(int orjHealth) {
        this.orjHealth = orjHealth;
    }
}
