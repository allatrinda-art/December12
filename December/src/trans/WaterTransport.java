package trans;

public class WaterTransport{
    protected double maxSpeed; // макс скорость
    protected int passengerCapacity; // допустимое кол-во людей на судне
    protected double price;
    protected String name;

    public WaterTransport(String name, double maxSpeed, int passengerCapacity, double price) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
        this.price = price;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + ",\nMax Speed: " + maxSpeed + " knots, \nHow many people can use this transport? - "
                + passengerCapacity + ",\nPrice is " + price + " $";
    }
}
