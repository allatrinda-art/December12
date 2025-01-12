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
        WaterTransport waterTransport = new WaterTransport();//переменная для хранения объекта
        WaterTransport waterTransportReceivedData = waterTransport.getWaterTransportParams();
        Sailboat sailboat = new Sailboat();
        JetSki jetSki = new JetSki();
        SeaLiner seaLiner = new SeaLiner();
        ServiceBoat serviceBoat = new ServiceBoat();

        switch (id) {
            case 1:
                Sailboat sailBoatReceivedData = sailboat.getSailBoatParams(waterTransportReceivedData);
                System.out.println("You've entered " + id + " which corresponds to " +
                        sailBoatReceivedData.getClass().getSimpleName());
                System.out.println(sailBoatReceivedData);
                break;

            case 2:
                JetSki jetSkiReceivedData = jetSki.getJatSkiParams(waterTransportReceivedData);
                System.out.println("You've entered " + id + " which corresponds to " +
                        jetSkiReceivedData.getClass().getSimpleName());
                System.out.println(jetSkiReceivedData);
                break;

            case 3:
                SeaLiner seaLinerReceivedData = seaLiner.getSeaLinerParams(waterTransportReceivedData);
                System.out.println("You've entered " + id + " which corresponds to " +
                        seaLinerReceivedData.getClass().getSimpleName());
                System.out.println(seaLinerReceivedData);
                break;

            case 4:
                ServiceBoat serviceBoatReceivedData = serviceBoat.getServiceBoatParams(waterTransportReceivedData);
                System.out.println("You've entered " + id + " which corresponds to " +
                        serviceBoatReceivedData.getClass().getSimpleName());
                System.out.println(serviceBoatReceivedData);
                break;

            default:
                System.out.println("Incorrect identificator!");
                System.exit(0);
        }
    }
}