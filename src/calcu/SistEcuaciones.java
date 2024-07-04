package calcu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;

public class SistEcuaciones extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField textNum1;
    private JButton btnSist2; 
    private JButton btnSist3;
    private JLabel lblResultado1;
    private JButton btnVolver;
    private JPanel panel;
    private JLabel lblSistemaDeEcuaciones;
    private JSeparator separator;
    private JLabel lblNewLabel;
    private JTextField textNum2;
    private JLabel lbly;
    private JTextField textNum3;
    private JLabel lblz;
    private JTextField textNum4;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JTextField textNum5;
    private JLabel lbly_1;
    private JTextField textNum6;
    private JLabel lblz_1;
    private JTextField textNum7;
    private JLabel lblNewLabel_3;
    private JTextField textNum8;
    private JLabel lblNewLabel_4;
    private JTextField textNum9;
    private JLabel lbly_2;
    private JTextField textNum10;
    private JLabel lblz_2;
    private JTextField textNum11;
    private JLabel lblNewLabel_5;
    private JTextField textNum12;
    private JLabel lblResultadoY;
    private JLabel lblResultado2;
    private JLabel lblTextoResultado_2;
    private JLabel lblResultado3;
    private JLabel lblTextoError;


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


    public SistEcuaciones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(12, 73, 88));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textNum1 = new JTextField();
        textNum1.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum1.setForeground(Color.WHITE);
        textNum1.setBackground(Color.LIGHT_GRAY);
        textNum1.setHorizontalAlignment(SwingConstants.CENTER);
        textNum1.setBounds(273, 92, 50, 50);
        textNum1.setText("0");
        contentPane.add(textNum1);
        textNum1.setColumns(10);
        textNum1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), null));
        textNum1.setBackground(new Color(37, 54, 82));

        JLabel lblTextoResultado = new JLabel("Resultado X =");
        lblTextoResultado.setForeground(new Color(31, 166, 140));
        lblTextoResultado.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblTextoResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblTextoResultado.setBounds(220, 289, 315, 30);
        contentPane.add(lblTextoResultado);

        lblResultado1 = new JLabel("...");
        lblResultado1.setForeground(Color.WHITE);
        lblResultado1.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 25));
        lblResultado1.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado1.setBounds(545, 289, 177, 36);
        contentPane.add(lblResultado1);
        
        panel = new JPanel();
        panel.setBackground(new Color(21, 38, 54));
        panel.setBounds(10, 0, 200, 461);
        contentPane.add(panel);
        panel.setLayout(null);
        
        btnSist2 = new JButton("RESOLVER 2x2");
        btnSist2.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
        btnSist2.setBounds(7, 60, 183, 49);
        panel.add(btnSist2);
        btnSist2.setFocusable(false); 
        btnSist2.setBackground(new Color(37,54,82));
        btnSist2.setForeground(new Color(31, 166, 140));
        btnSist2.addActionListener(this);
                
        btnSist3 = new JButton("RESOLVER 3x3");
        btnSist3.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
        btnSist3.setBounds(7, 120, 183, 49);
        panel.add(btnSist3);
        btnSist3.setFocusable(false); 
        btnSist3.setBackground(new Color(37,54,82));
        btnSist3.setForeground(new Color(31, 166, 140));
        btnSist3.addActionListener(this);
                
        btnVolver = new JButton("VOLVER");
        btnVolver.setBounds(7, 427, 183, 23);
        panel.add(btnVolver);
        btnVolver.setForeground(new Color(31, 166, 140));
        btnVolver.setFocusable(false);
        btnVolver.setBackground(new Color(37,54,82));
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
            }
        });
        
        JLabel lblOpciones = new JLabel("OPCION\r\nES");
        lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
        lblOpciones.setForeground(new Color(31, 166, 140));
        lblOpciones.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 27));
        lblOpciones.setBounds(3, 26, 187, 23);
        panel.add(lblOpciones);
        
        lblSistemaDeEcuaciones = new JLabel("SIST. DE ECUACIONES");
        lblSistemaDeEcuaciones.setHorizontalAlignment(SwingConstants.CENTER);
        lblSistemaDeEcuaciones.setForeground(new Color(31, 166, 140));
        lblSistemaDeEcuaciones.setFont(new Font("BankGothic Lt BT", Font.BOLD, 36));
        lblSistemaDeEcuaciones.setBounds(220, 11, 502, 49);
        contentPane.add(lblSistemaDeEcuaciones);
        
        separator = new JSeparator();
        separator.setBackground(new Color(21, 38, 54));
        separator.setBounds(230, 71, 479, 10);
        contentPane.add(separator);
        
        lblNewLabel = new JLabel("X1");
        lblNewLabel.setForeground(new Color(31, 166, 140));
        lblNewLabel.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblNewLabel.setBounds(221, 95, 55, 36);
        contentPane.add(lblNewLabel);
        
        textNum2 = new JTextField();
        textNum2.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum2.setForeground(Color.WHITE);
        textNum2.setBackground(Color.LIGHT_GRAY);
        textNum2.setHorizontalAlignment(SwingConstants.CENTER);
        textNum2.setBounds(398, 92, 50, 50);
        textNum2.setText("0");
        contentPane.add(textNum2);
        textNum2.setColumns(10);
        textNum2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum2.setBackground(new Color(37, 54, 82));
        
        lbly = new JLabel("X2");
        lbly.setForeground(new Color(31, 166, 140));
        lbly.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lbly.setBounds(333, 95, 55, 36);
        contentPane.add(lbly);
        
        textNum3 = new JTextField();
        textNum3.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum3.setForeground(Color.WHITE);
        textNum3.setBackground(Color.LIGHT_GRAY);
        textNum3.setHorizontalAlignment(SwingConstants.CENTER);
        textNum3.setBounds(523, 92, 50, 50);
        textNum3.setText("0");
        contentPane.add(textNum3);
        textNum3.setColumns(10);
        textNum3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum3.setBackground(new Color(37, 54, 82));
        
        lblz = new JLabel("X3");
        lblz.setForeground(new Color(31, 166, 140));
        lblz.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblz.setBounds(458, 95, 55, 36);
        contentPane.add(lblz);
        
        textNum4 = new JTextField();
        textNum4.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum4.setForeground(Color.WHITE);
        textNum4.setBackground(Color.LIGHT_GRAY);
        textNum4.setHorizontalAlignment(SwingConstants.CENTER);
        textNum4.setBounds(648, 92, 50, 50);
        textNum4.setText("0");
        contentPane.add(textNum4);
        textNum4.setColumns(10);
        textNum4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum4.setBackground(new Color(37, 54, 82));
        
        lblNewLabel_1 = new JLabel("X4");
        lblNewLabel_1.setForeground(new Color(31, 166, 140));
        lblNewLabel_1.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblNewLabel_1.setBounds(583, 95, 55, 36);
        contentPane.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("X1");
        lblNewLabel_2.setForeground(new Color(31, 166, 140));
        lblNewLabel_2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblNewLabel_2.setBounds(221, 156, 55, 36);
        contentPane.add(lblNewLabel_2);
        
        textNum5 = new JTextField();
        textNum5.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum5.setForeground(Color.WHITE);
        textNum5.setBackground(Color.LIGHT_GRAY);
        textNum5.setHorizontalAlignment(SwingConstants.CENTER);
        textNum5.setBounds(273, 153, 50, 50);
        textNum5.setText("0");
        contentPane.add(textNum5);
        textNum5.setColumns(10);
        textNum5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum5.setBackground(new Color(37, 54, 82));
        
        lbly_1 = new JLabel("X2");
        lbly_1.setForeground(new Color(31, 166, 140));
        lbly_1.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lbly_1.setBounds(333, 156, 55, 36);
        contentPane.add(lbly_1);
        
        textNum6 = new JTextField();
        textNum6.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum6.setForeground(Color.WHITE);
        textNum6.setBackground(Color.LIGHT_GRAY);
        textNum6.setHorizontalAlignment(SwingConstants.CENTER);
        textNum6.setBounds(398, 153, 50, 50);
        textNum6.setText("0");
        contentPane.add(textNum6);
        textNum6.setColumns(10);
        textNum6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum6.setBackground(new Color(37, 54, 82));
        
        lblz_1 = new JLabel("X3");
        lblz_1.setForeground(new Color(31, 166, 140));
        lblz_1.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblz_1.setBounds(458, 156, 55, 36);
        contentPane.add(lblz_1);
        
        textNum7 = new JTextField();
        textNum7.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum7.setForeground(Color.WHITE);
        textNum7.setBackground(Color.LIGHT_GRAY);
        textNum7.setHorizontalAlignment(SwingConstants.CENTER);
        textNum7.setBounds(523, 153, 50, 50);
        textNum7.setText("0");
        contentPane.add(textNum7);
        textNum7.setColumns(10);
        textNum7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum7.setBackground(new Color(37, 54, 82));
        
        lblNewLabel_3 = new JLabel("X4");
        lblNewLabel_3.setForeground(new Color(31, 166, 140));
        lblNewLabel_3.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblNewLabel_3.setBounds(583, 156, 55, 36);
        contentPane.add(lblNewLabel_3);
        
        textNum8 = new JTextField();
        textNum8.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum8.setForeground(Color.WHITE);
        textNum8.setBackground(Color.LIGHT_GRAY);
        textNum8.setHorizontalAlignment(SwingConstants.CENTER);
        textNum8.setBounds(648, 153, 50, 50);
        textNum8.setText("0");
        contentPane.add(textNum8);
        textNum8.setColumns(10);
        textNum8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum8.setBackground(new Color(37, 54, 82));
        
        lblNewLabel_4 = new JLabel("X1");
        lblNewLabel_4.setForeground(new Color(31, 166, 140));
        lblNewLabel_4.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblNewLabel_4.setBounds(221, 217, 55, 36);
        contentPane.add(lblNewLabel_4);
        
        textNum9 = new JTextField();
        textNum9.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum9.setForeground(Color.WHITE);
        textNum9.setBackground(Color.LIGHT_GRAY);
        textNum9.setHorizontalAlignment(SwingConstants.CENTER);
        textNum9.setBounds(273, 214, 50, 50);
        textNum9.setText("0");
        contentPane.add(textNum9);
        textNum9.setColumns(10);
        textNum9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum9.setBackground(new Color(37, 54, 82));
        
        lbly_2 = new JLabel("X2");
        lbly_2.setForeground(new Color(31, 166, 140));
        lbly_2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lbly_2.setBounds(333, 217, 55, 36);
        contentPane.add(lbly_2);
        
        textNum10 = new JTextField();
        textNum10.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum10.setForeground(Color.WHITE);
        textNum10.setBackground(Color.LIGHT_GRAY);
        textNum10.setHorizontalAlignment(SwingConstants.CENTER);
        textNum10.setBounds(398, 214, 50, 50);
        textNum10.setText("0");
        contentPane.add(textNum10);
        textNum10.setColumns(10);
        textNum10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum10.setBackground(new Color(37, 54, 82));
        
        lblz_2 = new JLabel("X3");
        lblz_2.setForeground(new Color(31, 166, 140));
        lblz_2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblz_2.setBounds(458, 217, 55, 36);
        contentPane.add(lblz_2);
        
        textNum11 = new JTextField();
        textNum11.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum11.setForeground(Color.WHITE);
        textNum11.setBackground(Color.LIGHT_GRAY);
        textNum11.setHorizontalAlignment(SwingConstants.CENTER);
        textNum11.setBounds(523, 214, 50, 50);
        textNum11.setText("0");
        contentPane.add(textNum11);
        textNum11.setColumns(10);
        textNum11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum11.setBackground(new Color(37, 54, 82));
        
        lblNewLabel_5 = new JLabel("X4");
        lblNewLabel_5.setForeground(new Color(31, 166, 140));
        lblNewLabel_5.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblNewLabel_5.setBounds(583, 217, 55, 36);
        contentPane.add(lblNewLabel_5);
        
        textNum12 = new JTextField();
        textNum12.setFont(new Font("BankGothic Lt BT", Font.BOLD, 25));
        textNum12.setForeground(Color.WHITE);
        textNum12.setBackground(Color.LIGHT_GRAY);
        textNum12.setHorizontalAlignment(SwingConstants.CENTER);
        textNum12.setBounds(648, 214, 50, 50);
        textNum12.setText("0");
        contentPane.add(textNum12);
        textNum12.setColumns(10);
        textNum12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textNum12.setBackground(new Color(37, 54, 82));
        
        lblResultadoY = new JLabel("Resultado Y =");
        lblResultadoY.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultadoY.setForeground(new Color(31, 166, 140));
        lblResultadoY.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblResultadoY.setBounds(220, 330, 315, 30);
        contentPane.add(lblResultadoY);
        
        lblResultado2 = new JLabel("...");
        lblResultado2.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado2.setForeground(Color.WHITE);
        lblResultado2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 25));
        lblResultado2.setBounds(545, 330, 177, 36);
        contentPane.add(lblResultado2);
        
        lblTextoResultado_2 = new JLabel("Resultado Z =");
        lblTextoResultado_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblTextoResultado_2.setForeground(new Color(31, 166, 140));
        lblTextoResultado_2.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 38));
        lblTextoResultado_2.setBounds(220, 371, 315, 30);
        contentPane.add(lblTextoResultado_2);
        
        lblResultado3 = new JLabel("...");
        lblResultado3.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado3.setForeground(Color.WHITE);
        lblResultado3.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 25));
        lblResultado3.setBounds(545, 371, 177, 36);
        contentPane.add(lblResultado3);
        
        lblTextoError = new JLabel("");
        lblTextoError.setHorizontalAlignment(SwingConstants.CENTER);
        lblTextoError.setForeground(new Color(31, 166, 140));
        lblTextoError.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 20));
        lblTextoError.setBounds(220, 418, 502, 28);
        contentPane.add(lblTextoError);

    }
    
private double determinant3x3(double a, double b, double c, double d, double e, double f, double g, double h, double i) {
    return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
}
    
public void actionPerformed(ActionEvent e) {
    try {
        double num1 = Double.parseDouble(textNum1.getText());
        double num2 = Double.parseDouble(textNum2.getText());
        double num3 = Double.parseDouble(textNum3.getText());
        double num4 = Double.parseDouble(textNum4.getText());
        double num5 = Double.parseDouble(textNum5.getText());
        double num6 = Double.parseDouble(textNum6.getText());
        double num7 = Double.parseDouble(textNum7.getText());
        double num8 = Double.parseDouble(textNum8.getText());
        double num9 = Double.parseDouble(textNum9.getText());
        double num10 = Double.parseDouble(textNum10.getText());
        double num11 = Double.parseDouble(textNum11.getText());
        double num12 = Double.parseDouble(textNum12.getText());

        double resultadoX = 0;
        double resultadoY = 0;
        double resultadoZ = 0;

        if (e.getSource() == btnSist2) {
            resultadoX = ((num3 * num6 - num7 * num2) / (num1 * num6 - num5 * num2));
            resultadoY = ((num1 * num7 - num5 * num3) / (num1 * num6 - num5 * num2));
            lblResultado1.setText(String.valueOf(resultadoX));
            lblResultado2.setText(String.valueOf(resultadoY));
            lblResultado3.setText("...");
            lblTextoError.setText(""); 
            
        } else if (e.getSource() == btnSist3) {
            double D = determinant3x3(num1, num2, num3, num5, num6, num7, num9, num10, num11);
            double Dx = determinant3x3(num4, num2, num3, num8, num6, num7, num12, num10, num11);
            double Dy = determinant3x3(num1, num4, num3, num5, num8, num7, num9, num12, num11);
            double Dz = determinant3x3(num1, num2, num4, num5, num6, num8, num9, num10, num12);

            resultadoX = Dx / D;
            resultadoY = Dy / D;
            resultadoZ = Dz / D;

            lblResultado1.setText(String.valueOf(resultadoX));
            lblResultado2.setText(String.valueOf(resultadoY));
            lblResultado3.setText(String.valueOf(resultadoZ));
            lblTextoError.setText("");
        }
    } catch (NumberFormatException ex) {
        lblTextoError.setText("Error: Ingrese solo números válidos.");
    }
}

}