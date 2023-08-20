import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import java.awt.*;

public class LogInPage extends JFrame implements ActionListener   {
	
	JLabel userLabel; 
	JTextField userText;
	JLabel passwordLabel ;
	JPasswordField passwordText;
	JButton loginButton ;
	JButton forgetPassButton;
	JButton usericon;
	
	JPanel panel = new JPanel(); 
	
		
		
		
	 LogInPage (){
	
		
        
      usericon = new JButton();
      ImageIcon icon = new ImageIcon("user.png"); 
      usericon.setBounds(175,40,150,150);
      usericon.setFocusable(false);
      usericon.setIcon(icon);
      usericon.setOpaque(false);
      usericon.setContentAreaFilled(false);
      usericon.setBorderPainted(false);
          
		   
	  userLabel = new JLabel("Username / E-mail / Phone Number");
      userLabel.setBounds(145,220,210,25);
      userLabel.setFont(new Font("Century Gothic", Font.PLAIN,12));
      

      
      userText = new JTextField(20);
      userText.setBounds(160,250,180,25);
      userText.setFont(new Font("Century Gothic", Font.PLAIN,12));
      
  
      passwordLabel = new JLabel("Password");
      passwordLabel.setBounds(220,290,60,25);
      passwordLabel.setFont(new Font("Century Gothic", Font.PLAIN,12));
     

      passwordText = new JPasswordField(20);
      passwordText.setBounds(160,320,180,25);
      passwordText.setFont(new Font("Century Gothic", Font.PLAIN,12));
      

       // Creating login button
      loginButton = new JButton("Log In");
      loginButton.setFont(new Font("Century Gothic", Font.PLAIN,12));
      loginButton.setBounds(210, 600, 80, 25);
      loginButton.setFocusable(false);
      loginButton.setOpaque(false);
      loginButton.setContentAreaFilled(true);
      loginButton.setBorderPainted(true);  
      loginButton.addActionListener(this);
      
      forgetPassButton = new JButton("Forget password?");
      forgetPassButton.setFont(new Font("Century Gothic", Font.PLAIN,12));
      forgetPassButton.setBounds(220, 350, 140, 25);
      forgetPassButton.setFocusable(false);
      forgetPassButton.setOpaque(false);
      forgetPassButton.setContentAreaFilled(false);
      forgetPassButton.setBorderPainted(false);
      forgetPassButton.addActionListener(this);
      
      panel.add(userLabel);
      panel.add(userText);
      panel.add(passwordLabel);
      panel.add(passwordText);
      panel.add(forgetPassButton);
      panel.add(loginButton);
      panel.add(usericon);
      panel.setLayout(null);
      panel.setBackground(new Color(240,248,255));
      
     this.setTitle("Our Melody");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(false);
     this.setSize(500,700);
     this.setLocationRelativeTo(null);
     this.setVisible(true);
		
		
     this.setIconImage(icon.getImage());
     this.getContentPane().setBackground(new Color(240,248,255));
     this.add(panel);
     
	 }
	
        	  
    
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== loginButton) {
			this.dispose();
			new HomePage();
		}	
		
		else if(e.getSource()==forgetPassButton) {
			new ForgotPassword();
			this.dispose();
		}
		
	}
	}


	