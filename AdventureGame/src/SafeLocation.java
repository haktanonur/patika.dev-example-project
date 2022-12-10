public abstract class SafeLocation extends Location{

    public SafeLocation( Player player,String locationName) {
        super(player, locationName);
    }
    public boolean onLocation() {
        return true;
    }

}
