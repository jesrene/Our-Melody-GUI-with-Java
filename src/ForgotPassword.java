import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ForgotPassword extends JFrame implements ActionListener{
	
	JButton backToLogInButton = new JButton();
	JButton confirmEmail = new JButton();
	JButton confirmCode = new JButton();
	
	JTextField phoneNumberOrEmail = new JTextField();
	JTextField verificationCode = new JTextField();
	
	JLabel titleLabel = new JLabel();
	JLabel explainationLabel = new JLabel();
	JLabel secondExplainationLabel = new JLabel();

	JPanel panel = new JPanel();
	
	int min;
	int max;
	int code;
	 
	ForgotPassword (){
		
		min = 1000;
		max = 9000;
		code = (int) (Math.random()*(max-min+1)+min);
		
		titleLabel.setBounds(10, 10, 200, 40);
		titleLabel.setText("Forgot Password:");
		titleLabel.setFont(new Font("Century Gothic", Font.PLAIN,15));
		
		explainationLabel.setBounds(85, 80, 400, 25);
		explainationLabel.setText("Please enter your last used phone number/email,");
		explainationLabel.setFont(new Font("Century Gothic", Font.PLAIN,12));
		
		secondExplainationLabel.setBounds(103, 100, 400, 25);
		secondExplainationLabel.setText("and a verification code will be sent to you");
		secondExplainationLabel.setFont(new Font("Century Gothic", Font.PLAIN,12));
		
		phoneNumberOrEmail.setCaretColor(Color.DARK_GRAY);
		phoneNumberOrEmail.setPreferredSize(new Dimension(100,20));
		phoneNumberOrEmail.setBounds(100, 150, 220, 20);
		phoneNumberOrEmail.setText("Phone Number/E-mail");
		phoneNumberOrEmail.setFont(new Font("Century Gothic", Font.PLAIN,12));
		phoneNumberOrEmail.setForeground(Color.gray);
		
		confirmEmail.setBounds(330,150,90,18);
		confirmEmail.addActionListener(this);
		confirmEmail.setFocusable(false);
		confirmEmail.setText("Confirm");
		confirmEmail.setFont(new Font("Century Gothic", Font.PLAIN,12));
		confirmEmail.setOpaque(true);
		confirmEmail.setContentAreaFilled(true);
		confirmEmail.setBorderPainted(false);
		
		verificationCode.setCaretColor(Color.DARK_GRAY);
		verificationCode.setPreferredSize(new Dimension(100,20));
		verificationCode.setBounds(100, 200, 220, 20);
		verificationCode.setText("Verification Code");
		verificationCode.setFont(new Font("Century Gothic", Font.PLAIN,12));
		verificationCode.setForeground(Color.gray);
		verificationCode.setEditable(false);
		
		confirmCode.setBounds(330,200,90,18);
		confirmCode.addActionListener(this);
		confirmCode.setFocusable(false);
		confirmCode.setText("Confirm");
		confirmCode.setFont(new Font("Century Gothic", Font.PLAIN,12));
		confirmCode.setOpaque(true);
		confirmCode.setContentAreaFilled(true);
		confirmCode.setBorderPainted(false);
		confirmCode.setEnabled(false);
		
		backToLogInButton.setBounds(110,500,250,50);
		backToLogInButton.addActionListener(this);
		backToLogInButton.setFocusable(false);
		backToLogInButton.setText("Back To Log In Page");
		backToLogInButton.setFont(new Font("Century Gothic", Font.PLAIN,20));
		backToLogInButton.setOpaque(true);
		backToLogInButton.setContentAreaFilled(true);
		backToLogInButton.setBorderPainted(false);
		
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 465, 645);
		panel.setVisible(true);
		panel.setLayout(null);
		panel.add(titleLabel);
		panel.add(explainationLabel);
		panel.add(secondExplainationLabel);
		panel.add(phoneNumberOrEmail);
		panel.add(confirmEmail);
		panel.add(verificationCode);
		panel.add(confirmCode);
		panel.add(backToLogInButton);
		
		this.setTitle("Our Melody");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500,700);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		ImageIcon icon = new ImageIcon("logo.png");
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(new Color(240,248,255));
		this.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== confirmEmail) {
			JOptionPane.showMessageDialog(this, code , "Verification Code", JOptionPane.PLAIN_MESSAGE);
			verificationCode.setEditable(true);
			confirmCode.setEnabled(true);
		}
		
		else if(e.getSource()==confirmCode) {
				new HomePage();
				this.dispose();
		}
		
		else if (e.getSource()== backToLogInButton) {
			new LogInPage();
			this.dispose();
		}
		
	}
	

}
