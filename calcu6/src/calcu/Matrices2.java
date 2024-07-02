package calcu;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Matrices2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel mainPanel;
    private JPanel matrixPanel;
    private JPanel matrixAPanel;
    private JPanel matrixBPanel;
    private JTextField[][] matrixATextFields;
    private JTextField[][] matrixBTextFields;
    private JButton changeSizeButton;
    private JButton sumButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton determinantButton;
    private JButton inverseButton;
    private JTextArea resultTextArea;

    private int rowsA = 2;
    private int colsA = 2;
    private int rowsB = 2;
    private int colsB = 2;

    public Matrices2() {
        setTitle("Calculadora de Matrices");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(750, 500);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(12, 73, 88));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.setBackground(new Color(12, 73, 88));

        matrixPanel = new JPanel(); // Nuevo panel para las matrices
        matrixPanel.setLayout(new GridLayout(1, 2));

        matrixAPanel = new JPanel();
        matrixAPanel.setBackground(new Color(37, 54, 82));
        matrixAPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(31, 166, 140), 2),
                "Matriz A",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                new Color(31, 166, 140)));
        matrixAPanel.setLayout(new GridLayout(rowsA, colsA));
        matrixATextFields = new JTextField[rowsA][colsA];
        initializeMatrixPanel(matrixAPanel, matrixATextFields);

        matrixBPanel = new JPanel();
        matrixBPanel.setBackground(new Color(37, 54, 82));
        matrixBPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(31, 166, 140), 2),
                "Matriz B",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                new Color(31, 166, 140)));
        matrixBPanel.setLayout(new GridLayout(rowsB, colsB));
        matrixBTextFields = new JTextField[rowsB][colsB];
        initializeMatrixPanel(matrixBPanel, matrixBTextFields);

        matrixPanel.add(matrixAPanel);
        matrixPanel.add(matrixBPanel);

        inputPanel.add(matrixPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 1));
        buttonPanel.setBackground(new Color(12, 73, 88));

        changeSizeButton = new JButton("Cambiar Tamaño");
        changeSizeButton.setFont(new Font("Arial", Font.BOLD, 12));
        changeSizeButton.setBackground(new Color(37, 54, 82));
        changeSizeButton.setForeground(new Color(31, 166, 140));
        changeSizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeMatrixSize();
            }
        });

        sumButton = new JButton("Sumar Matrices");
        sumButton.setFont(new Font("Arial", Font.BOLD, 12));
        sumButton.setBackground(new Color(37, 54, 82));
        sumButton.setForeground(new Color(31, 166, 140));
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performMatrixOperation(MatrixOperation.SUM);
            }
        });

        subtractButton = new JButton("Restar Matrices");
        subtractButton.setFont(new Font("Arial", Font.BOLD, 12));
        subtractButton.setBackground(new Color(37, 54, 82));
        subtractButton.setForeground(new Color(31, 166, 140));
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performMatrixOperation(MatrixOperation.SUBTRACT);
            }
        });

        multiplyButton = new JButton("Multiplicar Matrices");
        multiplyButton.setFont(new Font("Arial", Font.BOLD, 12));
        multiplyButton.setBackground(new Color(37, 54, 82));
        multiplyButton.setForeground(new Color(31, 166, 140));
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performMatrixMultiplication();
            }
        });

        inverseButton = new JButton("Calcular Inversa");
        inverseButton.setFont(new Font("Arial", Font.BOLD, 12));
        inverseButton.setBackground(new Color(37, 54, 82));
        inverseButton.setForeground(new Color(31, 166, 140));
        inverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMatrixInverse();
            }
        });

        buttonPanel.add(changeSizeButton);
        buttonPanel.add(sumButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(inverseButton);

        inputPanel.add(buttonPanel, BorderLayout.WEST);

        determinantButton = new JButton("Calcular Determinante");
        determinantButton.setFont(new Font("Arial", Font.BOLD, 12));
        determinantButton.setBackground(new Color(37, 54, 82));
        determinantButton.setForeground(new Color(31, 166, 140));
        determinantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMatrixDeterminant();
            }
        });

        buttonPanel.add(determinantButton);

        resultTextArea = new JTextArea(10, 40);
        resultTextArea.setBackground(new Color(12, 73, 88));
        resultTextArea.setEditable(false);
        resultTextArea.setForeground(new Color(255, 255, 255));
        resultTextArea.setFont(new Font("Arial", Font.PLAIN, 14));

        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(new JScrollPane(resultTextArea), BorderLayout.SOUTH);

        getContentPane().add(mainPanel);

        setVisible(true);
    }

    private void initializeMatrixPanel(JPanel panel, JTextField[][] textFields) {
        panel.removeAll();
        panel.setLayout(new GridLayout(textFields.length, textFields[0].length));
        for (int i = 0; i < textFields.length; i++) {
            for (int j = 0; j < textFields[0].length; j++) {
                textFields[i][j] = new JTextField(5);
                textFields[i][j].setFont(new Font("Arial", Font.PLAIN, 14));
                textFields[i][j].setForeground(new Color(31, 166, 140));
                panel.add(textFields[i][j]);
            }
        }
        panel.revalidate();
        panel.repaint();
    }

    private double[][] getMatrixFromTextFields(JTextField[][] textFields, int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    matrix[i][j] = Double.parseDouble(textFields[i][j].getText());
                } catch (NumberFormatException e) {
                    matrix[i][j] = 0.0;
                }
            }
        }
        return matrix;
    }

    private void setMatrixToTextFields(double[][] matrix, JTextField[][] textFields) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                textFields[i][j].setText(formatDouble(matrix[i][j]));
            }
        }
    }

    private void changeMatrixSize() {
        String[] options = {"2x2", "3x3", "4x4", "5x5"};
        String input = (String) JOptionPane.showInputDialog(null, "Seleccione el nuevo tamaño de la matriz:",
                "Cambiar Tamaño", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (input != null) {
            int newSize = Integer.parseInt(input.substring(0, 1));

            rowsA = colsA = newSize;
            rowsB = colsB = newSize;

            matrixATextFields = new JTextField[rowsA][colsA];
            matrixBTextFields = new JTextField[rowsB][colsB];

            initializeMatrixPanel(matrixAPanel, matrixATextFields);
            initializeMatrixPanel(matrixBPanel, matrixBTextFields);

            mainPanel.revalidate();
            mainPanel.repaint();

            resultTextArea.setText("");
        }
    }

    private void performMatrixOperation(MatrixOperation operation) {
        double[][] matrixA = getMatrixFromTextFields(matrixATextFields, rowsA, colsA);
        double[][] matrixB = getMatrixFromTextFields(matrixBTextFields, rowsB, colsB);

        double[][] result = null;
        String operationName = "";

        switch (operation) {
            case SUM:
                result = Matrices2.sumMatrices(matrixA, matrixB);
                operationName = "Suma de Matrices";
                break;
            case SUBTRACT:
                result = Matrices2.subtractMatrices(matrixA, matrixB);
                operationName = "Resta de Matrices";
                break;
        }

        displayResult(operationName, result);
    }

    private void performMatrixMultiplication() {
        double[][] matrixA = getMatrixFromTextFields(matrixATextFields, rowsA, colsA);
        double[][] matrixB = getMatrixFromTextFields(matrixBTextFields, rowsB, colsB);

        try {
            double[][] result = Matrices2.multiplyMatrices(matrixA, matrixB);
            displayResult("Multiplicación de Matrices", result);
        } catch (IllegalArgumentException e) {
            resultTextArea.setText("No se pudo realizar la operación.\n" + e.getMessage());
        }
    }

    private void calculateMatrixDeterminant() {
        double[][] matrixA = getMatrixFromTextFields(matrixATextFields, rowsA, colsA);

        try {
            double determinant = Matrices2.calculateDeterminant(matrixA);
            resultTextArea.setText("Determinante de la Matriz A: " + formatDouble(determinant));
        } catch (IllegalArgumentException e) {
            resultTextArea.setText("No se pudo calcular el determinante.\n" + e.getMessage());
        }
    }

    private void calculateMatrixInverse() {
        double[][] matrixA = getMatrixFromTextFields(matrixATextFields, rowsA, colsA);

        try {
            double[][] inverse = Matrices2.calculateInverse(matrixA);
            if (inverse != null) {
                displayResult("Inversa de la Matriz A", inverse);
            } else {
                resultTextArea.setText("La Matriz A no es invertible.");
            }
        } catch (IllegalArgumentException e) {
            resultTextArea.setText("No se pudo calcular la inversa.\n" + e.getMessage());
        }
    }

    private String formatDouble(double value) {
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(value);
    }

    private void displayResult(String operationName, double[][] result) {
        if (result != null) {
            resultTextArea.setText(operationName + ":\n");
            for (double[] row : result) {
                for (double value : row) {
                    resultTextArea.append(formatDouble(value) + "\t");
                }
                resultTextArea.append("\n");
            }
        } else {
            resultTextArea.setText("No se pudo realizar la operación.");
        }
    }

    public static double[][] sumMatrices(double[][] matrixA, double[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static double[][] subtractMatrices(double[][] matrixA, double[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    public static double[][] multiplyMatrices(double[][] matrixA, double[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("El número de columnas de la matriz A debe ser igual al número de filas de la matriz B");
        }

        double[][] result = new double[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static double calculateDeterminant(double[][] matrix) {
        int n = matrix.length;
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else if (n == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                    - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                    + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        } else {
            throw new IllegalArgumentException("El cálculo del determinante solo está soportado para matrices 2x2 y 3x3");
        }
    }

    public static double[][] calculateInverse(double[][] matrix) {
        int n = matrix.length;
        
        if (n != matrix[0].length) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular la inversa.");
        }

        double[][] inverse = new double[n][n];
        double determinant = calculateDeterminant(matrix);

        if (determinant == 0) {
            throw new IllegalArgumentException("La matriz no es invertible (determinante = 0).");
        }

        if (n == 2) {
            inverse[0][0] = matrix[1][1] / determinant;
            inverse[0][1] = -matrix[0][1] / determinant;
            inverse[1][0] = -matrix[1][0] / determinant;
            inverse[1][1] = matrix[0][0] / determinant;
        } else {
            double[][] adjugate = new double[n][n];
            adjugate = getAdjugate(matrix);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    inverse[i][j] = adjugate[i][j] / determinant;
                }
            }
        }

        return inverse;
    }

    private static double[][] getAdjugate(double[][] matrix) {
        int n = matrix.length;
        double[][] adjugate = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double[][] minor = getMinor(matrix, i, j);
                adjugate[i][j] = Math.pow(-1, i + j) * calculateDeterminant(minor);
            }
        }

        return transpose(adjugate);
    }

    private static double[][] getMinor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int minorRow = 0;
        int minorCol = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != row && j != col) {
                    minor[minorRow][minorCol] = matrix[i][j];
                    minorCol++;
                    if (minorCol == n - 1) {
                        minorCol = 0;
                        minorRow++;
                    }
                }
            }
        }

        return minor;
    }

    private static double[][] transpose(double[][] matrix) {
        int n = matrix.length;
        double[][] transpose = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Matrices2();
            }
        });
    }
}

enum MatrixOperation {
    SUM, SUBTRACT
}
