import java.util.ArrayList;

public class CheapestInsertion extends Methods {

    public static void start() {
        ArrayList<Integer> route = new ArrayList<>();
        route.add(initialCity);
        route.add(initialCity);

        ArrayList<Integer> allCities = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            allCities.add(i);
        }

        for (int i = 0; i < len; i++)
            Helpers.insert(route, allCities);

        int lenOfNetwork = Helpers.getSumOfLengths(route);
        Helpers.print("Cheapest Insertion", route, lenOfNetwork);
    }
}
