package HotelManagement;

import java.awt.Color;

import java.awt.Font;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public  class HotelManagementSystem  extends JFrame implements ActionListener{
	
	HotelManagementSystem(){
		
		//setTitle("Hotel Management System");
		//setSize(1366,565);
		//setLocation(100,100);
		setBounds(8, 100,1340,665);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon("G:\\ITPJAVAPro\\HotelManagementSystem\\src\\icons/first.jpg");
		JLabel image=new JLabel(i1);
		image.setBounds(10,0,1366,565);  	//locattion X,location Y , length,breath
		add(image);
		
		JLabel text=new JLabel("Hotel MANAGEMENT SYSTEM");
		text.setBounds(20, 430, 1000, 90);
		text.setBackground(Color.WHITE);
		text.setFont(new Font("serif" , Font.PLAIN,50));
		image.add(text);
		
		JButton next = new JButton("Next");
		next.setBounds(1150 ,450 , 150, 50);
		next.setBackground(Color.WHITE);
		next.setForeground(Color.MAGENTA);
		
		next.addActionListener(this);
		
		next.setFont(new Font("serif" , Font.PLAIN,25));

		image.add(next);
		
		setVisible(true);
		
		while(true) {
			
			text.setVisible(false);
			
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				
				e.printStackTrace();
			}
			text.setVisible(true);
			
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				
				e.printStackTrace();
			}

		}
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new HotelManagementSystem();
		
	}

}
