package trans.products;

import trans.WaterTransport;

public class ServiceBoat extends WaterTransport {
    protected String type; //перевозки, исследовательская, военная, морская полиция
    protected String securityLevel;
    private int serviceBoatcrew;

    public ServiceBoat(String name, double maxSpeed, int passengerCapacity, double price, String type,
                       String securityLevel, int serviceBoatcrew) {
        super(name, maxSpeed, passengerCapacity, price);
        this.type = type;
        this.securityLevel = securityLevel;
        this.serviceBoatcrew = serviceBoatcrew;
        }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSecurityLevel() {
        return securityLevel;
    }
    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }
    public int getServiceBoatcrew() {
        return serviceBoatcrew;
    }
    public void setServiceBoatcrew(int serviceBoatcrew) {
        this.serviceBoatcrew = serviceBoatcrew;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nType of service boat: " + type + ",\nSecurity level is " + securityLevel
                + ",\nCrew team amount is " + serviceBoatcrew + " people.";
    }

//    @Override
//    public double getMaxSpeed() {
//        return maxSpeed * 2;
//    }
}
