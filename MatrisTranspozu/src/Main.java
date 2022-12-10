public class Main {
    public static void main(String[] args) {
        int[][] original = {{1, 2, 3},{4, 5, 6}};
        int[][] transpose = new int[3][2];
        for (int i = 0; i < original.length; i++){
            for (int j = 0; j < original[i].length; j++){
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------");
        for (int i = 0; i < transpose.length; i++){
            for (int j = 0; j < transpose[i].length; j++){
                transpose[i][j] = original[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
