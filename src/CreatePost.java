import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreatePost extends JFrame implements ActionListener {
	
	JButton profileButton;
	JButton createPostButton;
	JButton homePageButton;
	JButton liveStreamButton;
	JButton chatButton;
	JButton notificationButton;
	JButton menuButton;
	JButton searchButton;
	JButton cancelButton;
	JButton postButton;
	JButton attachFileButton;
	
	JLabel titleLabel = new JLabel();
	JLabel selectGenreLabel = new JLabel();
	JLabel filePath = new JLabel();
	
	JTextField titleField = new JTextField();
	JTextField contentField = new JTextField();
	
	
	String[] musicGenre = {"Pop","Jazz","Blues","Bossa Nova","Lofi","House","EDM","HipHop","RnB","Soul"};
	JComboBox genre;
	
	JPanel topPanel = new JPanel();
	JPanel comboBoxPanel = new JPanel();
	JPanel titlePanel = new JPanel();
	JPanel contentPanel = new JPanel();
	JPanel filePanel = new JPanel();
	
	ImageIcon profileIcon = new ImageIcon("profile.png");
	Image newProfileIcon = profileIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalProfileIcon = new ImageIcon(newProfileIcon);
	ImageIcon cancelIcon = new ImageIcon("cancel.png");
	Image newCancelIcon = cancelIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalCancelIcon = new ImageIcon(newCancelIcon);
	ImageIcon selectGenreIcon = new ImageIcon("selectgenre.png");
	Image newSelectGenreIcon = selectGenreIcon.getImage().getScaledInstance(30, 30,Image.SCALE_SMOOTH);
	ImageIcon finalSelectGenreIcon = new ImageIcon(newSelectGenreIcon);
	ImageIcon attachIcon = new ImageIcon("attach.png");
	Image newAttachIcon = attachIcon.getImage().getScaledInstance(30, 30,Image.SCALE_SMOOTH);
	ImageIcon finalAttachIcon = new ImageIcon(newAttachIcon);
	
CreatePost(){
	
	Arrays.sort(musicGenre);
	genre = new JComboBox(musicGenre);
	genre.setSelectedItem("Pop");
	genre.setFont(new Font("Century Gothic", Font.PLAIN,12));
	genre.setBounds(60, 10, 100, 30);
	
	cancelButton = new JButton();
	cancelButton.setBounds(0,0,70,70);
	cancelButton.addActionListener(this);
	cancelButton.setFocusable(false);
	cancelButton.setIcon(finalCancelIcon);
	cancelButton.setOpaque(false);
	cancelButton.setContentAreaFilled(false);
	cancelButton.setBorderPainted(false);
	
	postButton = new JButton();
	postButton.setBounds(400,25,70,20);
	postButton.addActionListener(this);
	postButton.setFocusable(false);
	postButton.setText("Post");
	postButton.setFont(new Font("Century Gothic", Font.PLAIN,12));
	postButton.setOpaque(false);
	postButton.setContentAreaFilled(true);
	postButton.setBorderPainted(false);
	
	attachFileButton = new JButton();
	attachFileButton.setBounds(0,0,70,70);
	attachFileButton.addActionListener(this);
	attachFileButton.setFocusable(false);
	attachFileButton.setIcon(finalAttachIcon);
	attachFileButton.setOpaque(false);
	attachFileButton.setContentAreaFilled(false);
	attachFileButton.setBorderPainted(false);
	
	titleField.setBounds(10, 10, 450, 25);
	titleField.setCaretColor(Color.gray);
	titleField.setText("An interesting title");
	titleField.setFont(new Font("Century Gothic", Font.PLAIN,15));
	titleField.setOpaque(false);
	titleField.setBorder(BorderFactory.createEmptyBorder());
	
	contentField.setBounds(10, 10, 450, 25);
	contentField.setCaretColor(Color.gray);
	contentField.setText("Your text post(Optional)");
	contentField.setFont(new Font("Century Gothic", Font.PLAIN,15));
	contentField.setOpaque(false);
	contentField.setBorder(BorderFactory.createEmptyBorder());
	
	titleLabel.setBounds(100, 20, 100, 30);
	titleLabel.setText("Post");
	titleLabel.setFont(new Font("Century Gothic", Font.PLAIN,20));
	titleLabel.setLayout(null);
	
	selectGenreLabel.setBounds(20, 0, 50, 50);
	selectGenreLabel.setIcon(finalSelectGenreIcon);
	
	filePath.setBounds(60, 20, 400, 30);
	filePath.setFont(new Font("Century Gothic", Font.PLAIN,12));
	filePath.setLayout(null);
	
	topPanel.setBackground(Color.WHITE);
	topPanel.setBounds(0, 0, 500, 70);
	topPanel.setVisible(true);
	topPanel.setLayout(null);
	topPanel.add(cancelButton);
	topPanel.add(postButton);
	topPanel.add(titleLabel);
	
	comboBoxPanel.setBackground(Color.WHITE);
	comboBoxPanel.setBounds(0, 70, 500, 50);
	comboBoxPanel.setVisible(true);
	comboBoxPanel.setLayout(null);
	comboBoxPanel.add(genre);
	comboBoxPanel.add(selectGenreLabel);
	
	titlePanel.setBackground(Color.WHITE);
	titlePanel.setBounds(0, 125, 500, 50);
	titlePanel.setVisible(true);
	titlePanel.setLayout(null);
	titlePanel.add(titleField);
	
	contentPanel.setBackground(Color.WHITE);
	contentPanel.setBounds(0, 180, 500, 90);
	contentPanel.setVisible(true);
	contentPanel.setLayout(null);
	contentPanel.add(contentField);
	
	filePanel.setBackground(Color.white);
	filePanel.setBounds(0, 275, 500, 400);
	filePanel.setVisible(true);
	filePanel.setLayout(null);
	filePanel.add(attachFileButton);
	filePanel.add(filePath);
	
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
	this.add(topPanel);
	this.add(comboBoxPanel);
	this.add(titlePanel);
	this.add(contentPanel);
	this.add(filePanel);
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==attachFileButton) {
		
		JFileChooser fileChooser = new JFileChooser();
		int response = fileChooser.showOpenDialog(null);
		
		if (response == JFileChooser.APPROVE_OPTION) {
			File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
			
			String finalPath = file.toString();
			filePath.setText(finalPath);
		}
	}
	
	if (e.getSource()== postButton || e.getSource()==cancelButton) {
		new HomePage();
		this.dispose();
	}
	
	if (e.getSource()==homePageButton) {
		this.dispose();
		new HomePage();
	}
	
	else if(e.getSource()== searchButton) {
		this.dispose();
		new SearchPage();
	}
	
	else if(e.getSource() == notificationButton) {
		new NotifPage();
		this.dispose();
	}
	
	else if(e.getSource() == chatButton) {
		new ChatPage();
		this.dispose();
	}
	
	else if(e.getSource()==profileButton) {
		new ProfilePage();
		this.dispose();
	}
	
	else if(e.getSource()== liveStreamButton) {
		new LiveStreamPage();
		this.dispose();
	}
	
}
}
