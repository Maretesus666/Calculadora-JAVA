package calcu;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
//bordes
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;
//invertir
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		new MenuPrincipal();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	class RoundedBorder implements Border {

	    private int radius;

	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }

	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }

	    public boolean isBorderOpaque() {
	        return true;
	    }

	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
	
	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 387);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(37, 54, 82));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(37,54,82));
		panel.setBounds(0, 0, 534, 65);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("CALCULADORA");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(31, 166, 140));
		lblNewLabel.setBackground(new Color(37,54,82));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 27));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(12, 73, 88));
		panel_1.setBounds(0, 65, 534, 283);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnMatrices = new JButton("MATRICES");
		btnMatrices.setBounds(330, 167, 148, 74);
		panel_1.add(btnMatrices);
		btnMatrices.setFont(new Font("BankGothic Lt BT", Font.BOLD, 16));
		btnMatrices.setFocusable(false); // remueve los bordes de seleccion
		btnMatrices.setBorder(new RoundedBorder(25)); //agrega redondeo a los botones
		btnMatrices.setForeground(new Color(31, 166, 140));
		btnMatrices.setBackground(new Color(37,54,82));
		// enviar a la pestaña de calculadora de matrices
		btnMatrices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        Matrices mat = new Matrices();
        mat.setVisible(true);
			}
		});
		
		    
		
				
				JButton btnSistEcuaciones = new JButton("SIST. ECUACIONES");
				btnSistEcuaciones.setBounds(37, 167, 148, 74);
				panel_1.add(btnSistEcuaciones);
				btnSistEcuaciones.setFont(new Font("BankGothic Lt BT", Font.BOLD, 16));
				btnSistEcuaciones.setFocusable(false); // remueve los bordes de seleccion
				btnSistEcuaciones.setBorder(new RoundedBorder(25)); //agrega redondeo a los botones
				btnSistEcuaciones.setForeground(new Color(31, 166, 140));
				btnSistEcuaciones.setBackground(new Color(37,54,82));
				// enviar a la pestaña de calculadora de sistemas de ecuaciones
				btnSistEcuaciones.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
		        SistEcuaciones sist = new SistEcuaciones();
		        sist.setVisible(true);
					}
				});
				
				JButton btnBasica = new JButton("BASICA");
				btnBasica.setBounds(37, 22, 148, 74);
				panel_1.add(btnBasica);
				btnBasica.setFont(new Font("BankGothic Lt BT", Font.BOLD, 16));
				btnBasica.setFocusable(false); // remueve los bordes de seleccion
				btnBasica.setBorder(new RoundedBorder(25)); //agrega redondeo a los botones
				btnBasica.setBackground(new Color(37,54,82));	
				btnBasica.setForeground(new Color(31, 166, 140));
				
				JButton btnVectores = new JButton("VECTORES");
				btnVectores.setBounds(330, 22, 148, 74);
				panel_1.add(btnVectores);
				btnVectores.setFont(new Font("BankGothic Lt BT", Font.BOLD, 16));
				btnVectores.setFocusable(false); // remueve los bordes de seleccion
				btnVectores.setBorder(new RoundedBorder(25)); //agrega redondeo a los botones
				btnVectores.setForeground(new Color(31, 166, 140));
				btnVectores.setBackground(new Color(37,54,82));
				// enviar a la pestaña de calculadora de vectores
				btnVectores.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
                Vectores vec = new Vectores();
                vec.setVisible(true);
					}
				});
				
				//efecto hover
				btnVectores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	btnVectores.setBackground(new Color(31, 166, 140));
            	btnVectores.setForeground(new Color(37,54,82));
            }
            @Override
            public void mouseExited(MouseEvent e) {
            	btnVectores.setBackground(new Color(37,54,82));  // color original
            	btnVectores.setForeground(new Color(31, 166, 140));
            }
        });
				// enviar a la pestaña de calculadora basica
				btnBasica.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
                Basica basica = new Basica();
                basica.setVisible(true);
					}
				});
				
				//efecto hover
				btnBasica.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	btnBasica.setBackground(new Color(31, 166, 140));
            	btnBasica.setForeground(new Color(37,54,82));
            }
            @Override
            public void mouseExited(MouseEvent e) {
            	btnBasica.setBackground(new Color(37,54,82));  // color original
            	btnBasica.setForeground(new Color(31, 166, 140));
            }
        });
				
				//efecto hover
				btnSistEcuaciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	btnSistEcuaciones.setBackground(new Color(31, 166, 140));
            	btnSistEcuaciones.setForeground(new Color(37,54,82));
            }
            @Override
            public void mouseExited(MouseEvent e) {
            	btnSistEcuaciones.setBackground(new Color(37,54,82));  // color original
            	btnSistEcuaciones.setForeground(new Color(31, 166, 140));
            }
        });
		
		//efecto hover
		btnMatrices.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	btnMatrices.setBackground(new Color(31, 166, 140));
            	btnMatrices.setForeground(new Color(37,54,82));
            }
            @Override
            public void mouseExited(MouseEvent e) {
            	btnMatrices.setBackground(new Color(37,54,82));  // color original
            	btnMatrices.setForeground(new Color(31, 166, 140));
            }
        });
	}
}
