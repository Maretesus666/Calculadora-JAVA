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

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("BASICA");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                basica basica = new basica();
                basica.setVisible(true);
			}
		});
		btnNewButton.setBounds(45, 75, 119, 39);
		contentPane.add(btnNewButton);
		
		JButton btnSistEcuaciones = new JButton("SIST. ECUACIONES");
		btnSistEcuaciones.setForeground(Color.BLACK);
		btnSistEcuaciones.setBackground(SystemColor.activeCaption);
		btnSistEcuaciones.setBounds(45, 169, 119, 39);
		contentPane.add(btnSistEcuaciones);
		
		JButton btnVectores = new JButton("VECTORES");
		btnVectores.setForeground(Color.BLACK);
		btnVectores.setBackground(SystemColor.activeCaption);
		btnVectores.setBounds(246, 75, 119, 39);
		contentPane.add(btnVectores);
		
		JButton btnMatrices = new JButton("MATRICES");
		btnMatrices.setForeground(Color.BLACK);
		btnMatrices.setBackground(SystemColor.activeCaption);
		btnMatrices.setBounds(246, 169, 119, 39);
		contentPane.add(btnMatrices);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(90, 21, 241, 38);
		contentPane.add(lblNewLabel);
	}
}
