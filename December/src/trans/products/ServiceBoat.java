package trans.products;

import trans.WaterTransport;

public class ServiceBoat extends WaterTransport {
    protected String type; //перевозки, исследовательская, военная, морская полиция
    protected String securityLevel;
    private int dateOfExpiration;

    public ServiceBoat(double speed, boolean hasMatches, int people, double length, String countryOfOrigin) {
        super(speed, hasMatches, people, length, countryOfOrigin);
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

    public int getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(int dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public void displayInfo() {

    }
}
