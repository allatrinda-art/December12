package trans.products;

import trans.WaterTransport;

public class Sailboat extends WaterTransport {
    private String sailBoatType; // Тип лодки
    private int numberOfMatches; // Количество матч
    private int numberOfSails; // Количество парусов
    private String environment; // Морская/речная/океаническая
    protected boolean hasEngine;

    // Конструктор для инициализации полей
    public Sailboat(String name, double maxSpeed, int passengerCapacity,
                    double price, String sailBoatType, int numberOfMatches, int numberOfSails,
                    String environment, boolean hasEngine) {
        super(name, maxSpeed, passengerCapacity, price);
        this.sailBoatType = sailBoatType;
        this.numberOfMatches = numberOfMatches;
        this.numberOfSails = numberOfSails;
        this.environment = environment;
        this.hasEngine = hasEngine;
    }

    public String getSailBoatType() {
        return sailBoatType;
    }
    public void setSailBoatType(String sailBoatType) {
        this.sailBoatType = sailBoatType;
    }
    public int getNumberOfMatches() {
        return numberOfMatches;
    }
    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }
    public int getNumberOfSails() {
        return numberOfSails;
    }
    public void setNumberOfSails(int numberOfSails) {
        this.numberOfSails = numberOfSails;
    }
    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    public boolean isHasEngine() {
        return hasEngine;
    }
    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

//    @Override
//    public double getMaxSpeed() {
//        return maxSpeed % 1.5;
//    }

    // Метод для вывода информации о лодке
    @Override
    public String toString() {
        return super.toString() + ",\nBoat type: " + sailBoatType + ",\nNumber of matches: " + numberOfMatches +
                ",\nNumber of sails: " + numberOfSails +
                ",\nEnvironment: " +  environment + ",\nHas engine? - " + hasEngine + ".\n";
    }
}