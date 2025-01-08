package trans.products;
import trans.WaterTransport;

public class SeaLiner extends WaterTransport {

    private int engineCounts; // Количество моторов
    private int floor; //количество этажей
    private int crew; // кол-во членов экипажа

    public SeaLiner(double speed, boolean hasMatches, int people, double length, String countryOfOrigin) {
        super(speed, hasMatches, people, length, countryOfOrigin);
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

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public void displayInfo() {

    }
    }