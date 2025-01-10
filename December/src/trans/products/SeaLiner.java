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

    public int getEngineCounts() {
        return engineCounts;
    }
    public void setEngineCounts(int engineCounts) {
        this.engineCounts = engineCounts;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public int getLinerCrew() {
        return linerCrew;
    }
    public void setLinerCrew(int linerCrew) {
        this.linerCrew = linerCrew;
    }

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