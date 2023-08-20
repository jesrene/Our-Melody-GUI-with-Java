import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class StreamPage2 extends JFrame implements ActionListener{
	
	JButton profileButton;
	JButton createPostButton;
	JButton homePageButton;
	JButton liveStreamButton;
	JButton chatButton;
	JButton notificationButton;
	JButton menuButton;
	JButton searchButton;
	JButton sendButton;
	JTextField chat = new JTextField();
	
	JPanel topPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JPanel chatPanel = new JPanel();
	
	ImageIcon sendIcon = new ImageIcon("Send.png");
	Image newSendIcon = sendIcon.getImage().getScaledInstance(30, 30,Image.SCALE_SMOOTH);
	ImageIcon finalSendIcon = new ImageIcon(newSendIcon);
	ImageIcon profileIcon = new ImageIcon("profile.png");
	Image newProfileIcon = profileIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalProfileIcon = new ImageIcon(newProfileIcon);
	ImageIcon createPostIcon = new ImageIcon("createpost.png");
	Image newCreatePostIcon = createPostIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalCreatePostIcon = new ImageIcon(newCreatePostIcon);
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
	ImageIcon menuIcon = new ImageIcon("menu.png");
	Image newMenuIcon = menuIcon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
	ImageIcon finalMenuIcon = new ImageIcon(newMenuIcon);
	ImageIcon finalSearchIcon = new ImageIcon("search.png");
	
	private ImageIcon Trend1Icon = new ImageIcon("StreamVid.gif");
	Image newImageIcon = Trend1Icon.getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
    JLabel Trend1 = new JLabel (Trend1Icon);
    
    private ImageIcon Trend2Icon = new ImageIcon("DonateBar.png");
	Image newImageIcon1 = Trend1Icon.getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
    JLabel Trend2 = new JLabel (Trend2Icon);
    
	private ImageIcon Trend3Icon = new ImageIcon("LiveChat1.png");
	Image newImage2Icon = Trend3Icon.getImage().getScaledInstance(4, 1,Image.SCALE_SMOOTH);
    JLabel Trend3 = new JLabel (Trend3Icon);   
    
	StreamPage2(){
		

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
		
		chat.setBounds(85, 10, 250, 50);
		chat.setCaretColor(Color.gray);
		chat.setText("");
		chat.setFont(new Font("Century Gothic", Font.PLAIN,15));
		chat.setPreferredSize( new Dimension( 415, 24 ) );
		
		createPostButton = new JButton();
		createPostButton.setBounds(400,0,70,70);
		createPostButton.addActionListener(this);
		createPostButton.setFocusable(false);
		createPostButton.setIcon(finalCreatePostIcon);
		createPostButton.setOpaque(false);
		createPostButton.setContentAreaFilled(false);
		createPostButton.setBorderPainted(false);
		
		sendButton = new JButton();
		sendButton.setBounds(400,0,100,70);
		sendButton.addActionListener(this);
		sendButton.setFocusable(false);
		sendButton.setIcon(finalSendIcon);
		sendButton.setOpaque(false);
		sendButton.setContentAreaFilled(false);
		sendButton.setBorderPainted(false);
		
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
		
		chatPanel.setBackground(new Color(240,248,255));
		chatPanel.setBounds(0, 560, 500, 50);
		chatPanel.setVisible(true);
		chatPanel.add(chat);
		chatPanel.add(sendButton);
		
		Trend1.setBounds(0, 0, 490, 350);
		Trend2.setBounds(0, 0, 490, 730);
		Trend3.setBounds(0, 0, 490, 952);
		
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
		this.add(chatPanel);
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
		else if(e.getSource()== menuButton) {
			new MenuPage();
			this.dispose();
		}
		
		

}}
