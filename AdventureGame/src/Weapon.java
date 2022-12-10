public class Weapon {
    private int weaponId;
    private String weaponName;
    private int weaponDamage;
    private int weaponPrice;

    public Weapon(int weaponId, String weaponName, int weaponDamage, int weaponPrice) {
        this.weaponId = weaponId;
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.weaponPrice = weaponPrice;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon(1,"Tabanca", 2, 15);
        weaponList[1] = new Weapon(2,"Kılıç", 3, 35);
        weaponList[2] = new Weapon(3,"Tüfek", 7, 45);
        return weaponList;
    }
    public static Weapon getWeaponByID(int id){
        for (Weapon w: Weapon.weapons()){

            if (w.getWeaponId() == id){
                return w;
            }
        }

        return null;
    }
    /*public static Weapon getWeaponByID(int id){
        Weapon weapon = null;
        for (Weapon w: Weapon.weapons()){

            if (w.getWeaponId() == id){
                weapon =  w;
            }
        }

        return weapon;
    }*/
    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getWeaponPrice() {
        return weaponPrice;
    }

    public void setWeaponPrice(int weaponPrice) {
        this.weaponPrice = weaponPrice;
    }
}
