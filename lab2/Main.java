public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int N = 1117;
        System.out.printf("C5=%d; C7=%d; C11=%d;\n", N % 5, N % 7, N % 11);
        System.out.println("Дія з матрицею(ями) = 'C=A+B'\nТип елементів матриці = 'long'\nДія з матрицею С = 'Обчислити суму найбільших елементів в стовпцях матриці з парними номерами та найменших елементів в стовпцях матриці з непарними номерами'");

        // Declaring a two-dimensional array A
        long[][] A = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};
        int rows = A.length;
        int cols = A[0].length;

        //check whether all rows of matrix A have the same number of columns
        for (int i = 0; i < rows; i++) {
            if (cols != A[i].length) {
                System.err.println("Matrix A rows are not of the same size");
                return;
            }
        }

        // Declaring a two-dimensional array B
        long[][] B = {{10, 11, 12},
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};

        //check whether all rows of matrix B have the same number of columns
        for (int i = 0; i < rows; i++) {
            if (cols != B[i].length) {
                System.err.println("Matrix B rows are not of the same size");
                return;
            }
        }
        //check whether matrix A and matrix B have the same number of columns and row
        if (A.length != B.length || A[0].length != B[0].length) {
            System.err.println("Matrices A and B have different sizes");
            return;
        }
        long[][] C = new long[rows][cols];

        // calculating C = A + B
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        //Print result of C = A + B
        System.out.println("Результат операції C = A + B:");
        printMatrix(C);
        //Print the result
        System.out.println("Сума: " + sumRes(C));
    }

    //method for printing matrix
    private static void printMatrix(long[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //method for finding "суму найбільших елементів в стовпцях матриці з парними номерами та найменших елементів в стовпцях матриці з непарними номерами"
    private static long sumRes(long[][] matrix) {
        long sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {        //matrix columns with even numbers
                long max = matrix[0][j];
                for (int i = 1; i < rows; i++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
                sum += max;
            } else {        //matrix columns with odd numbers
                long min = matrix[0][j];
                for (int i = 1; i < rows; i++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                    }
                }
                sum += min;
            }
        }
        return sum;
    }
}