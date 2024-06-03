public class zadanie_1 {
    public static void main(String[] args) {
        Sotrudnik sotrudnik = new Sotrudnik("Фамилия Имя Отчество", "Ку А", "какаято_почта@mail.com", "123654852", 379000, 37);
        sotrudnik.otput();
    }
}

class Sotrudnik {
    private String FIO;
    private String jobTitle;
    private String email;
    private String phone;
    private double salary; // Используем тип double для зарплаты
    private int age;       // Используем тип int для возраста

    public Sotrudnik(String FIO, String jobTitle, String email, String phone, double salary, int age) {
        this.FIO = FIO;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void otput() {
        System.out.println("ФИО: " + FIO);
        System.out.println("Должность: " + jobTitle);
        System.out.println("email: " + email);
        System.out.println("телефон: " + phone);
        System.out.println("зарплата: " + salary);
        System.out.println("возраст: " + age);
    }
}