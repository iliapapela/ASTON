class Rabotnik {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Rabotnik(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Имя: " + name + ", Должность: " + position + ", Email: " + email + ", Телефон: " + phone + ", Зарплата: " + salary + ", Возраст: " + age);
    }
}

public class zadanie_2 {
    public static void main(String[] args) {
        Rabotnik[] sotrudnik = new Rabotnik[5];
        sotrudnik[0] = new Rabotnik("Tester1 Tester", "Engineer", "tester@mail.ru", "123456852", 379000, 27);
        sotrudnik[1] = new Rabotnik("Tester2 Tester", "Engineer", "tester@mail.ru", "123456852", 379000, 26);
        sotrudnik[2] = new Rabotnik("Tester3 Tester", "Engineer", "tester@mail.ru", "123456852", 379000, 28);
        sotrudnik[3] = new Rabotnik("Tester4 Tester", "Engineer", "tester@mail.ru", "123456852", 379000, 25);
        sotrudnik[4] = new Rabotnik("Tester5 Tester", "Engineer", "tester@mail.ru", "123456852", 379000, 37);

        for (Rabotnik rabotnik : sotrudnik) {
            rabotnik.displayInfo();
        }
    }
}