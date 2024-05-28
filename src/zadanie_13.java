public class zadanie_13 {
    public static void main(String[] args) {
        int matrix[] [] = new int[3] [3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] [i] = 1;
        }
        printMatrix(matrix);
    }
    private static void printMatrix(int[] [] matrix){
        for(int[] row : matrix){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
