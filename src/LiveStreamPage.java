import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class LiveStreamPage extends JFrame implements ActionListener{
	
	JButton profileButton;
	JButton createPostButton;
	JButton homePageButton;
	JButton liveStreamButton;
	JButton chatButton;
	JButton notificationButton;
	JButton menuButton;
	JButton searchButton;
	JButton yoongii; 
	JButton cheryll;
	JButton hann;
	JButton pdminn;
	
	JPanel topPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JPanel firstRowPanel = new JPanel ();
	JPanel secondRowPanel = new JPanel ();
	
	ImageIcon profileIcon = new ImageIcon("profile.png");
	Image newProfileIcon = profileIcon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
	ImageIcon finalProfileIcon = new ImageIcon(newProfileIcon);
	ImageIcon createPostIcon = new ImageIcon("createpost.png");
	Image newCreatePostIcon = createPostIcon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
	ImageIcon finalCreatePostIcon = new ImageIcon(newCreatePostIcon);
	ImageIcon homePageIcon = new ImageIcon("home.png");
	Image newHomePageIcon = homePageIcon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
	ImageIcon finalHomePageIcon = new ImageIcon(newHomePageIcon);
	ImageIcon liveStreamIcon = new ImageIcon("live.png");
	Image newLiveStreamIcon = liveStreamIcon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
	ImageIcon finalLiveStreamIcon = new ImageIcon(newLiveStreamIcon);
	ImageIcon chatIcon = new ImageIcon("message.png");
	Image newChatIcon = chatIcon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
	ImageIcon finalChatIcon = new ImageIcon(newChatIcon);
	ImageIcon notificationIcon = new ImageIcon("notif.png");
	Image newNotificationIcon = notificationIcon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
	ImageIcon finalNotificationIcon = new ImageIcon(newNotificationIcon);
	ImageIcon menuIcon = new ImageIcon("menu.png");
	Image newMenuIcon = menuIcon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
	ImageIcon finalMenuIcon = new ImageIcon(newMenuIcon);
	ImageIcon finalSearchIcon = new ImageIcon("search.png");
	ImageIcon yoongiicon = new ImageIcon("yoongi.png");
	Image newyoongiicon =  yoongiicon.getImage();
	ImageIcon finalyoongiicon = new ImageIcon(newyoongiicon);
	ImageIcon cherylicon = new ImageIcon("cheryl.png");
	Image newcherylicon  =  cherylicon.getImage();
	ImageIcon finalcherylicon = new ImageIcon(newcherylicon);
	ImageIcon hanicon = new ImageIcon("han.png");
	Image newhanicon =  hanicon.getImage();
	ImageIcon finalhanicon = new ImageIcon(newhanicon);
	ImageIcon pdminicon = new ImageIcon("pdmin.png");
	Image newpdminicon =  pdminicon.getImage();
	ImageIcon finalpdminicon = new ImageIcon(newpdminicon);
	
	LiveStreamPage(){
		
		
		profileButton = new JButton();
		profileButton.setBounds(0, 0, 70, 70);
		profileButton.addActionListener(this);
		profileButton.setFocusable(false);
		profileButton.setIcon(finalProfileIcon);
		profileButton.setOpaque(false);
		profileButton.setContentAreaFilled(false);
		profileButton.setBorderPainted(false);
		
		searchButton = new JButton();
		searchButton.setBounds(85, 10, 300, 50);
		searchButton.addActionListener(this);
		searchButton.setFocusable(false);
		searchButton.setIcon(finalSearchIcon);
		searchButton.setOpaque(false);
		searchButton.setContentAreaFilled(false);
		searchButton.setBorderPainted(false);
		
		
		createPostButton = new JButton();
		createPostButton.setBounds(400,0,70,70);
		createPostButton.addActionListener(this);
		createPostButton.setFocusable(false);
		createPostButton.setIcon(finalCreatePostIcon);
		createPostButton.setOpaque(false);
		createPostButton.setContentAreaFilled(false);
		createPostButton.setBorderPainted(false);
		
		homePageButton = new JButton();
		homePageButton.setBounds(0,600,70,70);
		homePageButton.addActionListener(this);
		homePageButton.setFocusable(false);
		homePageButton.setIcon(finalHomePageIcon);
		homePageButton.setOpaque(false);
		homePageButton.setContentAreaFilled(false);
		homePageButton.setBorderPainted(false);
		
		liveStreamButton = new JButton();
		liveStreamButton.setBounds(100,600,70,70);
		liveStreamButton.addActionListener(this);
		liveStreamButton.setFocusable(false);
		liveStreamButton.setIcon(finalLiveStreamIcon);
		liveStreamButton.setOpaque(false);
		liveStreamButton.setContentAreaFilled(false);
		liveStreamButton.setBorderPainted(false);
		
		chatButton = new JButton();
		chatButton.setBounds(200,600,70,70);
		chatButton.addActionListener(this);
		chatButton.setFocusable(false);
		chatButton.setIcon(finalChatIcon);
		chatButton.setOpaque(false);
		chatButton.setContentAreaFilled(false);
		chatButton.setBorderPainted(false);
		
		notificationButton = new JButton();
		notificationButton.setBounds(300,600,70,70);
		notificationButton.addActionListener(this);
		notificationButton.setFocusable(false);
		notificationButton.setIcon(finalNotificationIcon);
		notificationButton.setOpaque(false);
		notificationButton.setContentAreaFilled(false);
		notificationButton.setBorderPainted(false);
		
		menuButton = new JButton();
		menuButton.setBounds(400,600,70,70);
		menuButton.addActionListener(this);
		menuButton.setFocusable(false);
		menuButton.setIcon(finalMenuIcon);
		menuButton.setOpaque(false);
		menuButton.setContentAreaFilled(false);
		menuButton.setBorderPainted(false);
		
		topPanel.setBackground(Color.WHITE);
		topPanel.setBounds(0, 0, 500, 70);
		topPanel.setVisible(true);
		topPanel.setLayout(null);
		topPanel.add(profileButton);
		topPanel.add(createPostButton);
		topPanel.add(searchButton);
		
		bottomPanel.setBackground(Color.white);
		bottomPanel.setBounds(0, 600, 500, 100);
		bottomPanel.setVisible(true);
		bottomPanel.add(homePageButton);
		bottomPanel.add(liveStreamButton);
		bottomPanel.add(chatButton);
		bottomPanel.add(notificationButton);
		bottomPanel.add(menuButton);
		
		this.setTitle("Our Melody");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500,700);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		yoongii = new JButton();
		yoongii.setBounds(18,40,210,225);
		yoongii.addActionListener(this);
		yoongii.setFocusable(false);
		yoongii.setIcon(finalyoongiicon);
		yoongii.setOpaque(false);
		yoongii.setContentAreaFilled(false);
		yoongii.setBorderPainted(true);
		
		cheryll = new JButton();
		cheryll.setBounds(258,40,210,225);
		cheryll.addActionListener(this);
		cheryll.setFocusable(false);
		cheryll.setIcon(finalcherylicon);
		cheryll.setOpaque(false);
		cheryll.setContentAreaFilled(false);
		cheryll.setBorderPainted(true);
		
		hann = new JButton();
		hann.setBounds(18,40,210,225);
		hann.addActionListener(this);
		hann.setFocusable(false);
		hann.setIcon(finalhanicon);
		hann.setOpaque(false);
		hann.setContentAreaFilled(false);
		hann.setBorderPainted(true);
		
		pdminn = new JButton();
		pdminn.setBounds(258,40,210,225);
		pdminn.addActionListener(this);
		pdminn.setFocusable(false);
		pdminn.setIcon(finalpdminicon);
		pdminn.setOpaque(false);
		pdminn.setContentAreaFilled(false);
		pdminn.setBorderPainted(true);
		
		firstRowPanel.setBackground(new Color(240,248,255));
		firstRowPanel.setBounds(0, 60, 500,265);
		firstRowPanel.setLayout(null);
		firstRowPanel.setVisible(true);
		firstRowPanel.add(yoongii);
		firstRowPanel.add(cheryll);

		secondRowPanel.setBackground(new Color(240,248,255));
		secondRowPanel.setBounds(0, 300, 500,300);
		secondRowPanel.setLayout(null);
		secondRowPanel.setVisible(true);
		secondRowPanel.add(hann);
		secondRowPanel.add(pdminn);
		
		ImageIcon icon = new ImageIcon("logo.png");
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(new Color(240,248,255));
		this.add(topPanel);
		this.add(bottomPanel);
		this.add(firstRowPanel);
		this.add(secondRowPanel);
	
		
	}
	
@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==homePageButton) {
			this.dispose();
			new HomePage();
		}
		
		else if(e.getSource()==liveStreamButton) {
			this.dispose();
			new LiveStreamPage();
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
		
		else if(e.getSource()==createPostButton) {
			new CreatePost();
			this.dispose();
		}
		
		else if(e.getSource()==cheryll) {
			new StreamPage();
			this.dispose();
		}
}
}
