import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArbitraryInsertion extends Methods {
    public static void start() {
        ArrayList<Integer> route = new ArrayList<>();
        route.add(initialCity);
        route.add(initialCity);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        ArrayList<Integer> network = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            network.add(i);
        }
        Collections.shuffle(network);

        for (int i = 0; i < len; i++) {
            ArrayList<Integer> singleList = new ArrayList<>();
            singleList.add(network.get(i));
            Helpers.insert(route, singleList);
        }

        int lenOfNetwork = Helpers.getSumOfLengths(route);
        Helpers.print("Arbitrary Insertion", route, lenOfNetwork);
    }
}
