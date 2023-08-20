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
import javax.swing.SwingConstants;


public class HomePage extends JFrame implements ActionListener{
	
	JButton profileButton;
	JButton createPostButton;
	JButton homePageButton;
	JButton liveStreamButton;
	JButton chatButton;
	JButton notificationButton;
	JButton menuButton;
	JButton searchButton;
	JButton davidProfileButton;
	
	JLabel davidIconLabel = new JLabel();
	JLabel davidProfileLabel = new JLabel();
	JLabel davidlikeLabel = new JLabel();
	JLabel davidcommentLabel = new JLabel();
	JLabel davidshareLabel = new JLabel();
	JLabel davidbookmarkLabel = new JLabel();
	JLabel patrickIconLabel = new JLabel();
	JLabel patrickProfileLabel = new JLabel();
	JLabel patricklikeLabel = new JLabel();
	JLabel patrickcommentLabel = new JLabel();
	JLabel patrickshareLabel = new JLabel();
	JLabel patrickbookmarkLabel = new JLabel();
	JLabel secondGradeIconLabel = new JLabel();
	JLabel secondGradeProfileLabel = new JLabel();
	JLabel secondGradelikeLabel = new JLabel();
	JLabel secondGradecommentLabel = new JLabel();
	JLabel secondGradeshareLabel = new JLabel();
	JLabel secondGradebookmarkLabel = new JLabel();
	
	JPanel topPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JPanel davidPanel = new JPanel();
	JPanel patrickPanel = new JPanel();
	JPanel secondGradePanel = new JPanel();
	
	ImageIcon secondGradeIcon = new ImageIcon("2nd grade.jpg");
	Image newsecondGradeIcon = secondGradeIcon.getImage().getScaledInstance(80, 80,Image.SCALE_SMOOTH);
	ImageIcon finalsecondGradeIcon = new ImageIcon(newsecondGradeIcon);
	ImageIcon patrickIcon = new ImageIcon("patrick gardner.jpeg");
	Image newPatrickIcon = patrickIcon.getImage().getScaledInstance(80, 80,Image.SCALE_SMOOTH);
	ImageIcon finalPatrickIcon = new ImageIcon(newPatrickIcon);
	ImageIcon davidIcon = new ImageIcon("david gilmour.jpg");
	Image newDavidIcon = davidIcon.getImage().getScaledInstance(80, 80,Image.SCALE_SMOOTH);
	ImageIcon finalDavidIcon = new ImageIcon(newDavidIcon);
	ImageIcon commentIcon = new ImageIcon("comment.png");
	Image newCommentIcon = commentIcon.getImage().getScaledInstance(30, 30,Image.SCALE_SMOOTH);
	ImageIcon finalCommentIcon = new ImageIcon(newCommentIcon);
	ImageIcon shareIcon = new ImageIcon("share.png");
	Image newShareIcon = shareIcon.getImage().getScaledInstance(30, 30,Image.SCALE_SMOOTH);
	ImageIcon finalShareIcon = new ImageIcon(newShareIcon);
	ImageIcon likeIcon = new ImageIcon("like.png");
	Image newlikeIcon = likeIcon.getImage().getScaledInstance(30, 30,Image.SCALE_SMOOTH);
	ImageIcon finallikeIcon = new ImageIcon(newlikeIcon);
	ImageIcon bookmarkIcon = new ImageIcon("bookmark.png");
	Image newbookmarkIcon = bookmarkIcon.getImage().getScaledInstance(30, 30,Image.SCALE_SMOOTH);
	ImageIcon finalbookmarkIcon = new ImageIcon(newbookmarkIcon);
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
	

	
	HomePage(){
		
		
		
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
		
		davidProfileButton = new JButton();
		davidProfileButton.setLayout(null);
		davidProfileButton.setBounds(3,5,200,15);
		davidProfileButton.setText("@davidgilmour");
		davidProfileButton.setFont(new Font("Century Gothic", Font.PLAIN,10));
		davidProfileButton.setHorizontalAlignment(SwingConstants.LEFT);
		davidProfileButton.addActionListener(this);
		davidProfileButton.setFocusable(false);
		davidProfileButton.setOpaque(false);
		davidProfileButton.setContentAreaFilled(false);
		davidProfileButton.setBorderPainted(false);
		
		davidIconLabel.setBounds(20, 10, 300, 100);
		davidIconLabel.setLayout(null);
		davidIconLabel.setIcon(finalDavidIcon);
		davidIconLabel.setText("	Noodling new strat!!!");
		davidIconLabel.setFont(new Font("Century Gothic", Font.PLAIN,12));
		
		davidlikeLabel.setBounds(20, 100, 50, 50);
		davidlikeLabel.setLayout(null);
		davidlikeLabel.setIcon(finallikeIcon);
		
		davidcommentLabel.setBounds(60, 100, 50, 50);
		davidcommentLabel.setLayout(null);
		davidcommentLabel.setIcon(finalCommentIcon);
		
		davidshareLabel.setBounds(95, 100, 50, 50);
		davidshareLabel.setLayout(null);
		davidshareLabel.setIcon(finalShareIcon);
		
		davidbookmarkLabel.setBounds(400, 100, 50, 50);
		davidbookmarkLabel.setLayout(null);
		davidbookmarkLabel.setIcon(finalbookmarkIcon);
		
		patrickIconLabel.setBounds(20, 10, 300, 100);
		patrickIconLabel.setLayout(null);
		patrickIconLabel.setIcon(finalPatrickIcon);
		patrickIconLabel.setText("	Producing new song rn. STAY TUNED FOLKS!!");
		patrickIconLabel.setFont(new Font("Century Gothic", Font.PLAIN,12));
		
		patrickProfileLabel.setBounds(20, 5, 100, 15);
		patrickProfileLabel.setLayout(null);
		patrickProfileLabel.setText("@patrickgardner");
		patrickProfileLabel.setFont(new Font("Century Gothic", Font.PLAIN,10));
		
		patricklikeLabel.setBounds(20, 100, 50, 50);
		patricklikeLabel.setLayout(null);
		patricklikeLabel.setIcon(finallikeIcon);
		
		patrickcommentLabel.setBounds(60, 100, 50, 50);
		patrickcommentLabel.setLayout(null);
		patrickcommentLabel.setIcon(finalCommentIcon);
		
		patrickshareLabel.setBounds(95, 100, 50, 50);
		patrickshareLabel.setLayout(null);
		patrickshareLabel.setIcon(finalShareIcon);
		
		patrickbookmarkLabel.setBounds(400, 100, 50, 50);
		patrickbookmarkLabel.setLayout(null);
		patrickbookmarkLabel.setIcon(finalbookmarkIcon);
		
		secondGradeIconLabel.setBounds(20, 10, 500, 100);
		secondGradeIconLabel.setLayout(null);
		secondGradeIconLabel.setIcon(finalsecondGradeIcon);
		secondGradeIconLabel.setText("	Hit to Hit for the win.Check out our new album \"Hit to Hit\"");
		secondGradeIconLabel.setFont(new Font("Century Gothic", Font.PLAIN,12));
		
		secondGradeProfileLabel.setBounds(20, 5, 100, 15);
		secondGradeProfileLabel.setLayout(null);
		secondGradeProfileLabel.setText("@2ndgrade");
		secondGradeProfileLabel.setFont(new Font("Century Gothic", Font.PLAIN,10));
		
		secondGradelikeLabel.setBounds(20, 100, 50, 50);
		secondGradelikeLabel.setLayout(null);
		secondGradelikeLabel.setIcon(finallikeIcon);
		
		secondGradecommentLabel.setBounds(60, 100, 50, 50);
		secondGradecommentLabel.setLayout(null);
		secondGradecommentLabel.setIcon(finalCommentIcon);
		
		secondGradeshareLabel.setBounds(95, 100, 50, 50);
		secondGradeshareLabel.setLayout(null);
		secondGradeshareLabel.setIcon(finalShareIcon);
		
		secondGradebookmarkLabel.setBounds(400, 100, 50, 50);
		secondGradebookmarkLabel.setLayout(null);
		secondGradebookmarkLabel.setIcon(finalbookmarkIcon);
		
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
		
		davidPanel.setBackground(Color.white);
		davidPanel.setBounds(20, 80, 450, 150);
		davidPanel.setLayout(null);
		davidPanel.setVisible(true);
		davidPanel.add(davidIconLabel);
		davidPanel.add(davidProfileButton);
		davidPanel.add(davidcommentLabel);
		davidPanel.add(davidshareLabel);
		davidPanel.add(davidlikeLabel);
		davidPanel.add(davidbookmarkLabel);
		
		patrickPanel.setBackground(Color.white);
		patrickPanel.setBounds(20, 250, 450, 150);
		patrickPanel.setLayout(null);
		patrickPanel.setVisible(true);
		patrickPanel.add(patrickIconLabel);
		patrickPanel.add(patrickProfileLabel);
		patrickPanel.add(patrickcommentLabel);
		patrickPanel.add(patrickshareLabel);
		patrickPanel.add(patricklikeLabel);
		patrickPanel.add(patrickbookmarkLabel);
		
		secondGradePanel.setBackground(Color.white);
		secondGradePanel.setBounds(20, 420, 450, 150);
		secondGradePanel.setLayout(null);
		secondGradePanel.setVisible(true);
		secondGradePanel.add(secondGradeIconLabel);
		secondGradePanel.add(secondGradeProfileLabel);
		secondGradePanel.add(secondGradecommentLabel);
		secondGradePanel.add(secondGradeshareLabel);
		secondGradePanel.add(secondGradelikeLabel);
		secondGradePanel.add(secondGradebookmarkLabel);
		
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
		this.add(davidPanel);
		this.add(patrickPanel);
		this.add(secondGradePanel);
		
		
		
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
		else if(e.getSource()== davidProfileButton) {
			new DavidPage();
			this.dispose();
		}
	}

}
