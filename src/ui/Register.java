package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import java.util.Date;
import java.util.Calendar;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
			JFrame frame = new JFrame("Login");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 500);
	        frame.getContentPane().setLayout(null);

	        frame.getContentPane().setBackground(new Color(0x2196F3)); // Blue background

	        JPanel panel = new JPanel();
	        panel.setBounds(50, 81, 300, 300);
	        panel.setBackground(Color.WHITE);
	        panel.setLayout(null);
	        frame.getContentPane().add(panel);

	        JLabel titleLabel = new JLabel("Register");
	        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
	        titleLabel.setForeground(new Color(0x0057D9));
	        titleLabel.setBounds(94, 21, 102, 30);
	        panel.add(titleLabel);

	        JTextField usernameField = new JTextField();
	        usernameField.setToolTipText("");
	        usernameField.setBounds(50, 113, 200, 30);
	        usernameField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
	        String placeholder = " Enter your username";
	        usernameField.setText(placeholder);
	        usernameField.setForeground(java.awt.Color.GRAY);
	        usernameField.addFocusListener(new FocusListener() {

				@Override
				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					if (usernameField.getText().equals(placeholder)) {
	                    usernameField.setText("");
	                    usernameField.setForeground(java.awt.Color.BLACK);
	                }
				}

				@Override
				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					if (usernameField.getText().isEmpty()) {
	                    usernameField.setText(placeholder);
	                    usernameField.setForeground(java.awt.Color.GRAY);
	                }
				}
	        });
	        panel.add(usernameField);
	        
	        JTextField emailField = new JTextField();
	        emailField.setToolTipText("");
	        emailField.setBounds(50, 73, 200, 30);
	        emailField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
	        String placeholder3 = " Enter your Email";
	        emailField.setText(placeholder3);
	        emailField.setForeground(java.awt.Color.GRAY);
	        emailField.addFocusListener(new FocusListener() {

				@SuppressWarnings("deprecation")
				@Override
				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					if (emailField.getText().equals(placeholder3)) {
						emailField.setText("");
						emailField.setForeground(java.awt.Color.BLACK);
	                }
				}

				@SuppressWarnings("deprecation")
				@Override
				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					if (emailField.getText().isEmpty()) {
						emailField.setText(placeholder3);
						emailField.setForeground(java.awt.Color.GRAY);
	                }
				}

	        });
	        panel.add(emailField);

	        JPasswordField passwordField = new JPasswordField();
	        passwordField.setBounds(50, 157, 200, 30);
	        passwordField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
	        String placeholder2 = " Enter ";
	        passwordField.setText(placeholder2);
	        passwordField.setForeground(java.awt.Color.GRAY);
	        passwordField.addFocusListener(new FocusListener() {

				@SuppressWarnings("deprecation")
				@Override
				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					if (passwordField.getText().equals(placeholder2)) {
						passwordField.setText("");
						passwordField.setForeground(java.awt.Color.BLACK);
	                }
				}

				@SuppressWarnings("deprecation")
				@Override
				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					if (passwordField.getText().isEmpty()) {
						passwordField.setText(placeholder2);
	                    passwordField.setForeground(java.awt.Color.GRAY);
	                }
				}

	        });
	        panel.add(passwordField);
	        
	        JButton btnRegister = new JButton("Confirm");
	        btnRegister.setForeground(new Color(51, 0, 255));
	        btnRegister.setFocusPainted(false);
	        btnRegister.setBackground(Color.WHITE);
	        btnRegister.setBounds(79, 203, 123, 30);
	        btnRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				frame.setVisible(false);
				new Login();
			}
				
			});
	        panel.add(btnRegister);
	        
	        
	        
	        
	        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
