import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            array.add(i);
        }
        ThreadRace threadRace = new ThreadRace(array);
        executorService.execute(threadRace);
    }
}
