package com.Bmanagement;
import java.awt.Color;
import java.sql.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	JTextField card_textfield;
	JButton signin_button,clear_button,signup_button;
	JPasswordField pin_textfield;
	String formno;
	Conn c=new Conn();
	private static final long serialVersionUID = 1L;
	Login()
	{
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
		Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel label=new JLabel(i3);
		getContentPane().setBackground(Color.white);
		JLabel header=new JLabel("WELCOME TO ATM");
		JLabel card_labelfield=new JLabel("Card No:");
		card_textfield=new JTextField();
		JLabel pin_labelfield=new JLabel("PIN:");
		pin_textfield=new JPasswordField();
		signin_button=new JButton("SIGN IN");
		clear_button=new JButton("CLEAR");
		signup_button=new JButton("SIGN UP");
		add(label);
		add(header);
		add(card_labelfield);
		add(pin_labelfield);
		add(signin_button);
		add(clear_button);
		add(signup_button);
		add(card_textfield);
		add(pin_textfield);
		label.setBounds(70,40,100,100);
		header.setBounds(200,40,500,100);
		header.setFont(new Font("Raleway",Font.BOLD,28));
		card_labelfield.setBounds(100,160,100,20);
		card_labelfield.setFont(new Font("Raleway",Font.BOLD,18));
		card_textfield.setBounds(200,160,200,20);
		card_textfield.setFont(new Font("Raleway",Font.BOLD,14));
		pin_labelfield.setBounds(100,200,90,20);
		pin_labelfield.setFont(new Font("Raleway",Font.BOLD,18));
		pin_textfield.setBounds(200,200,200,20);
		signin_button.setBounds(200,240,80,20);
		signin_button.setBackground(Color.BLACK);
		signin_button.setForeground(Color.WHITE);
		signin_button.addActionListener(this);
		clear_button.setBounds(320,240,80,20);
		clear_button.setBackground(Color.BLACK);
		clear_button.setForeground(Color.WHITE);
		clear_button.addActionListener(this);
		signup_button.setBounds(200,280,200,20);
		signup_button.setBackground(Color.BLACK);
		signup_button.setForeground(Color.WHITE);
		signup_button.addActionListener(this);
		setSize(800,480);
		setLocation(350,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==signin_button)
		{
			String Cardno=card_textfield.getText();
			char[] PIN=pin_textfield.getPassword();
			String str = String.valueOf(PIN);
			String query = "SELECT * FROM next WHERE cd = ? AND pn = ?";
			try {
				   PreparedStatement ps = c.prepareStatement(query);
		            ps.setString(1, Cardno);
		            ps.setString(2, str);  
		            ResultSet rs = ps.executeQuery();
		            if (rs.next()) {
		                JOptionPane.showMessageDialog(null, "Login successful!");
		            } else {
		                JOptionPane.showMessageDialog(null, "Invalid card number or PIN.");
		            }
		            ps.close();
		            rs.close();
		        } catch (SQLException e1) {
		            e1.printStackTrace();
		        }
		}
		else if(e.getSource()==clear_button)
		{
			card_textfield.setText("");
			pin_textfield.setText("");
		}
		else if(e.getSource()==signup_button)
		{
			setVisible(false);
			new Signup().setVisible(true);
		}
	}
	public static void main(String[] args)
	{
		new Login();
	}
	
}
