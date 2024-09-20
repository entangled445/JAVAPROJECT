package com.Bmanagement;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
public class Next extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Random random=new Random();
	String formno;
	JLabel cardNo,PIN;
	JTextField card_textfield,pin_textfield;
	String cd,pn;
	JButton signin_button;
	public Next() {
        formno = Signup.getFormNo(); 
		cd=""+Math.abs((random.nextLong() % 90000000L))+5040936000000000L;
		pn=""+Math.abs((random.nextLong() % 9000L))+1000L;
		setLayout(null);
		setSize(500,500);
		cardNo=new JLabel("CARD NO:");
		PIN=new JLabel("PIN NO:");
		card_textfield=new JTextField(cd);
		card_textfield.setEditable(false);
		pin_textfield=new JTextField(pn);
		pin_textfield.setEditable(false);
		cardNo.setFont(new Font("Raleway",Font.BOLD,25));		
		PIN.setFont(new Font("Raleway",Font.BOLD,25));
		signin_button=new JButton("Login-->");
		cardNo.setBounds(100,70,121,20);
		PIN.setBounds(100,160,100,25);
		card_textfield.setBounds(230,70,200,25);
		pin_textfield.setBounds(230,160,200,25);
		signin_button.setBounds(170,230,150,20);
		add(signin_button);
		add(cardNo);
		add(PIN);
		add(card_textfield);
		add(pin_textfield);
		setVisible(true);
		signin_button.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae1)
	{
		if(ae1.getSource()==signin_button)
		{
			try
			{
				Conn cc=new Conn();
				String query1= "Insert into next values('"+formno+"','"+cd+"','"+pn+"')";
				cc.st.executeUpdate(query1);
			}catch(Exception e2)
			{
				e2.printStackTrace();
			}
			
			setVisible(false);
			new Login().setVisible(true);
		}
	}
	
	 public static void main(String[] args) {
	       new Next();
	    }
}
