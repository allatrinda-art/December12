package trans.products;
import trans.WaterTransport;

public class SeaLiner extends WaterTransport {
    private int engineCounts; // Количество моторов
    private int floor; //количество этажей
    private int linerCrew; // кол-во членов экипажа

    public SeaLiner(String name, double maxSpeed, int passengerCapacity,  double price,
                    int engineCounts, int floor, int linerCrew) {
        super(name, maxSpeed, passengerCapacity, price);
        this.engineCounts = engineCounts;
        this.floor = floor;
        this.linerCrew = linerCrew;
    }

//    public SeaLiner () {};
//
//    String[] seaLinerParams = {"amount of engines", "amount of floors", "amount of crew"};
//
//    public SeaLiner getSeaLinerParams (WaterTransport waterTransport) {
//        String[] data = new String[seaLinerParams.length];
//        for(int i = 0; i < seaLinerParams.length; i ++){
//            System.out.println("Enter " + seaLinerParams[i]);
//            data[i] = sc.nextLine();
//        }
//        SeaLiner receivedSeaLiner = new SeaLiner(waterTransport.getName(), waterTransport.getMaxSpeed(),
//                waterTransport.getPassengerCapacity(), waterTransport.getPrice(), Integer.valueOf(data[0]),
//                Integer.valueOf(data[1]), Integer.valueOf(data[2]));
//        return receivedSeaLiner;
//    }

    @Override
    public String toString() {
        return super.toString() + ",\nAmount of engines: " + engineCounts + ",\nAmount of floors: " + floor +
                ",\nAmount of crew: " + linerCrew + " people.\n";
    }

//    @Override
//    public double getMaxSpeed() {
//        return maxSpeed * 1.5;
//    }
    }