public class zadanie_8 {
    public static void main(String[] args) {
        lineNumber("это строка", 7);
    }
    public static void lineNumber(String text, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }
}
