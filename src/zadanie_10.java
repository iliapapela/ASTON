public class zadanie_10 {
    public static void main(String[] args) {
        int [] arr ={1,1,0,1,1,1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        for (int value : arr) {
            System.out.println(value + "");
        }

    }
}
