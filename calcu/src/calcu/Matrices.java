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

public class Matrices extends JFrame {

    private JPanel contentPane;
    private JTextField textNum1;
    private JTextField textNum2;
    private JButton btnSumaMat; 
    private JButton btnRestaMat;
    private JButton btnMultiMatEsc;
    private JButton btnDiviMatEsc;
    private JLabel lblResultado;
    private JButton btnVolver;
    private JPanel panel;
    private JLabel lblVector;
    private JLabel lblVector_2;
    private JButton btnProductoEscalar;
    private JButton btnDeterminanteDeUna;
    private JButton btnInversaDeUna;
    private JButton btnDiviMatEscsionDeMatrices;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Matrices frame = new Matrices();
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
    public Matrices() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 387);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(12, 73, 88));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textNum1 = new JTextField();
        textNum1.setHorizontalAlignment(SwingConstants.CENTER);
        textNum1.setBounds(283, 80, 141, 20);
        contentPane.add(textNum1);
        textNum1.setColumns(10);

        textNum2 = new JTextField();
        textNum2.setHorizontalAlignment(SwingConstants.CENTER);
        textNum2.setBounds(283, 171, 141, 20);
        contentPane.add(textNum2);
        textNum2.setColumns(10);

        JLabel lblTextoResultado = new JLabel("Resultado:");
        lblTextoResultado.setForeground(new Color(31, 166, 140));
        lblTextoResultado.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblTextoResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblTextoResultado.setBounds(151, 259, 139, 23);
        contentPane.add(lblTextoResultado);

        lblResultado = new JLabel("");
        lblResultado.setForeground(new Color(31, 166, 140));
        lblResultado.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setBounds(283, 259, 230, 78);
        contentPane.add(lblResultado);
        
        JLabel lblCalculadoraBasiac = new JLabel("CALCULADORA DE MATRICES");
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
        
                btnSumaMat = new JButton("SUMA");
                btnSumaMat.setBounds(7, 60, 131, 23);
                panel.add(btnSumaMat);
                btnSumaMat.setFocusable(false); 
                btnSumaMat.setBackground(new Color(37,54,82));
                btnSumaMat.setForeground(new Color(31, 166, 140));
                
                        btnRestaMat = new JButton("RESTA");
                        btnRestaMat.setBounds(7, 90, 131, 23);
                        panel.add(btnRestaMat);
                        btnRestaMat.setFocusable(false); 
                        btnRestaMat.setBackground(new Color(37,54,82)); 
                        btnRestaMat.setForeground(new Color(31, 166, 140));
                        
                                btnMultiMatEsc = new JButton("MULTIPLICACION DE ESCALAR POR UNA MATRIZ");
                                btnMultiMatEsc.setBounds(7, 120, 131, 23);
                                panel.add(btnMultiMatEsc);
                                btnMultiMatEsc.setFocusable(false); 
                                btnMultiMatEsc.setBackground(new Color(37,54,82));
                                btnMultiMatEsc.setForeground(new Color(31, 166, 140));
                                
                                        btnDiviMatEsc = new JButton("MULTIPLICACION POR ESCALAR DE UN VECTOR");
                                        btnDiviMatEsc.setBounds(7, 180, 131, 23);
                                        panel.add(btnDiviMatEsc);
                                        btnDiviMatEsc.setFocusable(false); 
                                        btnDiviMatEsc.setBackground(new Color(37,54,82));
                                        btnDiviMatEsc.setForeground(new Color(31, 166, 140));
                                        
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
                                        
                                        btnProductoEscalar = new JButton("MULTIPLICACION DE MATRICES");
                                        btnProductoEscalar.setForeground(new Color(31, 166, 140));
                                        btnProductoEscalar.setFocusable(false);
                                        btnProductoEscalar.setBackground(new Color(37, 54, 82));
                                        btnProductoEscalar.setBounds(7, 150, 131, 23);
                                        panel.add(btnProductoEscalar);
                                        
                                        btnDeterminanteDeUna = new JButton("DETERMINANTE DE UNA MATRIZ");
                                        btnDeterminanteDeUna.setForeground(new Color(31, 166, 140));
                                        btnDeterminanteDeUna.setFocusable(false);
                                        btnDeterminanteDeUna.setBackground(new Color(37, 54, 82));
                                        btnDeterminanteDeUna.setBounds(7, 210, 131, 23);
                                        panel.add(btnDeterminanteDeUna);
                                        
                                        btnInversaDeUna = new JButton("INVERSA DE UNA MATRIZ");
                                        btnInversaDeUna.setForeground(new Color(31, 166, 140));
                                        btnInversaDeUna.setFocusable(false);
                                        btnInversaDeUna.setBackground(new Color(37, 54, 82));
                                        btnInversaDeUna.setBounds(7, 240, 131, 23);
                                        panel.add(btnInversaDeUna);
                                        
                                        btnDiviMatEscsionDeMatrices = new JButton("DIVISION DE MATRICES");
                                        btnDiviMatEscsionDeMatrices.setForeground(new Color(31, 166, 140));
                                        btnDiviMatEscsionDeMatrices.setFocusable(false);
                                        btnDiviMatEscsionDeMatrices.setBackground(new Color(37, 54, 82));
                                        btnDiviMatEscsionDeMatrices.setBounds(7, 270, 131, 23);
                                        panel.add(btnDiviMatEscsionDeMatrices);
                                        
                                        lblVector = new JLabel("Matriz 1:");
                                        lblVector.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblVector.setForeground(new Color(31, 166, 140));
                                        lblVector.setFont(new Font("Verdana", Font.PLAIN, 20));
                                        lblVector.setBounds(151, 77, 139, 23);
                                        contentPane.add(lblVector);
                                        
                                        lblVector_2 = new JLabel("Matriz 2:");
                                        lblVector_2.setHorizontalAlignment(SwingConstants.CENTER);
                                        lblVector_2.setForeground(new Color(31, 166, 140));
                                        lblVector_2.setFont(new Font("Verdana", Font.PLAIN, 20));
                                        lblVector_2.setBounds(151, 168, 139, 23);
                                        contentPane.add(lblVector_2);
                                        
                                        // enviar a la pestaña de calculadora basica
                                        btnVolver.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                MenuPrincipal menu = new MenuPrincipal();
                                                menu.setVisible(true);
                                            }
                                        });
    }
}

