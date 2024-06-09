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

public class SistEcuaciones extends JFrame {

    private JPanel contentPane;
    private JTextField textNum1;
    private JTextField textNum2;
    private JButton btnSist2; 
    private JButton btnSist3;
    private JLabel lblResultado;
    private JButton btnVolver;
    private JPanel panel;
    private JLabel lblSist2;
    private JLabel lblSist3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SistEcuaciones frame = new SistEcuaciones();
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
    public SistEcuaciones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 387);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(12, 73, 88));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textNum1 = new JTextField();
        textNum1.setHorizontalAlignment(SwingConstants.CENTER);
        textNum1.setBounds(316, 80, 141, 20);
        contentPane.add(textNum1);
        textNum1.setColumns(10);

        textNum2 = new JTextField();
        textNum2.setHorizontalAlignment(SwingConstants.CENTER);
        textNum2.setBounds(316, 171, 141, 20);
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
        
        JLabel lblCalculadoraBasiac = new JLabel("CALCULADORA DE SIST. ECUACIONES");
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
        
        btnSist2 = new JButton("RESOLVER 2x2");
        btnSist2.setBounds(7, 60, 131, 49);
        panel.add(btnSist2);
        btnSist2.setFocusable(false); 
        btnSist2.setBackground(new Color(37,54,82));
        btnSist2.setForeground(new Color(31, 166, 140));
                
        btnSist3 = new JButton("RESOLVER 3x3");
        btnSist3.setBounds(7, 120, 131, 49);
        panel.add(btnSist3);
        btnSist3.setFocusable(false); 
        btnSist3.setBackground(new Color(37,54,82));
        btnSist3.setForeground(new Color(31, 166, 140));
                
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
        
        lblSist2 = new JLabel("Sistema 2x2:");
        lblSist2.setHorizontalAlignment(SwingConstants.CENTER);
        lblSist2.setForeground(new Color(31, 166, 140));
        lblSist2.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblSist2.setBounds(166, 77, 139, 23);
        contentPane.add(lblSist2);
        
        lblSist3 = new JLabel("Sistema 3x3");
        lblSist3.setHorizontalAlignment(SwingConstants.CENTER);
        lblSist3.setForeground(new Color(31, 166, 140));
        lblSist3.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblSist3.setBounds(166, 168, 139, 23);
        contentPane.add(lblSist3);
        
        // vuelve a calculadora basica
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
            }
        });
        



    }
}
