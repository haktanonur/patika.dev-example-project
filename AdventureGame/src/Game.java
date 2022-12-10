import java.util.Scanner;
public class Game {
    private Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz ! ");
        System.out.print("Lütfen isminizi giriniz : " );
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " oyuna giriş yaptı .");
        player.selectChar();
        Location location = null;

        while (true){
            player.playerInfo();
            String locationInfo = ("-------BÖLGELER-------\n" +
                            "1 - Güvenli Ev --> Burada canınız yenilecek ve herhangi bir tehditle karşılaşmayacaksınız!\n" +
                            "2 - Market --> Burada silah veya zırh alabilirsiniz ! \n" +
                            "3 - Mağara --> Dikkatli ol canavarlar çıkabilir ! \n" +
                            "4 - Orman --> Dikkatli ol canavarlar çıkabilir ! \n" +
                            "5 - Nehir --> Dikkatli ol canavarlar çıkabilir ! \n" +
                            "0 - Çıkış yap --> Oyunu bitir. \n" +
                            "Gitmek istediğiniz bölgeyi seçiniz :");
            System.out.print(locationInfo);
            int selectLocation = scanner.nextInt();
            switch (selectLocation){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (location == null){
                System.out.println("Oyundan çıkış yapılıyor...");
                break;
            }
            if (!location.onLocation()){
                System.out.println("\t\tKaybettiniz !");
                break;
            }
        }

    }
}
