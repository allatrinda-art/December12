import trans.WaterTransport;
import trans.products.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an identificator of transport (1 - Sail boat; 2 - JetSki; 3 - Sea liner, " +
                "4 - Service boat): ");
        int id = sc.nextInt();
        sc.nextLine(); //очистка
        WaterTransport waterTransport = null; //переменная для хранения объекта

//        WaterTransport waterTransport = new WaterTransport();//переменная для хранения объекта
//        WaterTransport waterTransportReceivedData = waterTransport.getWaterTransportParams();
//        Sailboat sailboat = new Sailboat();
//        JetSki jetSki = new JetSki();
//        SeaLiner seaLiner = new SeaLiner();
//        ServiceBoat serviceBoat = new ServiceBoat();

        switch (id) {
            case 1:
                waterTransport = case1(sc);
                break;
            case 2:
                waterTransport = case2(sc);
                break;
            case 3:
                waterTransport = case3(sc);
                break;

            case 4:
               waterTransport = case4(sc);
                break;

            default:
                System.out.println("Incorrect identificator!");
                System.exit(0);
        }
        System.out.println("You've entered " + id + " which corresponds to " + waterTransport.getClass().
                getSimpleName());
        System.out.println(waterTransport); //выводим данные объекта
    }

    public static Sailboat case1(Scanner sc){
        System.out.println("Enter sail boat name: ");
        String sailBoatName = sc.nextLine();
        System.out.println("Enter max speed: ");
        double sailBoatMaxSpeed = sc.nextDouble();
        System.out.println("How many people can use this transport? - ");
        int sailPassengerCapacity = sc.nextInt();
        System.out.println("What is the price? - ");
        double sailBoatPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter type of the sail boat: ");
        String sailBoatType = sc.nextLine();
        System.out.println("Enter number of matches: ");
        int numberOfMatches = sc.nextInt();
        System.out.println("Enter number of sails: ");
        int numberOfSails = sc.nextInt();
        sc.nextLine();
        System.out.println("Type of environment: ");
        String environment = sc.nextLine();
        System.out.println("Does it have engine?(true/false) - ");
        boolean hasEngine = sc.nextBoolean();
        return new Sailboat(sailBoatName, sailBoatMaxSpeed, sailPassengerCapacity,sailBoatPrice, sailBoatType,
                numberOfMatches, numberOfSails, environment, hasEngine);
    }

    public static JetSki case2(Scanner sc) {
        System.out.println("Enter JetSki name: ");
        String jetSkiName = sc.nextLine();
        System.out.println("Enter max speed: ");
        double jetCkiMaxSpeed = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        System.out.println("How many people can use this transport? - ");
        int jetSkiPassengerCapacity = sc.nextInt();
        sc.nextLine(); // Consume the newline
        System.out.println("What is the price? - ");
        double jetSkiPrice = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        System.out.println("What is the Skipper position? - ");
        String skipperPosition = sc.nextLine();
        System.out.println("JetSki type: ");
        String jetSkiType = sc.nextLine();
        return new JetSki(jetSkiName, jetCkiMaxSpeed, jetSkiPassengerCapacity, jetSkiPrice, skipperPosition,
                jetSkiType);
    }

    public static SeaLiner case3(Scanner sc) {
        System.out.println("Enter Sea Liner name: ");
        String linerName = sc.nextLine();
        System.out.println("Enter max speed: ");
        double linerMaxSpeed = sc.nextDouble();
        System.out.println("How many people can use this transport? - ");
        int linerPassengerCapacity = sc.nextInt();
        System.out.println("What is the price? - ");
        double linerPrice = sc.nextDouble();
        System.out.println("Amount of engines: ");
        int engineCounts = sc.nextInt();
        System.out.println("Amount of floors: ");
        int floor = sc.nextInt();
        System.out.println("Amount of crew: ");
        int linerCrew = sc.nextInt();
        return new SeaLiner(linerName, linerMaxSpeed, linerPassengerCapacity,
                linerPrice, engineCounts, floor, linerCrew);
    }

    public static ServiceBoat case4(Scanner sc) {
        System.out.println("Enter Service Boat name: ");
        String serviceBoatName = sc.nextLine();
        System.out.println("Enter max speed: ");
        double serviceBoatMaxSpeed = sc.nextDouble();
        System.out.println("How many people can use this transport? - ");
        int serviceBoatPassengerCapacity = sc.nextInt();
        System.out.println("What is the price? - ");
        double serviceBoatPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Type of service boat: ");
        String type = sc.nextLine();
        System.out.println("Security level is ");
        String securityLevel = sc.nextLine();
        System.out.println("Crew team amount is ");
        int serviceBoatcrew = sc.nextInt();
        return new ServiceBoat(serviceBoatName, serviceBoatMaxSpeed, serviceBoatPassengerCapacity,
                serviceBoatPrice, type, securityLevel, serviceBoatcrew);
    }
}