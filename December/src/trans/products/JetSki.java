package trans.products;

import trans.WaterTransport;

public class JetSki extends WaterTransport {
    // Поля класса
    private String skipperPosition; //стоячий, сидячий
    private String type; //туристический, спортивный

    // Конструктор
    public JetSki(double speed, boolean hasMatches, int people, double length, String countryOfOrigin, String skiperPosition, String type) {
        super(speed, hasMatches, people, length, countryOfOrigin);
        this.skipperPosition = skiperPosition;
        this.type = type;
    }

    public String getSkipperPosition() {
        return skipperPosition;
    }

    public void setSkipperPosition(String skipperPosition) {
        this.skipperPosition = skipperPosition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //для установки количества людей с проверкой (макс 2)
    @Override
    public void setPeople(int people) {
        if (people > 2) {
            System.out.println("Допустимо максимум 2 чевлоека на JetSki");
            this.people = 2;
        } else {
            this.people = people;
        }
    }

    @Override
    public int getPeople() {
        return people;  // возвращаем количество людей
    }

    // Метод для вывода информации о лодке
    public void displayInfo() {
        System.out.println("Сведения о водном мотоцикле:");
        System.out.println("Макс скорость: " + speed);
        System.out.println("Имеются мачты: " + hasMatches);
        System.out.println("Длина: " + length + " футов");
        System.out.println("Тип: " + type);
        System.out.println("Страна происхождения: " + WaterTransport.countryOfOrigin);
    }
}
