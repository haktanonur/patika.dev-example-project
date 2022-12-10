import java.util.ArrayList;

public class NearestNeighbor extends Methods {
    public static void start() {
        ArrayList<Integer> route = new ArrayList<>();
        route.add(initialCity);

        int next = initialCity;

        for (int i = 1; i < len; i++) {
            int[] dis = TurkishNetwork.distances[next];
            int minL = Integer.MAX_VALUE;
            int closestIndex = -1;

            for (int a = 0; a < len; a++) {
                if (!route.contains(a) && dis[a] != 0 && dis[a] < minL) {
                    minL = dis[a];
                    closestIndex = a;
                }
            }
            if (closestIndex != -1) route.add(closestIndex);

            next = closestIndex;
        }
        route.add(initialCity);

        int lenOfNetwork = Helpers.getSumOfLengths(route);
        Helpers.print("Nearest Neighbour", route, lenOfNetwork);
    }
}
