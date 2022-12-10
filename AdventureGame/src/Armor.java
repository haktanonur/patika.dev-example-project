public class Armor {
    private int armorId;
    private String armorName;
    private int block;
    private int armorPrice;

    public Armor(int armorId, String armorName, int block, int armorPrice) {
        this.armorId = armorId;
        this.armorName = armorName;
        this.block = block;
        this.armorPrice = armorPrice;
    }

    public static Armor[] armors(){
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1,"Hafif",1,15);
        armorList[1] = new Armor(2,"Orta",3,25);
        armorList[2] = new Armor(3,"Ağır",5,40);
        return armorList;
    }

    public static Armor getArmorByID(int id){
        for (Armor a: Armor.armors()){

            if (a.getArmorId() == id){
                return a;
            }
        }
        return null;
    }
    public int getArmorId() {
        return armorId;
    }

    public void setArmorId(int armorId) {
        this.armorId = armorId;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getArmorPrice() {
        return armorPrice;
    }

    public void setArmorPrice(int armorPrice) {
        this.armorPrice = armorPrice;
    }
}
