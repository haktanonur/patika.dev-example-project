public class ToolStore extends SafeLocation{
    public ToolStore(Player player) {
        super(player,"Mağaza");
    }
    public boolean onLocation() {
        System.out.println("Hoşgeldiniz ! Şu anda mağazadasınız !");
        String process = "********** İŞLEMLER **********\n" +
                "1 - Silahlar\n" +
                "2 - Zırhlar\n" +
                "3 - Marketten Çıkış\n" +
                "Yapmak istediğiniz işlemi seçiniz : ";
        boolean showMenu = true;
        while (showMenu){
            System.out.println(process);
            int selectChoice = scanner.nextInt();
            while (selectChoice < 1 || selectChoice > 3) {
                System.out.println("Geçersiz bir seçim yaptınız! Tekrar giriniz : ");
                selectChoice = scanner.nextInt();
            }
            switch (selectChoice){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Marketten çıkış yapılıyor !");
                    showMenu = false;
                    break;
            }
        }
                return true;
        }


    public void printWeapon(){
        System.out.println("------------Silahlar------------");
        for (Weapon w : Weapon.weapons()){
            System.out.println("Id - " + w.getWeaponId() + ","+ w.getWeaponName() + ", Hasar : " + w.getWeaponDamage()
            + ", Fiyat : " + w.getWeaponPrice());
        }
        System.out.println("0 - Çıkış ");
    }
    public void buyWeapon(){
        System.out.print("Bir silah seçiniz : ");
        int selectWeaponID = scanner.nextInt();
        while (selectWeaponID < 0 || selectWeaponID> Weapon.weapons().length ){
            System.out.print("Geçersiz bir değer seçtiniz, tekrar seçiniz : ");
            selectWeaponID = scanner.nextInt();
        }
        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponByID(selectWeaponID);

            if (selectedWeapon != null){
                if (selectedWeapon.getWeaponPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }else {
                    System.out.println(selectedWeapon.getWeaponName() + " silahını satın aldınız .");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getWeaponPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }
    public void printArmor(){
        System.out.println("------------Zırhlar------------");
        for (Armor a : Armor.armors()){
            System.out.println("Id : " + a.getArmorId() + ", " + a.getArmorName() +
                    ", Engelleme : " + a.getBlock() + ", Fiyat : " + a.getArmorPrice());
        }
        System.out.println("0 - Çıkış ");
    }
    public void buyArmor(){
        System.out.print("Bir zırh seçiniz : ");
        int selectArmorID = scanner.nextInt();
        while (selectArmorID < 0 || selectArmorID> Armor.armors().length){
            System.out.print("Geçersiz bir değer seçtiniz, tekrar seçiniz : ");
            selectArmorID = scanner.nextInt();
        }
        if (selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorByID(selectArmorID);

            if (selectedArmor != null){
                if (selectedArmor.getArmorPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }else {
                    System.out.println(selectedArmor.getArmorName() + " zırhı satın aldınız .");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getArmorPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }


}
