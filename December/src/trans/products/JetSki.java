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

//    public JetSki() {};
//
//    String[] sailBoatParams = {"the Skipper position", "JetSki type"};
//
//    public JetSki getJatSkiParams (WaterTransport waterTransport) {
//        String[] data = new String[sailBoatParams.length];
//        for(int i = 0; i < sailBoatParams.length; i ++) {
//            System.out.println("Enter " + sailBoatParams[i]);
//            data[i] = sc.nextLine();
//        }
//        JetSki receivedJetSki = new JetSki(waterTransport.getName(), waterTransport.getMaxSpeed(),
//                waterTransport.getPassengerCapacity(), waterTransport.getPrice(), data[0], data[1]);
//        return receivedJetSki;
//    }

    // Метод для вывода информации о лодке
    @Override
    public String toString() {
        return super.toString() + ",\nSkipper position: " + skipperPosition + ",\nJetSki type: " + jetSkiType + ".\n";
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
