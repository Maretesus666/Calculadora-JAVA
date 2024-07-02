package calcu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JSeparator;

public class Vectores {

    private JFrame frame;
    private JTextField textFieldVector1;
    private JTextField textFieldVector2;
    private JTextArea textAreaResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Vectores window = new Vectores();
                    window.getFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Vectores() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(12, 73, 88));
        frame.setBounds(100, 100, 750, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblVector1 = new JLabel("Vector 1:");
        lblVector1.setBounds(231, 90, 171, 35);
        lblVector1.setHorizontalAlignment(SwingConstants.CENTER);
        lblVector1.setForeground(new Color(31, 166, 140));
        lblVector1.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 33));
        frame.getContentPane().add(lblVector1);

        textFieldVector1 = new JTextField();
        textFieldVector1.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 30));
        textFieldVector1.setForeground(Color.GRAY);
        textFieldVector1.setBackground(Color.LIGHT_GRAY);
        textFieldVector1.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldVector1.setBounds(412, 91, 282, 35);
        textFieldVector1.setColumns(10);
        textFieldVector1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), null));
        textFieldVector1.setBackground(new Color(37, 54, 82));
        frame.getContentPane().add(textFieldVector1);

        JLabel lblVector2 = new JLabel("Vector 2:");
        lblVector2.setBounds(231, 170, 171, 35);
        lblVector2.setHorizontalAlignment(SwingConstants.CENTER);
        lblVector2.setForeground(new Color(31, 166, 140));
        lblVector2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 33));
        frame.getContentPane().add(lblVector2);

        textFieldVector2 = new JTextField();
        textFieldVector2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 30));
        textFieldVector2.setForeground(Color.GRAY);
        textFieldVector2.setBackground(Color.LIGHT_GRAY);
        textFieldVector2.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldVector2.setBounds(412, 171, 282, 35);
        textFieldVector2.setColumns(10);
        textFieldVector2.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), null));
        textFieldVector2.setBackground(new Color(37, 54, 82));
        frame.getContentPane().add(textFieldVector2);
        textFieldVector2.setColumns(10);

        textAreaResult = new JTextArea();
        textAreaResult.setText("...");
        textAreaResult.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 20));
        textAreaResult.setForeground(Color.WHITE);
        textAreaResult.setBackground(Color.WHITE);
        textAreaResult.setBounds(231, 312, 479, 35);
        textAreaResult.setColumns(10);
        textAreaResult.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), null));
        textAreaResult.setBackground(new Color(37, 54, 82));
        frame.getContentPane().add(textAreaResult);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(21, 38, 54));
        panel.setBounds(10, 0, 200, 461);
        frame.getContentPane().add(panel);
        
        JButton btnVolver = new JButton("VOLVER");
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cierra la ventana actual de Vectores
                MenuPrincipal.getInstancia().setVisible(true); // Muestra la instancia de MenuPrincipal
            }
        });

        btnVolver.setForeground(new Color(31, 166, 140));
        btnVolver.setFocusable(false);
        btnVolver.setBackground(new Color(37, 54, 82));
        btnVolver.setBounds(7, 427, 183, 23);
        panel.add(btnVolver);
        
        
        JLabel lblOpciones = new JLabel("OPCIONES");
        lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
        lblOpciones.setForeground(new Color(31, 166, 140));
        lblOpciones.setFont(new Font("BankGothic Lt BT", Font.BOLD, 21));
        lblOpciones.setBounds(10, 26, 180, 23);
        panel.add(lblOpciones);
        
                JButton btnSumar = new JButton("Sumar");
                btnSumar.setForeground(new Color(31, 166, 140));
                btnSumar.setBackground(new Color(37, 54, 82));
                btnSumar.setBounds(7, 60, 183, 23);
                panel.add(btnSumar);
                btnSumar.setFocusable(false);
                btnSumar.setBorder(null);
                btnSumar.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
                
                        JButton btnRestar = new JButton("Restar");
                        btnRestar.setForeground(new Color(31, 166, 140));
                        btnRestar.setBackground(new Color(37, 54, 82));
                        btnRestar.setBounds(7, 94, 183, 23);
                        panel.add(btnRestar);
                        btnRestar.setFocusable(false);
                        btnRestar.setBorder(null);
                        btnRestar.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
                        
                                JButton btnProductoEscalar = new JButton("Producto Escalar");
                                btnProductoEscalar.setForeground(new Color(31, 166, 140));
                                btnProductoEscalar.setBackground(new Color(37, 54, 82));
                                btnProductoEscalar.setBounds(7, 128, 183, 23);
                                panel.add(btnProductoEscalar);
                                btnProductoEscalar.setFocusable(false);
                                btnProductoEscalar.setBorder(null);
                                btnProductoEscalar.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
                                
                                        JButton btnProductoVectorial = new JButton("Producto Vectorial");
                                        btnProductoVectorial.setForeground(new Color(31, 166, 140));
                                        btnProductoVectorial.setBackground(new Color(37, 54, 82));
                                        btnProductoVectorial.setBounds(7, 162, 183, 23);
                                        panel.add(btnProductoVectorial);
                                        btnProductoVectorial.setFocusable(false);
                                        btnProductoVectorial.setBorder(null);
                                        btnProductoVectorial.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
                                        
                                        JLabel lblVectores = new JLabel("VECTORES");
                                        lblVectores.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblVectores.setForeground(new Color(31, 166, 140));
                                        lblVectores.setFont(new Font("BankGothic Lt BT", Font.BOLD, 36));
                                        lblVectores.setBounds(222, 11, 502, 49);
                                        frame.getContentPane().add(lblVectores);
                                        
                                        JSeparator separator = new JSeparator();
                                        separator.setBackground(new Color(21, 38, 54));
                                        separator.setBounds(234, 71, 479, 10);
                                        frame.getContentPane().add(separator);
                                        
                                        JLabel lblResultado = new JLabel("RESULTADO");
                                        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblResultado.setForeground(new Color(31, 166, 140));
                                        lblResultado.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 33));
                                        lblResultado.setBounds(231, 266, 482, 35);
                                        frame.getContentPane().add(lblResultado);
                                        btnProductoVectorial.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                realizarOperacion("productoVectorial");
                                            }
                                        });
                                btnProductoEscalar.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        realizarOperacion("productoEscalar");
                                    }
                                });
                        btnRestar.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                realizarOperacion("restar");
                            }
                        });
                btnSumar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        realizarOperacion("sumar");
                    }
                });
    }
    
    public JFrame getFrame() {
        return frame;
    }
    
    private void realizarOperacion(String operacion) {
        String vector1Str = textFieldVector1.getText();
        String vector2Str = textFieldVector2.getText();

        double[] vector1 = parseVector(vector1Str);
        double[] vector2 = parseVector(vector2Str);

        if (vector1 == null || vector2 == null) {
            textAreaResult.setText("Error: vector inválido");
            return;
        }

        double[] resultado;
        String resultadoStr = "";
        switch (operacion) {
            case "sumar":
                if (vector1.length != vector2.length) {
                    textAreaResult.setText("Error: vectores distinto tamaño");
                    return;
                }
                resultado = sumarVectores(vector1, vector2);
                resultadoStr = "";
                break;
            case "restar":
                if (vector1.length != vector2.length) {
                    textAreaResult.setText("Error: vectores distinto tamaño");
                    return;
                }
                resultado = restarVectores(vector1, vector2);
                resultadoStr = "";
                break;
            case "productoEscalar":
                if (vector1.length != vector2.length) {
                    textAreaResult.setText("Error: vectores distinto tamaño");
                    return;
                }
                double productoEscalar = productoEscalar(vector1, vector2);
                textAreaResult.setText("" + productoEscalar);
                return;
            case "productoVectorial":
                if (vector1.length != 3 || vector2.length != 3) {
                    textAreaResult.setText("Error: solo vectores de tamaño 3");
                    return;
                }
                resultado = productoVectorial(vector1, vector2);
                resultadoStr = "";
                break;
            default:
                textAreaResult.setText("Operación desconocida.");
                return;
        }
        for (double v : resultado) {
            resultadoStr += v + " ";
        }
        textAreaResult.setText(resultadoStr);
    }

    private double[] parseVector(String vectorStr) {
        String[] elements = vectorStr.split(",");
        if (elements.length > 20) return null;
        double[] vector = new double[elements.length];
        try {
            for (int i = 0; i < elements.length; i++) {
                vector[i] = Double.parseDouble(elements[i].trim());
            }
        } catch (NumberFormatException e) {
            return null;
        }
        return vector;
    }

    private double[] sumarVectores(double[] vector1, double[] vector2) {
        double[] suma = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            suma[i] = vector1[i] + vector2[i];
        }
        return suma;
    }

    private double[] restarVectores(double[] vector1, double[] vector2) {
        double[] resta = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resta[i] = vector1[i] - vector2[i];
        }
        return resta;
    }

    private double productoEscalar(double[] vector1, double[] vector2) {
        double producto = 0;
        for (int i = 0; i < vector1.length; i++) {
            producto += vector1[i] * vector2[i];
        }
        return producto;
    }

    private double[] productoVectorial(double[] vector1, double[] vector2) {
        double[] producto = new double[3];
        producto[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        producto[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        producto[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
        return producto;
    }

}
