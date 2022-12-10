public class SafeHouse extends SafeLocation {

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }
    public boolean onLocation() {
        System.out.println("Şu anda güvenli evdesiniz !\n" +
                           "Canınız Yenilendi !");
        this.getPlayer().setHealth(this.getPlayer().getOrjHealth());
        return true;
    }

}
