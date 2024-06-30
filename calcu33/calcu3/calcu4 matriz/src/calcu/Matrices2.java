package calcu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Matrices2 extends JFrame {

    private JPanel mainPanel;
    private JPanel matrixPanel; // Nuevo panel para las matrices
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
        setSize(800, 600);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        matrixPanel = new JPanel(); // Nuevo panel para las matrices
        matrixPanel.setLayout(new GridLayout(1, 2));

        matrixAPanel = new JPanel();
        matrixAPanel.setBorder(BorderFactory.createTitledBorder("Matriz A"));
        matrixAPanel.setLayout(new GridLayout(rowsA, colsA));
        matrixATextFields = new JTextField[rowsA][colsA];
        initializeMatrixPanel(matrixAPanel, matrixATextFields);

        matrixBPanel = new JPanel();
        matrixBPanel.setBorder(BorderFactory.createTitledBorder("Matriz B"));
        matrixBPanel.setLayout(new GridLayout(rowsB, colsB));
        matrixBTextFields = new JTextField[rowsB][colsB];
        initializeMatrixPanel(matrixBPanel, matrixBTextFields);

        matrixPanel.add(matrixAPanel);
        matrixPanel.add(matrixBPanel);

        inputPanel.add(matrixPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 1));

        changeSizeButton = new JButton("Cambiar Tamaño");
        changeSizeButton.setFont(new Font("BankGothic Lt BT", Font.BOLD, 12));
        changeSizeButton.setBackground(new Color(12, 73, 88));
        changeSizeButton.setForeground(new Color(0, 0, 0));
        changeSizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeMatrixSize();
            }
        });

        sumButton = new JButton("Sumar Matrices");
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performMatrixOperation(MatrixOperation.SUM);
            }
        });

        subtractButton = new JButton("Restar Matrices");
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performMatrixOperation(MatrixOperation.SUBTRACT);
            }
        });

        multiplyButton = new JButton("Multiplicar Matrices");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performMatrixMultiplication();
            }
        });

        determinantButton = new JButton("Calcular Determinante");
        determinantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMatrixDeterminant();
            }
        });

        inverseButton = new JButton("Calcular Inversa");
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
        buttonPanel.add(determinantButton);
        buttonPanel.add(inverseButton);

        inputPanel.add(buttonPanel, BorderLayout.EAST);

        resultTextArea = new JTextArea(10, 40);
        resultTextArea.setEditable(false);

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
                    matrix[i][j] = 0.0; // Valor predeterminado si falla el parsing
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

            resultTextArea.setText(""); // Borra la matriz anterior de la pantalla
        }
    }

    private void performMatrixOperation(MatrixOperation operation) {
        double[][] matrixA = getMatrixFromTextFields(matrixATextFields, rowsA, colsA);
        double[][] matrixB = getMatrixFromTextFields(matrixBTextFields, rowsB, colsB);

        double[][] result = null;
        String operationName = "";

        switch (operation) {
            case SUM:
                result = Matrices.sumMatrices(matrixA, matrixB);
                operationName = "Suma de Matrices";
                break;
            case SUBTRACT:
                result = Matrices.subtractMatrices(matrixA, matrixB);
                operationName = "Resta de Matrices";
                break;
            default:
                break;
        }

        displayResult(operationName, result);
    }

    private void performMatrixMultiplication() {
        double[][] matrixA = getMatrixFromTextFields(matrixATextFields, rowsA, colsA);
        double[][] matrixB = getMatrixFromTextFields(matrixBTextFields, rowsB, colsB);

        double[][] result = Matrices.multiplyMatrices(matrixA, matrixB);
        displayResult("Multiplicación de Matrices", result);
    }

    private void calculateMatrixDeterminant() {
        double[][] matrixA = getMatrixFromTextFields(matrixATextFields, rowsA, colsA);
        double determinant = Matrices.calculateDeterminant(matrixA);

        resultTextArea.setText("Determinante de la Matriz A: " + formatDouble(determinant));
    }

    private void calculateMatrixInverse() {
        double[][] matrixA = getMatrixFromTextFields(matrixATextFields, rowsA, colsA);
        double[][] inverse = Matrices.calculateInverse(matrixA);

        if (inverse != null) {
            setMatrixToTextFields(inverse, matrixATextFields);
            resultTextArea.setText("Inversa de la Matriz A:");
        } else {
            resultTextArea.setText("La Matriz A no es invertible.");
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
