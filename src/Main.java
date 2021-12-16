public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double weight = 100;
        double height = 160;
        double index = (double) service.calculate(weight, height);
        System.out.println("Индекс массы тела равен: " + index);
    }
}
