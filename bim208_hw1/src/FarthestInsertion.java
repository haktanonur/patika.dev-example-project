import java.util.ArrayList;

public class FarthestInsertion extends Methods {

    public static void start() {
        ArrayList<Integer> route = new ArrayList<>();
        route.add(initialCity);
        route.add(initialCity);

        for (int i = 1; i < len; i++) {
            ArrayList<Integer> listOfFarthestCities = new ArrayList<>();
            int maxDistance = Integer.MIN_VALUE;

            for (int a = 0; a < route.size(); a++) {
                int[] distances = TurkishNetwork.distances[route.get(a)];

                for (int b = 0; b < len; b++) {
                    if (!route.contains(b) && distances[b] >= maxDistance) {
                        if (distances[b] > maxDistance) {
                            maxDistance = distances[b];
                            listOfFarthestCities.clear();
                        }
                        listOfFarthestCities.add(b);
                    }
                }
            }

            Helpers.insert(route, listOfFarthestCities);
        }

        int lenOfNetwork = Helpers.getSumOfLengths(route);
        Helpers.print("Farthest Insertion", route, lenOfNetwork);
    }

}
