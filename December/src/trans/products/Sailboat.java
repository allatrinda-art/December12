package trans.products;

import trans.WaterTransport;

public class Sailboat extends WaterTransport {
    private String type; // Тип лодки
    private int numberOfMatches; // Количество матчей
    private int numberOfRudderFeathers; // Количество перьев руля
    private int numberOfSails; // Количество парусов
    private String environment; // Морская/речная/океаническая
    private int engineCounts; // Количество моторов
    protected boolean hasEngine;

    // Конструктор для инициализации полей
    public Sailboat(double speed, boolean hasMatches, int people, double length, String countryOfOrigin, String type,
                    int numberOfMatches, int numberOfRudderFeathers, int numberOfSails, String environment,
                    int engineCounts, boolean hasEngine) {
        super(speed, hasMatches, people, length, countryOfOrigin);
        this.type = type;
        this.numberOfMatches = numberOfMatches;
        this.numberOfRudderFeathers = numberOfRudderFeathers;
        this.numberOfSails = numberOfSails;
        this.environment = environment;
        this.engineCounts = engineCounts;
        this.hasEngine = hasEngine;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public int getEngineCounts() {
        return engineCounts;
    }

    public void setEngineCounts(int engineCounts) {
        this.engineCounts = engineCounts;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public int getNumberOfSails() {
        return numberOfSails;
    }

    public void setNumberOfSails(int numberOfSails) {
        this.numberOfSails = numberOfSails;
    }

    public int getNumberOfRudderFeathers() {
        return numberOfRudderFeathers;
    }

    public void setNumberOfRudderFeathers(int numberOfRudderFeathers) {
        this.numberOfRudderFeathers = numberOfRudderFeathers;
    }

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getSpeed() {
        return speed % 1.5;
    }

    // Метод для вывода информации о лодке
    public void displayInfo() {
        System.out.println("Сведения о парусной лодке:");
        System.out.println("");
        System.out.println("Длина: " + length + " футов");
        System.out.println("Тип: " + type);
        System.out.println("Количество матчей: " + numberOfMatches);
        System.out.println("Количество перьев руля: " + numberOfRudderFeathers);
        System.out.println("Количество парусов: " + numberOfSails);
        System.out.println("Страна происхождения: " + WaterTransport.countryOfOrigin);
        System.out.println("Тип водоемов: " + environment);
    }
}