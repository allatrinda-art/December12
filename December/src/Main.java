import trans.products.JetSki;
import trans.products.Sailboat;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра парусной лодки
        Sailboat sailboat = new Sailboat(33, true,8, 27.4, "France",
                "catamaran", 2, 2, 4, "sea", 1, true);
        sailboat.displayInfo();

        JetSki jetSki = new JetSki(90,true, 3, 5.5, "Sweden",
                "stay", "sport");

        //System.out.println("Today amount of passengers on JetSki is " + jetSki.getPeople());
    }
}