import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton launchAppButton;
	JLabel welcomeLabel;
	JLabel versionLabel;
	JLabel companyLabel;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("logo.png");
		launchAppButton = new JButton();
		launchAppButton.setBounds(120, 180, 250, 250);
		launchAppButton.addActionListener(this);
		launchAppButton.setFocusable(false);
		launchAppButton.setIcon(icon);
		launchAppButton.setOpaque(false);
		launchAppButton.setContentAreaFilled(false);
		launchAppButton.setBorderPainted(false);
		
		welcomeLabel = new JLabel("Click to continue...");
		welcomeLabel.setFont(new Font("Century Gothic", Font.PLAIN,20));
		welcomeLabel.setBounds(155, 280, 300, 300);
		
		versionLabel = new JLabel("Version 1.0.0");
		versionLabel.setFont(new Font("Century Gothic", Font.PLAIN,12));
		versionLabel.setBounds(400, 500, 300, 300);
		
		companyLabel = new JLabel("GCJL.co");
		companyLabel.setFont(new Font("Century Gothic", Font.PLAIN,12));
		companyLabel.setBounds(10, 500, 300, 300);
		
		
		this.setTitle("Our Melody");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500,700);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(new Color(240,248,255));
		this.add(launchAppButton);
		this.add(welcomeLabel);
		this.add(versionLabel);
		this.add(companyLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==launchAppButton) {
			this.dispose();
			new LogInPage();
		}
		
		}
		
	
	
}
