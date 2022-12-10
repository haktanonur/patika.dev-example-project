import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public BattleLoc(Player player, String locationName, Obstacle obstacle, String award, int maxObstacle) {
        super(player, locationName);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = randomObsNumber();
        System.out.println("Şuan buradasınız : " + getLocationName());
        System.out.println("Dikkatli ol burada "+ obsNumber +" tane " + getObstacle().getObsName() + " yaşıyor !");
        System.out.print("(S)avaş veya (K)aç ! ");
        String selectCase = scanner.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S") && combat(obsNumber)){
            // Savaş işlemleri
                System.out.println(this.getLocationName() + " tüm düşmanları yendiniz !");
                return true;
            }

        if (this.getPlayer().getHealth() <= 0){
            System.out.println("Öldünüz !!!");
            return false;
        }
        return true;
    }
    public boolean combat(int obsNumber){
        for (int i = 1; i <= obsNumber; i++){
            this.getObstacle().setObsHealth(this.getObstacle().getOrijinalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getObsHealth() > 0){
                System.out.print("(V)ur veya (K)aç : ");
                String selectCombat = scanner.nextLine().toUpperCase();
                if (selectCombat.equals("V")){
                    System.out.println("Vurdunuz!");
                    obstacle.setObsHealth(this.obstacle.getObsHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getObsHealth() > 0){
                        System.out.println();
                        System.out.println(getObstacle().getObsName() + " size vurdu !");
                        int realDamage = this.getObstacle().getObsDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (realDamage < 0){
                            realDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - realDamage);
                        afterHit();
                    }
                }
                else {
                    return false;
                }
            }
            if (this.getObstacle().getObsHealth() < this.getPlayer().getHealth()){
                System.out.println("Canavarları öldürdünüz !");
                System.out.println(this.getObstacle().getAward() + " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
            }
            else {
                return false;
            }
        }
        return true;
    }
    public void afterHit(){
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getObsName() + " Canı : " + this.getObstacle().getObsHealth());
        System.out.println();
    }
    public void playerStats(){
        System.out.println("Oyuncu Değerleri");
        System.out.println("--------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth() + "\n" +
                "Hasar : " + this.getPlayer().getTotalDamage() + "\n" +
                "Para : " + this.getPlayer().getMoney() + "\n" +
                "Silah : " + this.getPlayer().getInventory().getWeapon().getWeaponName() + "\n" +
                "Zırh : " + this.getPlayer().getInventory().getArmor().getArmorName() + "\n" +
                "Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println();
    }
    public void obstacleStats(int i){
        System.out.println(i + ". " + this.getObstacle().getObsName() + " Değerleri");
        System.out.println("--------------------------");
        System.out.println("Sağlık : " + this.getObstacle().getObsHealth());
        System.out.println("Hasar : " + this.getObstacle().getObsDamage());
        System.out.println("Ödül : " + this.getObstacle().getAward());
        System.out.println();
    }

    public int randomObsNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
