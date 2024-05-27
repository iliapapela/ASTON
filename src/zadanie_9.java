public class zadanie_9 {
    public static void main(String[] args) {
        System.out.println(whatYear(2007));
    }
    public static boolean whatYear (int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        }
        else {
            return false;
        }

    }
}
