package calcu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class Basica extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField textNum1;
    private JTextField textNum2;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnMulti;
    private JButton btnDivi;
    private JButton btnRaiz;
    private JButton btnPotencia;
    private JLabel lblResultado;
    private JLabel lblCalculadoraBasica;
    private JLabel lblNum;
    private JLabel lblNum_2;
    private JLabel lblTextoError;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Basica frame = new Basica();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Basica() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(12, 73, 88));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textNum1 = new JTextField();
        textNum1.setText("0");
        textNum1.setCaretColor(new Color(255, 255, 255));
        textNum1.setFont(new Font("BankGothic Lt BT", Font.BOLD, 38));
        textNum1.setForeground(Color.WHITE);
        textNum1.setBackground(Color.LIGHT_GRAY);
        textNum1.setHorizontalAlignment(SwingConstants.CENTER);
        textNum1.setBounds(450, 147, 223, 46);
        contentPane.add(textNum1);
        textNum1.setColumns(10);
        textNum1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), null));
        textNum1.setBackground(new Color(37, 54, 82));

        textNum2 = new JTextField();
        textNum2.setText("0");
        textNum2.setCaretColor(new Color(255, 255, 255));
        textNum2.setFont(new Font("BankGothic Lt BT", Font.BOLD, 38));
        textNum2.setForeground(Color.WHITE);
        textNum2.setBackground(Color.LIGHT_GRAY);
        textNum2.setHorizontalAlignment(SwingConstants.CENTER);
        textNum2.setBounds(450, 242, 223, 46);
        contentPane.add(textNum2);
        textNum2.setColumns(10);
        textNum2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum2.setBackground(new Color(37, 54, 82));
        
        JLabel lblTextoResultado = new JLabel("RESULTADO:");
        lblTextoResultado.setForeground(new Color(31, 166, 140));
        lblTextoResultado.setFont(new Font("BankGothic Lt BT", Font.BOLD, 36));
        lblTextoResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblTextoResultado.setBounds(222, 336, 264, 66);
        contentPane.add(lblTextoResultado);

        lblResultado = new JLabel("...");
        lblResultado.setBackground(Color.WHITE);
        lblResultado.setForeground(new Color(0, 138, 0));
        lblResultado.setFont(new Font("BankGothic Lt BT", Font.BOLD, 36));
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setBounds(485, 359, 239, 23);
        contentPane.add(lblResultado);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(21, 38, 54));
        panel.setBounds(12, 0, 200, 461);
        contentPane.add(panel);
        
        JButton btnVolver = new JButton("VOLVER");
        btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
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
        
                btnSuma = new JButton("SUMA");
                btnSuma.setForeground(new Color(31, 166, 140));
                btnSuma.setBackground(new Color(37, 54, 82));
                btnSuma.setBounds(7, 60, 183, 23);
                panel.add(btnSuma);
                btnSuma.setFocusable(false);
                btnSuma.setBorder(null);
                btnSuma.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
                
                        btnResta = new JButton("RESTA");
                        btnResta.setForeground(new Color(31, 166, 140));
                        btnResta.setBackground(new Color(37, 54, 82));
                        btnResta.setBounds(7, 94, 183, 23);
                        panel.add(btnResta);
                        btnResta.setFocusable(false);
                        btnResta.setBorder(null);
                        btnResta.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
                        
                                btnMulti = new JButton("MULTIPLICACION");
                                btnMulti.setForeground(new Color(31, 166, 140));
                                btnMulti.setBackground(new Color(37, 54, 82));
                                btnMulti.setBounds(7, 128, 183, 23);
                                panel.add(btnMulti);
                                btnMulti.setFocusable(false);
                                btnMulti.setBorder(null);
                                btnMulti.setFont(new Font("Dialog", Font.BOLD, 15));
                                
                                        btnDivi = new JButton("DIVISION");
                                        btnDivi.setForeground(new Color(31, 166, 140));
                                        btnDivi.setBackground(new Color(37, 54, 82));
                                        btnDivi.setBounds(7, 162, 183, 23);
                                        panel.add(btnDivi);
                                        btnDivi.setFocusable(false); 
                                        btnDivi.setBorder(null);
                                        btnDivi.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
                                        
                                                btnRaiz = new JButton("RAIZ");
                                                btnRaiz.setForeground(new Color(31, 166, 140));
                                                btnRaiz.setBackground(new Color(37, 54, 82));
                                                btnRaiz.setBounds(7, 196, 183, 23);
                                                panel.add(btnRaiz);
                                                btnRaiz.setFocusable(false); 
                                                btnRaiz.setBorder(null);
                                                btnRaiz.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
                                                
                                                        btnPotencia = new JButton("POTENCIA");
                                                        btnPotencia.setForeground(new Color(31, 166, 140));
                                                        btnPotencia.setBackground(new Color(37, 54, 82));
                                                        btnPotencia.setBounds(7, 230, 183, 23);
                                                        panel.add(btnPotencia);
                                                        btnPotencia.setFocusable(false);
                                                        btnPotencia.setBorder(null);
                                                        btnPotencia.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
                                                        
                                                        lblCalculadoraBasica = new JLabel("CALCULADORA BASICA");
                                                        lblCalculadoraBasica.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblCalculadoraBasica.setForeground(new Color(31, 166, 140));
                                                        lblCalculadoraBasica.setFont(new Font("BankGothic Lt BT", Font.BOLD, 36));
                                                        lblCalculadoraBasica.setBounds(222, 26, 502, 49);
                                                        contentPane.add(lblCalculadoraBasica);
                                                        
                                                        lblNum = new JLabel("Num 1:");
                                                        lblNum.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblNum.setForeground(new Color(31, 166, 140));
                                                        lblNum.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 40));
                                                        lblNum.setBounds(234, 132, 206, 84);
                                                        contentPane.add(lblNum);
                                                        
                                                        lblNum_2 = new JLabel("Num 2:");
                                                        lblNum_2.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblNum_2.setForeground(new Color(31, 166, 140));
                                                        lblNum_2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 40));
                                                        lblNum_2.setBounds(234, 227, 206, 84);
                                                        contentPane.add(lblNum_2);
                                                        
                                                        JSeparator separator = new JSeparator();
                                                        separator.setBackground(new Color(21, 38, 54));
                                                        separator.setBounds(234, 86, 479, 10);
                                                        contentPane.add(separator);
                                                        
                                                        lblTextoError = new JLabel("");
                                                        lblTextoError.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblTextoError.setForeground(new Color(31, 166, 140));
                                                        lblTextoError.setFont(new Font("BankGothic Lt BT", Font.BOLD, 24));
                                                        lblTextoError.setBounds(222, 393, 502, 37);
                                                        contentPane.add(lblTextoError);
                                                        btnPotencia.addActionListener(this);
                                                btnRaiz.addActionListener(this);
                                        btnDivi.addActionListener(this);
                                btnMulti.addActionListener(this);
                        btnResta.addActionListener(this);
                btnSuma.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(textNum1.getText());
            double num2 = Double.parseDouble(textNum2.getText());
            double resultado = 0;
            String errorMensaje = "";

            if (e.getSource() == btnSuma) {
                lblNum.setText("Num 1:");
                lblNum_2.setText("Num 2:");
                resultado = num1 + num2;
                double primerosDosDigitos = (double)((int)(resultado * 100)) / 100;
                resultado = primerosDosDigitos;
            } else if (e.getSource() == btnResta) {
                lblNum.setText("Num 1:");
                lblNum_2.setText("Num 2:");
                resultado = num1 - num2;
                double primerosDosDigitos = Math.ceil(resultado * 100) / 100;
                resultado = primerosDosDigitos;
            } else if (e.getSource() == btnMulti) {
                lblNum.setText("Num 1:");
                lblNum_2.setText("Num 2:");
                resultado = num1 * num2;
                double primerosDosDigitos = (double)((int)(resultado * 100)) / 100;
                resultado = primerosDosDigitos;
            } else if (e.getSource() == btnDivi) {
                lblNum.setText("Num 1:");
                lblNum_2.setText("Num 2:");
                if (num2 != 0) {
                    resultado = num1 / num2;
                    double primerosDosDigitos = (double)((int)(resultado * 100)) / 100;
                    resultado = primerosDosDigitos;
                } else {
                    errorMensaje = "Error: División por cero";
                    lblTextoError.setForeground(new Color(255, 0, 0));
                    lblResultado.setText("");
                }
            } else if (e.getSource() == btnRaiz) {
            	
                lblNum.setText("Base:");
                lblNum_2.setText("Raiz:");
                
                if (num1 >= 0) {
                    resultado = Math.sqrt(num1);
                    double primerosDosDigitos = (double)((int)(resultado * 100)) / 100;
                    resultado = primerosDosDigitos;
                } else {
                    errorMensaje = "Error: No se puede calcular la raíz cuadrada de un número negativo";
                    lblTextoError.setForeground(new Color(255, 0, 0));
                    lblResultado.setText("");
                }
            } else if (e.getSource() == btnPotencia) {
                lblNum.setText("Base:");
                lblNum_2.setText("Potencia:");
            	
                resultado = Math.pow(num1, num2);
                double primerosDosDigitos = (double)((int)(resultado * 100)) / 100;
                resultado = primerosDosDigitos;
            } else {
                errorMensaje = "Operación no reconocida";
                lblTextoError.setForeground(new Color(255, 0, 0));
            }

            if (errorMensaje.isEmpty()) {
                lblResultado.setText(String.valueOf(resultado));
                lblTextoError.setText(""); 
            } else {
                lblTextoError.setText(errorMensaje);
                lblResultado.setText(""); 
            }

        } catch (NumberFormatException ex) {
            lblTextoError.setText("Error: Ingrese números válidos");
            lblTextoError.setForeground(new Color(255, 0, 0));
            lblResultado.setText("");
        }
    }

}
