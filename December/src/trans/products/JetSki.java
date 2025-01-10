package trans.products;

import trans.WaterTransport;

public class JetSki extends WaterTransport {
    private String skipperPosition; //стоячий, сидячий
    private String jetSkiType; //туристический, спортивный

    // Конструктор
    public JetSki(String name, double maxSpeed, int passengerCapacity, double price,
                  String skipperPosition, String jetSkiType) {
        super(name, maxSpeed, passengerCapacity, price);
        this.skipperPosition = skipperPosition;
        this.jetSkiType = jetSkiType;
    }

    public String getSkipperPosition() {
        return skipperPosition;
    }
    public void setSkipperPosition(String skipperPosition) {
        this.skipperPosition = skipperPosition;
    }
    public String getJetSkiType() {
        return jetSkiType;
    }
    public void setJetSkiType(String jetSkiType) {
        this.jetSkiType = jetSkiType;
    }

    //для установки количества людей с проверкой (макс 2)
//    @Override
//    public void setPassengerCapacity(int passengerCapacity) {
//        if (passengerCapacity > 2) {
//            System.out.println("Допустимо максимум 2 чевлоека на JetSki");
//            this.passengerCapacity = 2;
//        } else {
//            this.passengerCapacity = passengerCapacity;
//        }
//    }

    // Метод для вывода информации о лодке
    @Override
    public String toString() {
        return super.toString() + ",\nSkipper position: " + skipperPosition + ",\nJetSki type: " + jetSkiType +
                ".\n";
    }

//    @Override
//    public double getMaxSpeed() {
//        return maxSpeed * 2;
//    }
//    @Override
//    public int getPassengerCapacity() {
//        return passengerCapacity * 2;  // возвращаем количество людей
//    }

}
