package trans.products;

import trans.WaterTransport;

import java.util.Scanner;

public class ServiceBoat extends WaterTransport {
    Scanner sc = new Scanner(System.in);

    protected String type; //перевозки, исследовательская, военная, морская полиция
    protected String securityLevel;
    private int serviceBoatCrew;

    public ServiceBoat(String name, double maxSpeed, int passengerCapacity, double price, String type,
                       String securityLevel, int serviceBoatCrew) {
        super(name, maxSpeed, passengerCapacity, price);
        this.type = type;
        this.securityLevel = securityLevel;
        this.serviceBoatCrew = serviceBoatCrew;
        }

    public ServiceBoat() {};

    String[] serviceBoatParams = {"type of service boat", "security level", "amount of crew team "};

    public ServiceBoat getServiceBoatParams (WaterTransport waterTransport) {
        String[] data = new String[serviceBoatParams.length];
        for (int i = 0; i < serviceBoatParams.length; i ++) {
            System.out.println("Enter " + serviceBoatParams[i]);
            data[i] = sc.nextLine();
        }
        ServiceBoat receivedServiceBoat = new ServiceBoat(waterTransport.getName(), waterTransport.getMaxSpeed(),
                waterTransport.getPassengerCapacity(), waterTransport.getPrice(), data[0], data[1],
                Integer.valueOf(data[2]));
        return receivedServiceBoat;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nType of service boat: " + type + ",\nSecurity level is " + securityLevel
                + ",\nCrew team amount is " + serviceBoatCrew + " people.";
    }

//    @Override
//    public double getMaxSpeed() {
//        return maxSpeed * 2;
//    }
}
