public class BMIService {
    public double calculate (double weight, double height) {

        double metrHeight = height / 100; // Рост в см приводим к метрам (конечно, можно было и сразу в метрах привести, но решил сделать так)
        double indexBMI = weight   / (metrHeight * metrHeight); // в квдрат возвел примитивным способом, но работает.

        return indexBMI;


    }
}
