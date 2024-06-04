class Park {
    private String nameOfPark;
    private Attraction[] attractions;

    public Park(String nameOfPark, int numberOfAttractions) {
        this.nameOfPark = nameOfPark;
        this.attractions = new Attraction[numberOfAttractions];
    }

    public void addAttractions(int index, String name, String timeWorking, double price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, timeWorking, price);
        }
    }

    public void printAttractions() {
        System.out.println("Название: " + nameOfPark);
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                System.out.println(attraction);
            }
        }
    }

    private class Attraction {
        private String name;
        private String timeWorking;
        private double price;

        public Attraction(String name, String timeWorking, double price) {
            this.name = name;
            this.timeWorking = timeWorking;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + name + ", Время работы: " + timeWorking + ", Стоимость: " + price + " лунобаксов.";
        }
    }
}

public class zadanie_3 {
    public static void main(String[] args) {
        Park park = new Park("Лунопарк", 3);
        park.addAttractions(0, "Микрогравитация", "09:00 - 22:00", 150.0);
        park.addAttractions(1, "Лунные Горки", "09:00 - 20:00", 200.0);
        park.addAttractions(2, "Паравозик", "09:00 - 18:00", 100.0);

        park.printAttractions();
    }
}
