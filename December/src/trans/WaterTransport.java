package trans;

public class WaterTransport {
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
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

//    String[] transportParams = {"name", "max speed", "passenger capacity", "price"};
//
//    public WaterTransport(){};
//
//    public WaterTransport getWaterTransportParams() {
//        String[] data = new String[transportParams.length];
//        for(int i = 0; i < transportParams.length; i++){
//            System.out.println("Enter " + transportParams[i]);
//            data[i] = sc.nextLine();
//        }
//        WaterTransport receivedTransport = new WaterTransport(data[0], Double.valueOf(data[1]),
//                Integer.valueOf(data[2]), Double.valueOf(data[3]));
//        return receivedTransport;
//    }

    public String toString() {
        return "Name: " + name + ",\nMax Speed: " + maxSpeed + " knots, \nHow many people can use this transport? - "
                + passengerCapacity + ",\nPrice is " + price + " $";
    }
}
