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
import java.awt.FlowLayout;
import java.util.*;

public class Basica extends JFrame implements ActionListener {

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
    private JButton btnVolver;
    private JPanel panel;
    private JLabel lblNum;
    private JLabel lblNum_2;

    /**
     * Launch the application.
     */
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

    /**
     * Create the frame.
     */
    public Basica() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 387);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(12, 73, 88));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textNum1 = new JTextField();
        textNum1.setHorizontalAlignment(SwingConstants.CENTER);
        textNum1.setBounds(264, 88, 86, 20);
        contentPane.add(textNum1);
        textNum1.setColumns(10);

        textNum2 = new JTextField();
        textNum2.setHorizontalAlignment(SwingConstants.CENTER);
        textNum2.setBounds(264, 141, 86, 20);
        contentPane.add(textNum2);
        textNum2.setColumns(10);

        JLabel lblTextoResultado = new JLabel("Resultado:");
        lblTextoResultado.setForeground(new Color(31, 166, 140));
        lblTextoResultado.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblTextoResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblTextoResultado.setBounds(167, 197, 139, 23);
        contentPane.add(lblTextoResultado);

        lblResultado = new JLabel("");
        lblResultado.setForeground(new Color(31, 166, 140));
        lblResultado.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setBounds(318, 197, 86, 23);
        contentPane.add(lblResultado);
        
        JLabel lblCalculadoraBasiac = new JLabel("CALCULADORA BASICA");
        lblCalculadoraBasiac.setForeground(new Color(31, 166, 140));
        lblCalculadoraBasiac.setHorizontalAlignment(SwingConstants.CENTER);
        lblCalculadoraBasiac.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblCalculadoraBasiac.setBounds(165, 26, 348, 27);
        contentPane.add(lblCalculadoraBasiac);
        
        panel = new JPanel();
        panel.setBackground(new Color(21, 38, 54));
        panel.setBounds(10, 0, 145, 348);
        contentPane.add(panel);
                panel.setLayout(null);
        
                btnSuma = new JButton("SUMA");
                btnSuma.setBounds(7, 60, 131, 23);
                panel.add(btnSuma);
                btnSuma.setFocusable(false); 
                btnSuma.setBackground(new Color(37,54,82));
                btnSuma.setForeground(new Color(31, 166, 140));
                
                        btnResta = new JButton("RESTA");
                        btnResta.setBounds(7, 90, 131, 23);
                        panel.add(btnResta);
                        btnResta.setFocusable(false); 
                        btnResta.setBackground(new Color(37,54,82)); 
                        btnResta.setForeground(new Color(31, 166, 140));
                        
                                btnMulti = new JButton("MULTIPLICACION");
                                btnMulti.setBounds(7, 120, 131, 23);
                                panel.add(btnMulti);
                                btnMulti.setFocusable(false); 
                                btnMulti.setBackground(new Color(37,54,82));
                                btnMulti.setForeground(new Color(31, 166, 140));
                                
                                        btnDivi = new JButton("DIVISION");
                                        btnDivi.setBounds(7, 150, 131, 23);
                                        panel.add(btnDivi);
                                        btnDivi.setFocusable(false); 
                                        btnDivi.setBackground(new Color(37,54,82));
                                        btnDivi.setForeground(new Color(31, 166, 140));
                                        
                                        btnVolver = new JButton("VOLVER");
                                        btnVolver.setBounds(7, 314, 131, 23);
                                        panel.add(btnVolver);
                                        btnVolver.setForeground(new Color(31, 166, 140));
                                        btnVolver.setFocusable(false);
                                        btnVolver.setBackground(new Color(37,54,82));
                                        
                                        JLabel lblOpciones = new JLabel("OPCIONES");
                                        lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblOpciones.setForeground(new Color(31, 166, 140));
                                        lblOpciones.setFont(new Font("Verdana", Font.PLAIN, 20));
                                        lblOpciones.setBounds(10, 26, 128, 23);
                                        panel.add(lblOpciones);
                                        
                                        JButton btnRaiz = new JButton("RAIZ");
                                        btnRaiz.setForeground(new Color(31, 166, 140));
                                        btnRaiz.setFocusable(false);
                                        btnRaiz.setBackground(new Color(37, 54, 82));
                                        btnRaiz.setBounds(7, 180, 131, 23);
                                        panel.add(btnRaiz);
                                        
                                        JButton btnPotencia = new JButton("POTENCIA");
                                        btnPotencia.setForeground(new Color(31, 166, 140));
                                        btnPotencia.setFocusable(false);
                                        btnPotencia.setBackground(new Color(37, 54, 82));
                                        btnPotencia.setBounds(7, 210, 131, 23);
                                        panel.add(btnPotencia);
                                        
                                        lblNum = new JLabel("Num1:");
                                        lblNum.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblNum.setForeground(new Color(31, 166, 140));
                                        lblNum.setFont(new Font("Verdana", Font.PLAIN, 20));
                                        lblNum.setBounds(143, 85, 139, 23);
                                        contentPane.add(lblNum);
                                        
                                        lblNum_2 = new JLabel("Num2:");
                                        lblNum_2.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblNum_2.setForeground(new Color(31, 166, 140));
                                        lblNum_2.setFont(new Font("Verdana", Font.PLAIN, 20));
                                        lblNum_2.setBounds(143, 139, 139, 23);
                                        contentPane.add(lblNum_2);
                                        // enviar a la pestaña de calculadora basica
                                        btnVolver.addActionListener(new ActionListener() {
                                        	public void actionPerformed(ActionEvent e) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                                        	}
                                        });
                                  btnPotencia.addActionListener(this);
                               btnRaiz.addActionListener(this);
                          btnDivi.addActionListener(this);
                     btnMulti.addActionListener(this);
                btnResta.addActionListener(this);
          btnSuma.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(textNum1.getText());
        double num2 = Double.parseDouble(textNum2.getText());
        
        if (e.getSource() == btnSuma) {
            double suma = num1 + num2;
            lblResultado.setText(Double.toString(suma));
        } else if (e.getSource() == btnResta) {
        	double resta = num1 - num2;
            lblResultado.setText(Double.toString(resta));
        } else if (e.getSource() == btnMulti) {
        	double multi = num1 * num2;
            lblResultado.setText(Double.toString(multi));
        } else if (e.getSource() == btnDivi) { 
            if (num2 != 0) {
                double divi = num1 / num2;
                lblResultado.setText(Double.toString(divi));
            } else {
                lblResultado.setText("Error");
            }
    	} else if (e.getSource() == btnRaiz) {
    		double raiz = Math.sqrt(num1);
    		lblResultado.setText(Double.toString(raiz));
    	} else if (e.getSource() == btnPotencia) {
    		double poten = Math.pow(num1, num2);
    		lblResultado.setText(Double.toString(poten));
    }
   }
}
