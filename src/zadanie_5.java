public class zadanie_5 {
    public static void main(String[] args) {
        System.out.println(twoNumbers(7,3));
    }
    public static boolean twoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }
}
