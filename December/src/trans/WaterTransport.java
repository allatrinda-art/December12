package trans;

public class WaterTransport{
    protected double speed; // макс скорость
    protected boolean hasMatches;
    protected int people; // допустимое кол-во людей на судне
    protected double length;
    protected static  String countryOfOrigin; // Страна происхождения

    public WaterTransport(double speed, boolean hasMatches, int people, double length, String countryOfOrigin) {
        this.speed = speed;
        this.hasMatches = hasMatches;
        this.people = people;
        this.length = length;
        this.countryOfOrigin = countryOfOrigin;
    }

    // Метод для получения допустимого количества людей на судне
    public int getPeople() {
        return people;
    }
    // Метод для установки количества людей
    public void setPeople(int people) {
        this.people = people;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isHasMatches() {
        return hasMatches;
    }

    public void setHasMatches(boolean hasMatches) {
        this.hasMatches = hasMatches;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    //метод для получения максимальной скорости судна
    public double getSpeed() {
        return speed;
    }

        //метод для получения длины судна
    public double getLength() {
        return length;
    }
}
