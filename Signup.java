package com.Bmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import com.toedter.calendar.*;
public class Signup extends JFrame implements ActionListener
{
	int randomNumber;
	JTextField name_text,fname_text,address_text,email_text,city_text,pin_text,state_text;
	JRadioButton male_button,female_button,married_button,unmarried_button,other_button;
	JButton submit_button;
	static String formno;
	JDateChooser dc;
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
	        formno = "" + randomNumber;
	        JLabel header1=new JLabel("APPLICATION FORM NO."+randomNumber);
	        JLabel header2=new JLabel("Page 1: Personal Details");
	        JLabel name_labelfield=new JLabel("Name:");
	        JLabel fname_label=new JLabel("Father's Name:");
	        JLabel dob_label=new JLabel("Date of Birth:");
	        JLabel gender_label=new JLabel("Gender:");
	        JLabel email_label=new JLabel("Email Address:");
	        JLabel status_label=new JLabel("Marital Status:");
	        JLabel address_label=new JLabel("Address");
	        JLabel city_label=new JLabel("City");
	        JLabel pin_label=new JLabel("Pin Code:");
	        JLabel state_label=new JLabel("State:");
	        name_text=new JTextField();
	        fname_text=new JTextField();
	        dc=new JDateChooser();
	        email_text=new JTextField();
	        address_text=new JTextField();
	        city_text=new JTextField();
	        pin_text=new JTextField();
	        state_text=new JTextField();
	        male_button=new JRadioButton("Male");
	        female_button=new JRadioButton("Female");
	        married_button=new JRadioButton("Married");
	        unmarried_button=new JRadioButton("Unmarried");
	        other_button=new JRadioButton("Other");
	        ButtonGroup grp1=new ButtonGroup();
	        grp1.add(male_button);
	        grp1.add(female_button);
	        ButtonGroup grp2=new ButtonGroup();
	        grp2.add(married_button);
	        grp2.add(unmarried_button);
	        grp2.add(other_button);
	        male_button.setBackground(Color.WHITE);
	        female_button.setBackground(Color.WHITE);
	        married_button.setBackground(Color.WHITE);
	        unmarried_button.setBackground(Color.WHITE);
	        other_button.setBackground(Color.WHITE);
	        submit_button=new JButton("Submit");
			add(header1);
			header1.setFont(new Font("Raleway",Font.BOLD,28));
			add(header2);
			header2.setFont(new Font("Raleway",Font.BOLD,18));
			add(name_labelfield);
			name_labelfield.setFont(new Font("Raleway",Font.BOLD,14));
			add(fname_label);
			fname_label.setFont(new Font("Raleway",Font.BOLD,14));
			add(dob_label);
			dob_label.setFont(new Font("Raleway",Font.BOLD,14));
			add(gender_label);
			gender_label.setFont(new Font("Raleway",Font.BOLD,14));
			add(email_label);
			email_label.setFont(new Font("Raleway",Font.BOLD,14));
			add(status_label);
			status_label.setFont(new Font("Raleway",Font.BOLD,14));
			add(address_label);
			address_label.setFont(new Font("Raleway",Font.BOLD,14));
			add(city_label);
			city_label.setFont(new Font("Raleway",Font.BOLD,14));
			add(pin_label);
			pin_label.setFont(new Font("Raleway",Font.BOLD,14));
			add(state_label);
			state_label.setFont(new Font("Raleway",Font.BOLD,14));
			add(name_text);
			add(fname_text);
			add(dc);
			add(email_text);
			add(address_text);
			add(city_text);
			add(pin_text);
			add(state_text);
			add(male_button);
			add(female_button);
			add(married_button);
			add(unmarried_button);
			add(other_button);
			add(submit_button);
			submit_button.setFont(new Font("Raleway",Font.BOLD,10));
			header1.setBounds(200,30,500,100);
			header2.setBounds(230,80,300,100);
			name_labelfield.setBounds(180,190,100,20);
			fname_label.setBounds(180,220,200,20);
			dob_label.setBounds(180,250,200,20);
			gender_label.setBounds(180,280,100,20);
			email_label.setBounds(180,310,200,20);
			status_label.setBounds(180,340,200,20);
			address_label.setBounds(180,370,100,20);
			city_label.setBounds(180,400,100,20);
			pin_label.setBounds(180,430,100,20);
			state_label.setBounds(180,460,100,20);
			name_text.setBounds(300,190,213,20);
			fname_text.setBounds(300,220,213,20);
			dc.setBounds(300,250,210,20);
			email_text.setBounds(300,310,213,20);
			address_text.setBounds(300,370,213,20);
			city_text.setBounds(300,400,213,20);
			pin_text.setBounds(300,430,213,20);
			state_text.setBounds(300,460,213,20);
			male_button.setBounds(300,280,100,20);
			female_button.setBounds(400,280,112,20);
			married_button.setBounds(300,340,69,20);
			unmarried_button.setBounds(370,340,84,20);
			other_button.setBounds(455,340,58,20);
			submit_button.setBounds(450,500,70,20);
			submit_button.addActionListener(this);
			
		}
		public static String getFormNo()
		{
			return formno;
		}
		public void actionPerformed(ActionEvent ae)
		{
			String name=name_text.getText();
			String fname=fname_text.getText();
			String dob=((JTextField) dc.getDateEditor().getUiComponent()).getText();
			String gender=null;
			String email=email_text.getText();			
			String marital=null;
			String address=address_text.getText();
			String city=city_text.getText();
			String state=state_text.getText();
			String pin=pin_text.getText();
			if(married_button.isSelected())
			{
				marital="Married";
			}
			else if(unmarried_button.isSelected())
			{
				marital="Unmarried";
				
			}
			else if(other_button.isSelected())
			{
				marital="Others";
			}
			if(male_button.isSelected())
			{
				gender="Male";
			}
			else if(female_button.isSelected())
			{
				gender="Female";
			}
			try 
			{
				if (name.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Name is Required");
				}
				else
				{
					Conn c=new Conn();
					String query= "Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
					c.st.executeUpdate(query);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			this.setVisible(false);
			new Next().setVisible(true);
			
		}
public static void main(String args[])
	{
		new Signup();
	}
}
