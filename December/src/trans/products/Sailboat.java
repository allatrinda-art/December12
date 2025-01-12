package trans.products;

import trans.WaterTransport;
import java.util.Scanner;

public class Sailboat extends WaterTransport {
    Scanner sc = new Scanner(System.in);

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

//    @Override
//    public double getMaxSpeed() {
//        return maxSpeed % 1.5;
//    }

    public Sailboat() {};

    String[] sailBoatParams = {"type of the sail boat: ", "number of matches: ", "number of sails: ", "type of environment: ", "does it has engine?(true/false) - "};

    public Sailboat getSailBoatParams(WaterTransport waterTransport) {
        String[] data = new String[sailBoatParams.length];
        for(int i = 0; i < sailBoatParams.length; i ++) {
            System.out.println("Enter " + sailBoatParams[i]);
            data[i] = sc.nextLine();
        }
        Sailboat receivedSailBoat = new Sailboat(waterTransport.getName(), waterTransport.getMaxSpeed(),
                waterTransport.getPassengerCapacity(), waterTransport.getPrice(), data[0], Integer.valueOf(data[1]),
                Integer.valueOf(data[2]), data[3], Boolean.valueOf(data[4]));
        return receivedSailBoat;
    }

    // Метод для вывода информации о лодке
    @Override
    public String toString() {
        return super.toString() + ",\nBoat type: " + sailBoatType + ",\nNumber of matches: " + numberOfMatches +
                ",\nNumber of sails: " + numberOfSails +
                ",\nEnvironment: " +  environment + ",\nHas engine? - " + hasEngine + ".\n";
    }
}