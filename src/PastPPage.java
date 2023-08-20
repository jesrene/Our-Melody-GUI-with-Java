import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PastPPage extends JFrame implements ActionListener{
	
	JLabel username;
	JButton homePageButton;
	JButton liveStreamButton;
	JButton chatButton;
	JButton notificationButton;
	JButton menuButton;
	JButton backButton;
	JButton latestSong;
	JButton liveStream;
	JButton posts;
	
	JPanel topPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JPanel categoryPanel = new JPanel();
	
	
	
	ImageIcon backIcon = new ImageIcon("Back.png");
	Image newBackIcon = backIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalBackIcon = new ImageIcon(newBackIcon);
	ImageIcon homePageIcon = new ImageIcon("home.png");
	Image newHomePageIcon = homePageIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalHomePageIcon = new ImageIcon(newHomePageIcon);
	ImageIcon liveStreamIcon = new ImageIcon("live.png");
	Image newLiveStreamIcon = liveStreamIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalLiveStreamIcon = new ImageIcon(newLiveStreamIcon);
	ImageIcon chatIcon = new ImageIcon("message.png");
	Image newChatIcon = chatIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalChatIcon = new ImageIcon(newChatIcon);
	ImageIcon notificationIcon = new ImageIcon("notif.png");
	Image newNotificationIcon = notificationIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalNotificationIcon = new ImageIcon(newNotificationIcon);
	ImageIcon finalLiveIcon = new ImageIcon("LStream.png");
	ImageIcon finalSongIcon = new ImageIcon("LSongs.png");
	ImageIcon finalPostIcon = new ImageIcon("Posts.png");
	ImageIcon menuIcon = new ImageIcon("menu.png");
	Image newMenuIcon = menuIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalMenuIcon = new ImageIcon(newMenuIcon);
	
	private ImageIcon Trend1Icon = new ImageIcon("ProfilePic.png");
	Image newImageIcon = Trend1Icon.getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
    JLabel Trend1 = new JLabel (Trend1Icon);

	private ImageIcon Trend2Icon = new ImageIcon("Following.png");
	Image newImage1Icon = Trend2Icon.getImage().getScaledInstance(4, 1,Image.SCALE_SMOOTH);
    JLabel Trend2 = new JLabel (Trend2Icon);
    
	private ImageIcon Trend3Icon = new ImageIcon("PastPosts.png");
	Image newImage2Icon = Trend3Icon.getImage().getScaledInstance(4, 1,Image.SCALE_SMOOTH);
    JLabel Trend3 = new JLabel (Trend3Icon);   
    
	PastPPage(){
		
		
		username = new JLabel("@ChadSquid");
		username.setFont(new Font("Century Gothic", Font.BOLD,20));
		username.setBounds(190, 10, 250, 50);
		
		backButton = new JButton();
		backButton.setBounds(0, 0, 70, 70);
		backButton.addActionListener(this);
		backButton.setFocusable(false);
		backButton.setIcon(finalBackIcon);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		

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
		
		latestSong = new JButton();
		latestSong.setBounds(0,600,70,70);
		latestSong.addActionListener(this);
		latestSong.setFocusable(false);
		latestSong.setIcon(finalSongIcon);
		latestSong.setOpaque(false);
		latestSong.setContentAreaFilled(false);
		latestSong.setBorderPainted(false);
		
		liveStream = new JButton();
		liveStream.setBounds(100,600,70,70);
		liveStream.addActionListener(this);
		liveStream.setFocusable(false);
		liveStream.setIcon(finalLiveIcon);
		liveStream.setOpaque(false);
		liveStream.setContentAreaFilled(false);
		liveStream.setBorderPainted(false);
		
		posts = new JButton();
		posts.setBounds(200,600,70,70);
		posts.addActionListener(this);
		posts.setFocusable(false);
		posts.setIcon(finalPostIcon);
		posts.setOpaque(false);
		posts.setContentAreaFilled(false);
		posts.setBorderPainted(false);
		
		topPanel.setBackground(new Color(240,248,255));
		topPanel.setBounds(0, 0, 60, 60);
		topPanel.setVisible(true);
		topPanel.setLayout(null);
		topPanel.add(backButton);
		topPanel.add(username);
		
		
		bottomPanel.setBackground(Color.white);
		bottomPanel.setBounds(0, 600, 500, 100);
		bottomPanel.setVisible(true);
		bottomPanel.add(homePageButton);
		bottomPanel.add(liveStreamButton);
		bottomPanel.add(chatButton);
		bottomPanel.add(notificationButton);
		bottomPanel.add(menuButton);
		
		categoryPanel.setBackground(new Color(240,248,255));
		categoryPanel.setBounds(0, 340, 500, 50);
		categoryPanel.setVisible(true);
		categoryPanel.add(latestSong);
		categoryPanel.add(posts);
		categoryPanel.add(liveStream);

		
		Trend1.setBounds(0, 0, 500, 300);
		Trend2.setBounds(0, 0, 495, 600);
		Trend3.setBounds(0, 0, 490, 980);
		
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
		this.add(bottomPanel);
		this.add(categoryPanel);
		this.add(username);
		this.add(Trend1);
		this.add(Trend2);
		this.add(Trend3);		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==homePageButton) {
			this.dispose();
			new HomePage();
		}
		else if (e.getSource()==backButton) {
			this.dispose();
			new HomePage();	
		}
		else if (e.getSource()==latestSong) {
			this.dispose();
			new ProfilePage();
		}
		else if (e.getSource()==posts) {
			this.dispose();
			new PastPPage();
		}
		else if (e.getSource()==liveStream) {
			this.dispose();
			new PastLPage();
		}

		else if(e.getSource() == notificationButton) {
			new NotifPage();
			this.dispose();
		}
		
		else if(e.getSource() == chatButton) {
			new ChatPage();
			this.dispose();
		}
		
		else if(e.getSource()== liveStreamButton) {
			new LiveStreamPage();
			this.dispose();
		}
		
	}}
