import java.util.ArrayList;

public class Helpers {
    public static void insert(ArrayList<Integer> route, ArrayList<Integer> listOfClosestCities) {
        int minLen = Integer.MAX_VALUE;
        int insertionIndex = -1;
        int indexOfInsertedElement = -1;

        for (Integer i : listOfClosestCities) {
            for (int i1 = 0; i1 < route.size() - 1; i1++) {
                if (route.contains(i)) continue;
                int currentLen = TurkishNetwork.distances[i][route.get(i1)] + TurkishNetwork.distances[i][route.get(i1 + 1)] - TurkishNetwork.distances[route.get(i1)][route.get(i1 + 1)];
                if (currentLen < minLen) {
                    minLen = currentLen;
                    insertionIndex = i1;
                    indexOfInsertedElement = i;
                }
            }
        }
        if (indexOfInsertedElement != -1)
            route.add(insertionIndex + 1, indexOfInsertedElement);
    }


    public static int getSumOfLengths(ArrayList<Integer> route) {
        int sumOfLen = 0;
        for (int i = 0; i < route.size() - 1; i++)
            sumOfLen += TurkishNetwork.distances[route.get(i)][route.get(i + 1)];
        return sumOfLen;
    }

    public static void print(String name, ArrayList<Integer> route, int sumOfLen) {
        System.out.print(name + " " + sumOfLen + " [");

        route.forEach(c -> System.out.print(c + " - "));
        System.out.print("]");
        System.out.println();
    }
}
