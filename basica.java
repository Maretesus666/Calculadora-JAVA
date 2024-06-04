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
import java.awt.SystemColor;

public class basica extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField textNum1;
    private JTextField textNum2;
    private JButton btnSuma; // Declarando btnSuma como atributo de la clase
    private JButton btnResta;
    private JButton btnMulti;
    private JButton btnDivi;
    private JLabel lblResultado; // Declarando lblResultado como atributo de la clase

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    basica frame = new basica();
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
    public basica() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(224, 255, 255)); // Cambiando el color de fondo
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnSuma = new JButton("SUMA");
        btnSuma.setBounds(10, 67, 131, 23);
        btnSuma.setBackground(new Color(76, 175, 80)); // Cambiando el color del botón
        btnSuma.setForeground(Color.WHITE); // Cambiando el color del texto del botón
        contentPane.add(btnSuma);
        btnSuma.addActionListener(this); // Agregando ActionListener al botón

        JButton btnResta = new JButton("RESTA");
        btnResta.setBounds(10, 101, 131, 23);
        btnResta.setBackground(new Color(33, 150, 243)); // Cambiando el color del botón
        btnResta.setForeground(Color.WHITE); // Cambiando el color del texto del botón
        contentPane.add(btnResta);

        JButton btnMulti = new JButton("MULTIPLICACION");
        btnMulti.setBounds(10, 135, 131, 23);
        btnMulti.setBackground(new Color(255, 152, 0)); // Cambiando el color del botón
        btnMulti.setForeground(Color.WHITE); // Cambiando el color del texto del botón
        contentPane.add(btnMulti);

        JButton btnDivi = new JButton("DIVISION");
        btnDivi.setBounds(10, 169, 131, 23);
        btnDivi.setBackground(new Color(255, 87, 34)); // Cambiando el color del botón
        btnDivi.setForeground(Color.WHITE); // Cambiando el color del texto del botón
        contentPane.add(btnDivi);

        textNum1 = new JTextField();
        textNum1.setHorizontalAlignment(SwingConstants.RIGHT);
        textNum1.setBounds(177, 96, 86, 20);
        contentPane.add(textNum1);
        textNum1.setColumns(10);

        textNum2 = new JTextField();
        textNum2.setHorizontalAlignment(SwingConstants.RIGHT);
        textNum2.setBounds(281, 96, 86, 20);
        contentPane.add(textNum2);
        textNum2.setColumns(10);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setBounds(151, 152, 139, 23);
        contentPane.add(lblResultado);

        // Inicializando lblResultado
        this.lblResultado = new JLabel("");
        this.lblResultado.setFont(new Font("Verdana", Font.PLAIN, 20));
        this.lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblResultado.setBounds(281, 152, 86, 23);
        contentPane.add(this.lblResultado);
        
        JLabel lblCalculadoraBasiac = new JLabel("CALCULADORA BASICA");
        lblCalculadoraBasiac.setHorizontalAlignment(SwingConstants.CENTER);
        lblCalculadoraBasiac.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblCalculadoraBasiac.setBounds(72, 22, 280, 27);
        contentPane.add(lblCalculadoraBasiac);
    }

    // Implementando actionPerformed para manejar las acciones de los botones
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSuma) { // Comprobando si el evento proviene del botón suma
            int num1 = Integer.parseInt(textNum1.getText());
            int num2 = Integer.parseInt(textNum2.getText());
            int suma = num1 + num2;
            lblResultado.setText(Integer.toString(suma)); // Actualizando el texto de lblResultado
        }
        if (e.getSource() == btnResta) { // Comprobando si el evento proviene del botón suma
            int num1 = Integer.parseInt(textNum1.getText());
            int num2 = Integer.parseInt(textNum2.getText());
            int resta = num1 + num2;
            lblResultado.setText(Integer.toString(resta)); // Actualizando el texto de lblResultado
        }
        if (e.getSource() == btnMulti) { // Comprobando si el evento proviene del botón suma
            int num1 = Integer.parseInt(textNum1.getText());
            int num2 = Integer.parseInt(textNum2.getText());
            int multi = num1 + num2;
            lblResultado.setText(Integer.toString(multi)); // Actualizando el texto de lblResultado
        }
        if (e.getSource() == btnDivi) { // Comprobando si el evento proviene del botón suma
            int num1 = Integer.parseInt(textNum1.getText());
            int num2 = Integer.parseInt(textNum2.getText());
            int divi = num1 / num2;
            lblResultado.setText(Integer.toString(divi)); // Actualizando el texto de lblResultado
        }
    }
}
