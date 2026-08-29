public class Coordinates {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            // System.out.println(matrix[i].length);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}