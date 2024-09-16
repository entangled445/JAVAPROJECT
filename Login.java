package com.Bmanagement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	JTextField t1;
	JButton b1,b2,b3;
	JPasswordField t2;
	private static final long serialVersionUID = 1L;

	Login()
	{
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
		Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel label=new JLabel(i3);
		getContentPane().setBackground(Color.white);
		JLabel l1=new JLabel("WELCOME TO ATM");
		JLabel l2=new JLabel("Card No:");
		t1=new JTextField(20);
		JLabel l3=new JLabel("PIN:");
		t2=new JPasswordField();
		b1=new JButton("SIGN IN");
		b2=new JButton("CLEAR");
		b3=new JButton("SIGN UP");
		add(label);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		add(b2);
		add(b3);
		add(t1);
		add(t2);
		label.setBounds(70,40,100,100);
		l1.setBounds(200,40,500,100);
		l1.setFont(new Font("Raleway",Font.BOLD,28));
		l2.setBounds(100,160,100,20);
		l2.setFont(new Font("Raleway",Font.BOLD,18));
		t1.setBounds(200,160,200,20);
		t1.setFont(new Font("Raleway",Font.BOLD,14));
		l3.setBounds(100,200,90,20);
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		t2.setBounds(200,200,200,20);
		b1.setBounds(200,240,80,20);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		b2.setBounds(320,240,80,20);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		b3.setBounds(200,280,200,20);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.addActionListener(this);
		setSize(800,480);
		setLocation(350,200);
		setVisible(true);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			
		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
		else if(e.getSource()==b3)
		{
			
		}
	}
	public static void main(String[] args)
	{
		new Login();
	}
	
}
