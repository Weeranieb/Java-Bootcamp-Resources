public class Weather {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = new double[celsius.length];
        
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = celsius[i] * 9/5 + 32;
        }
        System.out.println("Celsius\tFahrenheit");
        for (int i = 0; i < celsius.length; i++) {
            System.out.println(celsius[i] + "\t" + fahrenheit[i]);
        }

    }
}
