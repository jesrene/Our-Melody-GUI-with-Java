import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class ChatPage extends JFrame implements ActionListener {
	
	JButton profileButton;
	JButton createPostButton;
	JButton homePageButton;
	JButton liveStreamButton;
	JButton chatButton;
	JButton notificationButton;
	JButton menuButton;
	JButton searchButton;
	JButton groupButton;
	JButton directButton;
	
	JLabel groupLabel = new JLabel();
	JLabel directLabel = new JLabel();
	
	JPanel topPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JPanel mainPanel = new JPanel();
	JPanel groupPanel = new JPanel();
	JPanel directPanel = new JPanel();
	
	JLayeredPane layers = new JLayeredPane();
	
	ImageIcon searchIcon = new ImageIcon("search.jpeg");
	Image newSearchIcon = searchIcon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
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
	ImageIcon groupIcon = new ImageIcon("group.png");
	Image newGroupIcon = groupIcon.getImage().getScaledInstance(450, 500,Image.SCALE_SMOOTH);
	ImageIcon finalGroupIcon = new ImageIcon(newGroupIcon);
	ImageIcon directIcon = new ImageIcon("direct.png");
	Image newDirectIcon = directIcon.getImage().getScaledInstance(450, 500,Image.SCALE_SMOOTH);
	ImageIcon finalDirectIcon = new ImageIcon(newDirectIcon);
	
	ChatPage(){
		
		
		
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
		
		groupButton = new JButton();
		groupButton.setBounds(150,0,90,20);
		groupButton.addActionListener(this);
		groupButton.setFocusable(false);
		groupButton.setText("Group");
		groupButton.setFont(new Font("Century Gothic", Font.BOLD,15));
		groupButton.setOpaque(false);
		groupButton.setContentAreaFilled(false);
		groupButton.setBorderPainted(false);
		
		directButton = new JButton();
		directButton.setBounds(250,0,90,20);
		directButton.addActionListener(this);
		directButton.setFocusable(false);
		directButton.setText("Direct");
		directButton.setFont(new Font("Century Gothic", Font.BOLD,15));
		directButton.setOpaque(false);
		directButton.setContentAreaFilled(false);
		directButton.setBorderPainted(false);
		
		groupLabel.setBounds(0, 0, 500, 500);
		groupLabel.setLayout(null);
		groupLabel.setIcon(finalGroupIcon);
		
		directLabel.setBounds(0, 0, 500, 500);
		directLabel.setLayout(null);
		directLabel.setIcon(finalDirectIcon);
		
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
		
		mainPanel.setBackground(Color.white);
		mainPanel.setBounds(0, 80, 500, 510);
		mainPanel.setVisible(true);
		mainPanel.setLayout(null);
		mainPanel.add(groupButton);
		mainPanel.add(directButton);
		
		groupPanel.setBackground(Color.white);
		groupPanel.setBounds(35, 150, 450, 400);
		groupPanel.setVisible(true);
		groupPanel.add(groupLabel);
		groupPanel.setLayout(null);
		
		directPanel.setBackground(Color.white);
		directPanel.setBounds(35, 150, 450, 400);
		directPanel.setVisible(true);
		directPanel.add(directLabel);
		directPanel.setLayout(null);
		
		layers.setBounds(0,0, 500, 800);
		layers.add(mainPanel, Integer.valueOf(0));
		
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
		this.add(layers);
		this.add(topPanel);
		this.add(bottomPanel);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== groupButton) {
			layers.add(groupPanel,Integer.valueOf(1));
			groupButton.setSelected(false);
			
		}
		else if(e.getSource()== directButton) {
			directButton.setSelected(false);
			groupPanel.setVisible(false);
			layers.add(directPanel,Integer.valueOf(1));
			
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
		
		else if(e.getSource()==createPostButton) {
			new CreatePost();
			this.dispose();
		}
	}
}
