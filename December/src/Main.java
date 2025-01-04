public class Main {
    public static void main(String[] args) {
        // Создание экземпляра парусной лодки
        Sailboat sailboat = new Sailboat(
                30.5,"Катамаран",5,2,3,
                "Великобритания", "Морская" );
        sailboat.displayInfo();
    }
}