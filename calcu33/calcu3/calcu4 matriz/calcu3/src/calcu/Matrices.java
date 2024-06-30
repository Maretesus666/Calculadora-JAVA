package calcu;

public class Matrices {

	public static double[][] sumMatrices(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    // Método para restar dos matrices
    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    // Método para multiplicar dos matrices
    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Método para calcular el determinante de una matriz cuadrada
    public static double calculateDeterminant(double[][] A) {
        int n = A.length;
        if (n != A[0].length) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular el determinante.");
        }

        if (n == 1) {
            return A[0][0];
        }

        if (n == 2) {
            return A[0][0] * A[1][1] - A[0][1] * A[1][0];
        }

        double determinant = 0;
        for (int j = 0; j < n; j++) {
            determinant += A[0][j] * cofactor(A, 0, j);
        }

        return determinant;
    }

    // Método para calcular el cofactor de un elemento de una matriz
    private static double cofactor(double[][] A, int row, int col) {
        int n = A.length;
        double[][] minor = new double[n - 1][n - 1];
        int minorRow, minorCol;
        minorRow = minorCol = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != row && j != col) {
                    minor[minorRow][minorCol] = A[i][j];
                    minorCol++;
                    if (minorCol == n - 1) {
                        minorRow++;
                        minorCol = 0;
                    }
                }
            }
        }

        return Math.pow(-1, row + col) * calculateDeterminant(minor);
    }

    // Método para calcular la matriz inversa de una matriz cuadrada
    public static double[][] calculateInverse(double[][] A) {
        int n = A.length;
        if (n != A[0].length) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular la inversa.");
        }

        double determinant = calculateDeterminant(A);
        if (determinant == 0) {
            throw new IllegalArgumentException("La matriz no es invertible.");
        }

        double[][] adjoint = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjoint[j][i] = cofactor(A, i, j);
            }
        }

        double[][] inverse = new double[n][n];
        double inverseDeterminant = 1.0 / determinant;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = adjoint[i][j] * inverseDeterminant;
            }
        }

        return inverse;
    }

    // Método para imprimir una matriz en la consola
    public static void printMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double[][] A = {{1, 2}, {3, 4}};
        double[][] B = {{5, 6}, {7, 8}};

        System.out.println("Matriz A:");
        printMatrix(A);

        System.out.println("\nMatriz B:");
        printMatrix(B);

        // Suma de matrices
        System.out.println("\nSuma de A y B:");
        double[][] sumResult = sumMatrices(A, B);
        printMatrix(sumResult);

        // Resta de matrices
        System.out.println("\nResta de A y B:");
        double[][] subtractResult = subtractMatrices(A, B);
        printMatrix(subtractResult);

        // Multiplicación de matrices
        System.out.println("\nMultiplicación de A y B:");
        double[][] multiplyResult = multiplyMatrices(A, B);
        printMatrix(multiplyResult);

        // Determinante de matriz A
        System.out.println("\nDeterminante de A:");
        double determinantA = calculateDeterminant(A);
        System.out.println(determinantA);

        // Inversa de matriz A
        System.out.println("\nInversa de A:");
        try {
            double[][] inverseA = calculateInverse(A);
            printMatrix(inverseA);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}