public class zadanie_14 {
    public static void main(String[] args) {
        int[] resultMassr = createMass(7, 3);
        for (int value : resultArr) {
            System.out.print(value + " ");
        }
    }

    public static int[] createMass(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}