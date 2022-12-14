import java.util.Scanner;

public abstract class Location {
    public static Scanner scanner = new Scanner(System.in);
    private String locationName;
    private Player player;

    public Location(Player player,String locationName) {
        this.player = player;
        this.locationName = locationName;
    }

    public abstract boolean onLocation();

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
