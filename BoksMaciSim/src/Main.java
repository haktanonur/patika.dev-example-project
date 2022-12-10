public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mehmet",15,150,100,45);
        Fighter f2 = new Fighter("Yalçın",25,110,90,31);
        Ring r = new Ring(f1,f2,85,105);
        r.run();
    }
}
