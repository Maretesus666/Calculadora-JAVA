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
import java.awt.Cursor;

public class Vectores {

    private JFrame frame;
    private JTextField textFieldVector1;
    private JTextField textFieldVector2;
    private JTextArea textAreaResult;
    private JTextField textFieldEscalar;
    private JLabel lblTextoError;

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
        textFieldVector1.setCaretColor(new Color(255, 255, 255));
        textFieldVector1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        textFieldVector1.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 30));
        textFieldVector1.setForeground(Color.WHITE);
        textFieldVector1.setBackground(new Color(192, 192, 192));
        textFieldVector1.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldVector1.setBounds(412, 91, 282, 35);
        textFieldVector1.setColumns(10);

        textFieldVector1.setText("0,0,0");
        textFieldVector1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), null));
        textFieldVector1.setBackground(new Color(37, 54, 82));
        textFieldVector1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                String currentText = textFieldVector1.getText();
                if (currentText.equals("0,0,0")) {
                    textFieldVector1.setText("");
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                String currentText = textFieldVector1.getText();
                if (currentText.equals("")) {
                    textFieldVector1.setText("0,0,0");
                }
            }
        });

        frame.getContentPane().add(textFieldVector1);
        frame.setVisible(true);

        JLabel lblVector2 = new JLabel("Vector 2:");
        lblVector2.setBounds(231, 170, 171, 35);
        lblVector2.setHorizontalAlignment(SwingConstants.CENTER);
        lblVector2.setForeground(new Color(31, 166, 140));
        lblVector2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 33));
        frame.getContentPane().add(lblVector2);

        textFieldVector2 = new JTextField();
        textFieldVector2.setCaretColor(new Color(255, 255, 255));
        textFieldVector2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 30));
        textFieldVector2.setForeground(Color.WHITE);
        textFieldVector2.setBackground(Color.LIGHT_GRAY);
        textFieldVector2.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldVector2.setBounds(412, 171, 282, 35);
        textFieldVector2.setColumns(10);
        textFieldVector2.setText("0,0,0");
        textFieldVector2.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), null));
        textFieldVector2.setBackground(new Color(37, 54, 82));
        textFieldVector2.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            String currentText = textFieldVector2.getText();
            if (currentText.equals("0,0,0")) {
                textFieldVector2.setText("");
            }
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            String currentText = textFieldVector2.getText();
            if (currentText.equals("")) {
                textFieldVector2.setText("0,0,0");
            }
        }
    });
        frame.getContentPane().add(textFieldVector2);
        textFieldVector2.setColumns(10);

        textAreaResult = new JTextArea();
        textAreaResult.setEditable(false);
        textAreaResult.setText("...");
        textAreaResult.setFont(new Font("BankGothic Lt BT", Font.BOLD, 24));
        textAreaResult.setForeground(Color.WHITE);
        textAreaResult.setBackground(Color.WHITE);
        textAreaResult.setBounds(234, 382, 479, 35);
        textAreaResult.setForeground(new Color(0, 138, 0));
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
                frame.dispose(); 
                MenuPrincipal.getInstancia().setVisible(true); 
            }
        });

        btnVolver.setForeground(new Color(31, 166, 140));
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
        
        JButton btnMultiplicacionEscalar = new JButton("Mult. por escalar");
        btnMultiplicacionEscalar.setForeground(new Color(31, 166, 140));
        btnMultiplicacionEscalar.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
        btnMultiplicacionEscalar.setFocusable(false);
        btnMultiplicacionEscalar.setBorder(null);
        btnMultiplicacionEscalar.setBackground(new Color(37, 54, 82));
        btnMultiplicacionEscalar.setBounds(7, 196, 183, 23);
        panel.add(btnMultiplicacionEscalar);
        btnMultiplicacionEscalar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("multiplicarPorEscalar");
            }
        });
        
        JLabel lblVectores = new JLabel("VECTORES");
        lblVectores.setHorizontalAlignment(SwingConstants.CENTER);
        lblVectores.setForeground(new Color(31, 166, 140));
        lblVectores.setFont(new Font("BankGothic Lt BT", Font.BOLD, 36));
        lblVectores.setBounds(222, 11, 502, 49);
        frame.getContentPane().add(lblVectores);
        
        JSeparator separator = new JSeparator();
        separator.setBackground(new Color(31, 166, 140));
        separator.setBounds(222, 59, 502, 2);
        frame.getContentPane().add(separator);
        
        JLabel lblEscalar = new JLabel("Escalar:");
        lblEscalar.setHorizontalAlignment(SwingConstants.CENTER);
        lblEscalar.setForeground(new Color(31, 166, 140));
        lblEscalar.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 33));
        lblEscalar.setBounds(231, 250, 171, 35);
        frame.getContentPane().add(lblEscalar);
        
        textFieldEscalar = new JTextField();
        textFieldEscalar.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldEscalar.setForeground(Color.WHITE);
        textFieldEscalar.setCaretColor(new Color(255, 255, 255));
        textFieldEscalar.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 30));
        textFieldEscalar.setColumns(10);
        textFieldEscalar.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), null));
        textFieldEscalar.setBackground(new Color(37, 54, 82));
        textFieldEscalar.setBounds(412, 251, 70, 35);
        frame.getContentPane().add(textFieldEscalar);
        
        JLabel lblResultado = new JLabel("Resultado");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setForeground(new Color(31, 166, 140));
        lblResultado.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 33));
        lblResultado.setBounds(234, 336, 479, 35);
        frame.getContentPane().add(lblResultado);
        
        lblTextoError = new JLabel("");
        lblTextoError.setHorizontalAlignment(SwingConstants.CENTER);
        lblTextoError.setForeground(new Color(31, 166, 140));
        lblTextoError.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 20));
        lblTextoError.setBounds(222, 422, 502, 28);
        frame.getContentPane().add(lblTextoError);

        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("sumar");
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("restar");
            }
        });

        btnProductoEscalar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("productoEscalar");
            }
        });

        btnProductoVectorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("productoVectorial");
            }
        });

    }

    private void realizarOperacion(String operacion) {
        try {
            String vector1Text = textFieldVector1.getText().trim();
            String vector2Text = textFieldVector2.getText().trim();
            String escalarText = textFieldEscalar.getText().trim();

            String[] vector1Parts = vector1Text.split(",");
            String[] vector2Parts = vector2Text.split(",");

            double[] vector1 = new double[vector1Parts.length];
            double[] vector2 = new double[vector2Parts.length];

            for (int i = 0; i < vector1Parts.length; i++) {
                vector1[i] = Double.parseDouble(vector1Parts[i]);
            }

            for (int i = 0; i < vector2Parts.length; i++) {
                vector2[i] = Double.parseDouble(vector2Parts[i]);
            }

            String resultado = "";

            switch (operacion) {
                case "sumar":
                    resultado = sumarVectores(vector1, vector2);
                    break;
                case "restar":
                    resultado = restarVectores(vector1, vector2);
                    
                    break;
                case "productoEscalar":
                    if (vector1.length != vector2.length) {
                        lblTextoError.setText("Los vectores deben tener la misma longitud.");
                        return;
                    }
                    resultado = productoEscalar(vector1, vector2);
                    break;
                case "productoVectorial":
                    if (vector1.length != 3 || vector2.length != 3) {
                        lblTextoError.setText("Los vectores deben tener 3 digitos.");
                        lblTextoError.setForeground(new Color(255, 0, 0));
                        return;
                    }
                    resultado = productoVectorial(vector1, vector2);
                    break;
                case "multiplicarPorEscalar":
                    if (escalarText.isEmpty()) {
                        lblTextoError.setText("Ingrese un valor escalar.");
                        lblTextoError.setForeground(new Color(255, 0, 0));
                        return;
                    } else {
                        double escalar = Double.parseDouble(escalarText);
                        resultado = multiplicarPorEscalar(vector1, escalar);

                    }
                    break;
            }

            if (!resultado.isEmpty()) {
                textAreaResult.setText(resultado);
                lblTextoError.setText("");
            }

        } catch (NumberFormatException e) {
            lblTextoError.setText("Error en la entrada de datos.");
            lblTextoError.setForeground(new Color(255, 0, 0));
        }
    }


    private String sumarVectores(double[] vector1, double[] vector2) {
        if (vector1.length != vector2.length) {
            lblTextoError.setText("Los vectores deben tener la misma longitud.");
            lblTextoError.setForeground(new Color(255, 0, 0));
            return "";
        }

        double[] resultado = new double[vector1.length];

        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] + vector2[i];
            double primerosDosDigitos = Math.ceil(resultado[i] * 100) / 100;
            resultado[i] = primerosDosDigitos;
        }

        lblTextoError.setText(""); 
        return vectorToString(resultado);
    }

    private String restarVectores(double[] vector1, double[] vector2) {
        if (vector1.length != vector2.length) {
            lblTextoError.setText("Los vectores deben tener la misma longitud.");
            lblTextoError.setForeground(new Color(255, 0, 0));
            return "";
        }

        double[] resultado = new double[vector1.length];

        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] - vector2[i];
            double primerosDosDigitos = Math.ceil(resultado[i] * 100) / 100;
            resultado[i] = primerosDosDigitos;
        }

        lblTextoError.setText(""); 
        return vectorToString(resultado);
    }

    private String productoEscalar(double[] vector1, double[] vector2) {
        if (vector1.length != vector2.length) {
            lblTextoError.setText("Los vectores deben tener la misma longitud para el producto escalar.");
            lblTextoError.setForeground(new Color(255, 0, 0));
            return "";
        }

        double resultado = 0;

        for (int i = 0; i < vector1.length; i++) {
            resultado += vector1[i] * vector2[i];
            double primerosDosDigitos = Math.ceil(resultado * 100) / 100;
            resultado = primerosDosDigitos;
        }

        lblTextoError.setText(""); 
        return String.valueOf(resultado);
    }


    private String productoVectorial(double[] vector1, double[] vector2) {
        if (vector1.length != 3 || vector2.length != 3) {
            lblTextoError.setText("Los vectores deben tener exactamente 3 componentes para el producto vectorial.");
            lblTextoError.setForeground(new Color(255, 0, 0));
            return "";
        }

        double[] resultado = new double[3];

        
        resultado[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        resultado[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        resultado[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];

        double primerosDosDigitos = Math.ceil(resultado[0] * 100) / 100;
        resultado[0] = primerosDosDigitos;
        
        double primerosDosDigitos2 = Math.ceil(resultado[1] * 100) / 100;
        resultado[1] = primerosDosDigitos2;
        
        double primerosDosDigitos3 = Math.ceil(resultado[2] * 100) / 100;
        resultado[2] = primerosDosDigitos3;
        
        lblTextoError.setText(""); 

        return vectorToString(resultado);
    }

    private String multiplicarPorEscalar(double[] vector, double escalar) {
        double[] resultado = new double[vector.length];

        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * escalar;
            double primerosDosDigitos = Math.ceil(resultado[i] * 100) / 100;
            resultado[i] = primerosDosDigitos;
        }

        return vectorToString(resultado);
    }

    private String vectorToString(double[] vector) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vector.length; i++) {
            sb.append(vector[i]);
            if (i < vector.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    public JFrame getFrame() {
        return frame;
    }
}
