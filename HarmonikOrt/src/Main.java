public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double harmonikAvrg = 0;
        for (int i = 0; i < list.length; i++){
            harmonikAvrg += 1.0 / list[i];
        }
        System.out.println("Harmonik ortalama : " + harmonikAvrg);
    }
}
