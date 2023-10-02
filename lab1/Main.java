public class Main {
    public static void main(String[] args) {
        int N = 1117;
        System.out.printf("C2=%d; C3=%d; C5=%d; C7=%d;\n", N % 2, N % 3, N % 5, N % 7);
        System.out.println("Операція О1 = '-'\nОперація O2 = '%'\nКонстанта C = 1\nТип індексів i та j = char");
        int a = 2; // Значення a
        int b = 4; // Значення b
        int n = 5; // Значення n
        int m = 8; // Значення m

        double sum = 0.0;

        for (char i = (char) a; i <= (char) n; i++){
            for (char j = (char) b; j <= (char) m; j++) {
                //Checking if there is division by zero
                // If so, an error is displayed and the calculation stops
                if (i - 1 == 0) {
                    System.err.println("Помилка: Ділення на нуль (i-1=0)");
                    return;
                }
                //Performing the calculations
                double ost = i % j; //This is to make the result double because the assignment has the last priority
                int dil = i - 1;
                double value = ost / dil;
                sum += value;
            }
        }
        //Displaying the result
        System.out.printf("Результат обчислення функції S: %.3f", sum);
    }
}