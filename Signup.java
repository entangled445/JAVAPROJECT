package com.Bmanagement;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.*;
public class Signup extends JFrame
{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		Signup()
		{
			setLayout(null);
			getContentPane().setBackground(Color.WHITE);
			setSize(850,800);
			setLocation(350,10);
			setVisible(true);
			Random rand = new Random();
	        int randomNumber = rand.nextInt(9000) + 1000;
	        System.out.println(randomNumber);
	        JLabel l1=new JLabel("APPLICATION FORM NO."+randomNumber);
	        JLabel l2=new JLabel("Page 1: Personal Details");
	        JLabel l3=new JLabel("Name:");
	        JLabel l4=new JLabel("Father's Name:");
	        JLabel l5=new JLabel("Date of Birth:");
	        JLabel l6=new JLabel("Gender:");
	        JLabel l7=new JLabel("Email Address:");
	        JLabel l8=new JLabel("Marital Status:");
	        JLabel l9=new JLabel("Address");
	        JLabel l10=new JLabel("City");
	        JLabel l11=new JLabel("Pin Code:");
	        JLabel l12=new JLabel("State:");
	        JTextField t1=new JTextField();
	        JTextField t2=new JTextField();
	        JDateChooser dc=new JDateChooser();
	        JTextField t4=new JTextField();
	        JTextField t5=new JTextField();
	        JTextField t6=new JTextField();
	        JTextField t7=new JTextField();
	        JTextField t8=new JTextField();
	        JRadioButton r1=new JRadioButton("Male");
	        JRadioButton r2=new JRadioButton("Female");
	        JRadioButton r3=new JRadioButton("Married");
	        JRadioButton r4=new JRadioButton("Unmarried");
	        JRadioButton r5=new JRadioButton("Other");
	        ButtonGroup grp1=new ButtonGroup();
	        grp1.add(r1);
	        grp1.add(r2);
	        ButtonGroup grp2=new ButtonGroup();
	        grp2.add(r3);
	        grp2.add(r4);
	        grp2.add(r5);
	        r1.setBackground(Color.WHITE);
	        r2.setBackground(Color.WHITE);
	        r3.setBackground(Color.WHITE);
	        r4.setBackground(Color.WHITE);
	        r5.setBackground(Color.WHITE);
	        JButton b1=new JButton("Next");
			add(l1);
			l1.setFont(new Font("Raleway",Font.BOLD,28));
			add(l2);
			l2.setFont(new Font("Raleway",Font.BOLD,18));
			add(l3);
			l3.setFont(new Font("Raleway",Font.BOLD,14));
			add(l4);
			l4.setFont(new Font("Raleway",Font.BOLD,14));
			add(l5);
			l5.setFont(new Font("Raleway",Font.BOLD,14));
			add(l6);
			l6.setFont(new Font("Raleway",Font.BOLD,14));
			add(l7);
			l7.setFont(new Font("Raleway",Font.BOLD,14));
			add(l8);
			l8.setFont(new Font("Raleway",Font.BOLD,14));
			add(l9);
			l9.setFont(new Font("Raleway",Font.BOLD,14));
			add(l10);
			l10.setFont(new Font("Raleway",Font.BOLD,14));
			add(l11);
			l11.setFont(new Font("Raleway",Font.BOLD,14));
			add(l12);
			l12.setFont(new Font("Raleway",Font.BOLD,14));
			add(t1);
			add(t2);
			add(dc);
			add(t4);
			add(t5);
			add(t6);
			add(t7);
			add(t8);
			add(r1);
			add(r2);
			add(r3);
			add(r4);
			add(r5);
			add(b1);
			b1.setFont(new Font("Raleway",Font.BOLD,10));
			l1.setBounds(200,30,500,100);
			l2.setBounds(230,80,300,100);
			l3.setBounds(180,190,100,20);
			l4.setBounds(180,220,200,20);
			l5.setBounds(180,250,200,20);
			l6.setBounds(180,280,100,20);
			l7.setBounds(180,310,200,20);
			l8.setBounds(180,340,200,20);
			l9.setBounds(180,370,100,20);
			l10.setBounds(180,400,100,20);
			l11.setBounds(180,430,100,20);
			l12.setBounds(180,460,100,20);
			t1.setBounds(300,190,213,20);
			t2.setBounds(300,220,213,20);
			dc.setBounds(300,250,210,20);
			t4.setBounds(300,310,213,20);
			t5.setBounds(300,370,213,20);
			t6.setBounds(300,400,213,20);
			t7.setBounds(300,430,213,20);
			t8.setBounds(300,460,213,20);
			r1.setBounds(300,280,100,20);
			r2.setBounds(400,280,112,20);
			r3.setBounds(300,340,69,20);
			r4.setBounds(370,340,84,20);
			r5.setBounds(455,340,58,20);
			b1.setBounds(450,500,62,20);
		}
public static void main(String args[])
	{
		new Signup();
	}
}
