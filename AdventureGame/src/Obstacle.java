public class Obstacle {
    private int id;
    private String obsName;
    private int obsDamage;
    private int obsHealth;
    private int award;
    private int orijinalHealth;


    public Obstacle(int id, String obsName, int obsDamage, int obsHealth, int award) {
        this.id = id;
        this.obsName = obsName;
        this.obsDamage = obsDamage;
        this.obsHealth = obsHealth;
        this.orijinalHealth = obsHealth;
        this.award = award;
    }
    public int getOrijinalHealth() {
        return orijinalHealth;
    }

    public void setOrijinalHealth(int orijinalHealth) {
        this.orijinalHealth = orijinalHealth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObsName() {
        return obsName;
    }

    public void setObsName(String obsName) {
        this.obsName = obsName;
    }

    public int getObsDamage() {
        return obsDamage;
    }

    public void setObsDamage(int obsDamage) {
        this.obsDamage = obsDamage;
    }

    public int getObsHealth() {
        return obsHealth;
    }

    public void setObsHealth(int obsHealth) {
        if (obsHealth < 0){
            obsHealth = 0;
        }
        this.obsHealth = obsHealth;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }
}
