import java.util.ArrayList;

public class NearestInsertion extends Methods {
    public static void start() {
        ArrayList<Integer> route = new ArrayList<>();
        route.add(initialCity);
        route.add(initialCity);

        for (int i = 1; i < len; i++) {
            ArrayList<Integer> listOfClosestCities = new ArrayList<>();
            int minL = Integer.MAX_VALUE;

            for (int a = 0; a < route.size() - 1; a++) {
                int[] distances = TurkishNetwork.distances[route.get(a)];

                for (int b = 0; b < len; b++) {
                    if (!route.contains(b) && distances[b] <= minL) {
                        if (distances[b] < minL) {
                            minL = distances[b];
                            listOfClosestCities.clear();
                        }
                        listOfClosestCities.add(b);
                    }
                }
            }
            Helpers.insert(route, listOfClosestCities);
        }

        int lenOfNetwork = Helpers.getSumOfLengths(route);
        Helpers.print("Nearest Insertion", route, lenOfNetwork);
    }
}
