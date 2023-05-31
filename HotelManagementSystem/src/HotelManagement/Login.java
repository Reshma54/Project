package HotelManagement;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

import javax.swing.*;

public class Login  extends JFrame implements ActionListener{
	
	JTextField username;
	JPasswordField password;
	JButton login,cancle;
	
	
	Login() {
		
		getContentPane() .setBackground(Color.WHITE);
		
		setLayout(null);
		JLabel user = new JLabel("User Name");
		user.setBounds(40, 20, 100, 30);
		add(user);
	
	
		 username= new JTextField();
		username.setBounds(150, 20, 150, 30);
		add(username);

		
		JLabel pass = new JLabel("Password");
		pass.setBounds(40, 70, 100, 20);
		add(pass);

		
		 password= new JPasswordField();
		password.setBounds(150, 70, 150, 30);
		add(password);
		
		 login = new JButton("Login");
		login.setBounds(40, 150, 120,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		

		 cancle = new JButton("Cancle");
		cancle.setBounds(180, 150, 120,30);
		cancle.setBackground(Color.BLACK);
		cancle.setForeground(Color.WHITE);
		cancle.addActionListener(this);
		add(cancle);
		
		ImageIcon i1=new ImageIcon("G:\\ITPJAVAPro\\HotelManagementSystem\\src\\icons/second.jpg");
		Image i2 = i1.getImage().getScaledInstance(200, 200,  Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		
		image.setBounds(350, 10, 200, 200);
		add(image);
		
		setBounds(500, 200, 600 , 300);
		setVisible(true);
		
		login.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == login ) {
					String user = username.getText();
					String pass = password.getText();
					
					try {
						Conn c=  new Conn();
						
						String query = "select * from login where username = '" + user + "' and password = '" + pass + "'";
						
						ResultSet rs = c.st.executeQuery(query);
						
						
						if(rs.next()) {
							new Dashboard();
							
							
							
						}else {
							
							JOptionPane.showMessageDialog(null, "Invalid username pr password");
							setVisible(false);
						}
						
						
					}catch(Exception ae)
					{
						ae.printStackTrace();
					}
				} else if(e.getSource()==cancle) {
					setVisible(false);
				}
				
			}
		});
		
			
			
			
		}
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Login(); 
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
