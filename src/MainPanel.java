import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.TreeMap;
/**
 * @author Ardi Ragil Saputra
 *	Bug fixed 
 *	UI Fixed
 *	fitur extends 
 *		1.pencaritan dengan email atau nomor telpone ,nama depan nama belakang dan tanpa harus huruf kapital
 *		2.menggunakan pengaitan Data chat dan Data Akun tetapi belom diimplementasikan  
 *
 * Last Edited
 * 		23.47 / 12/7/2018
 */		
public class MainPanel extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private  static  final  int  FRAME_WIDTH  =  1390;
	private  static  final  int  FRAME_HEIGHT  =  740;
	private  static  final  int  FRAME_X_ORIGIN  =  0;
	private  static  final  int  FRAME_Y_ORIGIN  =  -10;
	private JLabel  
					namadicariL,
				  alamatdicariL,
				 tanggaldicariL,
			       emaildicariL,
				  genderdicariL;
	private JButton 
					loginBTN,
				   signUpBTN,
				   searchBTN,
					 chatBTN,
				addfriendBTN;
	private JTextField 
						namaTF,
					passwordTF,
				   firstNameTF,
					 SurnameTF,
					   EmailTF,
					  AddresTF,
				 newPasswordTF,
					  SearchTF;
	private JTextArea
					MyStatusTA;
	private JPanel 	 
					 accountPanel,
					  friendPanel,
							Panel,
					   loginPanel, 
					topLoginPanel,
				 centerLoginPanel,
				   eastLoginPanel,
					    mainPanel,
					  SwitchPanel,
					  	   panel2,
					   panelPesan,
				           panel3,
			   paneltengahaccount,
				 contentMainPanel,
			     accountMainPanel,
				      logoutPanel;
	private static final String[] dayText = {
			"1","2","3","4","5","6","7","8","9","10","11",
			"12","13","14","15","16","17","18","19","20","21",
			"22","23","24","25","26","27","28","29","30","31"};
	private static final String[] MonthText = {
			"Jan","Feb","Mar","Apr","Mei","Jun","Jul","Agu","Sept","Okt","Nov","Des"};
	
	private static final String[] yearText = {
			"1980","1981","1982","1983","1984","1985","1986","1987","1988","1988",
			"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999",
			"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009",
			"2010","2011","2012","2013","2014","2015","2016","2017","2018"};
	private JRadioButton lakilaki,
						perempuan;
	private final String user="USER";
	private final String chat = "PSN";
	
	private String SearchID="";
	private String NamaPengguna = "";
	private String IDuser = "";
	private String IDPesan = "";
	private String IDpass="";
	private int IDnumber = 100;
	private int NoPesan = 1000;
	private int Date1=0,
				Date2=0,
				Date3=0;

	private Map<String,Orang> AccountID ;
	private Map<String,Pesan> ChatID; 
	
	private Font DefaultFont = new Font("Arial",Font.PLAIN,16);
	private Font DefaultFontSmall = new Font("Arial",Font.BOLD,12);
	private Font FontImportant = new Font("Arial",Font.BOLD,36);
	
	private Color DefaultColor = new Color(238,238,238);
	private Color TombolDarkness = new Color(3, 173, 99);
	private Color TombolLightness = new Color(56, 247, 145);
	private Color listColor = new Color(160, 255, 155);
	
	private Orang dicari;
	private Orang ObjekPengguna;
	private String namadicari;
	private String emaildicari;
	private String tanggaldicari;
	private String alamatdicari;
	private String kelamindicari;

	public MainPanel() {
		setResizable(true);
		setTitle("ID Book " + NamaPengguna);
		setSize(FRAME_WIDTH,  FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN,  FRAME_Y_ORIGIN);
		
		//Storage data
		AccountID = new TreeMap<String,Orang>();
		ChatID = new TreeMap<String,Pesan>();
		
		//Data//
		Orang Root = new Orang("USER1","Ardi","Ragil Saputra","ardi.rs@gmail.com","root","Pujodadi","Male",30,6,1998);
		AccountID.put("root", Root);
		Orang Admin = new Orang("USER2","Ardi2","Ragil Saputra2","ardi.rs@gmail.com2","Admin","Pujodadi2","Male2",30,6,1998);
		AccountID.put("Admin", Admin);
		Orang Orang1 = new Orang("USER3","Ery","Setiawan","ery@gmail.com","ery","pahoman","Male",28,6,1998);
		AccountID.put("ery", Orang1);
		Orang Orang2 = new Orang("USER4","Hasanuddin","","Hasan@gmail.com","hasan","metro","Male",12,5,1998);
		AccountID.put("hasan", Orang2);
		Orang Orang3 = new Orang("USER5","Dita","Nur Isnayni","dita@gmail.com","dita","gadingrejo","Female",4,4,1998);
		AccountID.put("dita", Orang3);
		Orang Orang4 = new Orang("USER6","Fitriani","","fitritp2@gmail.com","fitri","kampung baru","Female",6,6,1998);
		AccountID.put("fitri", Orang4);
		Orang Orang5 = new Orang("USER7","Jeremy","Bagus Adiguna","jeremydrummer@gmail.com","jeremy","tanggerang","Male",5,5,1998);
		AccountID.put("jeremy", Orang5);
		Orang Orang6 = new Orang("USER8","Ghuffrony","Rezaldy ms","gee@gmail.com","gee","lampung tengah","Male",1,8,1998);
		AccountID.put("gee", Orang6);
		Orang Orang7 = new Orang("USER9","Rizki","Elvilia Putri","rizki@gmail.com","rizki","bandar lampung","Female",2,3,1998);
		AccountID.put("rizki", Orang7);
		Orang Orang8 = new Orang("USER10","Dody","Kurnia Sandi","dody@gmail.com","dody","bandar lampung","Male",7,7,1998);
		AccountID.put("dody", Orang8);
		Orang Orang9 = new Orang("USER11","Elyas","Dwi Maryanto","elyas@gmail.com","elyas","lampung tengah","Male",9,9,1999);
		AccountID.put("elyas", Orang9);
		Orang Orang10 = new Orang("USER12","Gatra","Yolanda","gatra@gmail.com","gatra","lampung tengah","Male",10,10,1998);
		AccountID.put("gatra", Orang10);
		
		//for full screen
		setExtendedState(JFrame.MAXIMIZED_BOTH);        

		//======//
		
		createPanel();
		//modifier
		namaTF.setText("ardi.rs@gmail.com");
		passwordTF.setText("root");
		
		//
		Container a = getContentPane();
		a.setLayout(new FlowLayout());
		a.add(Panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void createPanel() {
		Panel = new JPanel();
		Panel.setLayout(new CardLayout());
		createLoginPanel();
		createMainPanel();
		createLogoutPanel();
		Panel.add(loginPanel,"loginPanel");
		Panel.add(mainPanel,"mainPanel");
		Panel.add(logoutPanel,"logoutPanel");
	}
	public void createLoginPanel () {
		loginPanel = new JPanel();
		loginPanel.setLayout(new BorderLayout(10,10)) ;
		createTopLoginPanel();
		createCenterLoginPanel();
		createRightLoginPanel();
		loginPanel.add(topLoginPanel,BorderLayout.NORTH);
		loginPanel.add(centerLoginPanel,BorderLayout.CENTER);
		loginPanel.add(eastLoginPanel,BorderLayout.EAST);
	}
	public void createCenterLoginPanel(){
		centerLoginPanel = new JPanel();
		JLabel gambar1 = new JLabel();
		gambar1.setIcon( new ImageIcon("src/Resources/IDcp.png"));
		gambar1.setSize(500, 500);
		centerLoginPanel.add(gambar1);
		centerLoginPanel.setBackground(new Color(211, 216, 226));
	}
	public void createTopLoginPanel() {
		topLoginPanel = new JPanel();
		topLoginPanel.setLayout(new BorderLayout(10,10));
	    
		JPanel Centered = new JPanel();
		Centered.setLayout(new GridLayout(1,4));
		
		JLabel KiriCentered = new JLabel("IDBook");
		KiriCentered.setFont(FontImportant);
		
		JPanel Space =  new JPanel();
		Space.add(new JLabel("                             "));
		
		JPanel FormLogin = new JPanel();
		Space.setBackground(FormLogin.getBackground());
		
		FormLogin.setLayout(new GridLayout(2,3));	
		FormLogin.add(new JLabel("Email or Phone"));
		FormLogin.add(new JLabel("Password"));
		FormLogin.add(new JLabel(""));
		
		namaTF = new JTextField();
		namaTF.setColumns(20);
		namaTF.setBorder(new LineBorder(TombolDarkness,3));
		namaTF.setFont(DefaultFontSmall);
		FormLogin.add(namaTF);
		
		passwordTF = new JPasswordField();
		passwordTF.setBorder(new LineBorder(TombolDarkness,3));
		passwordTF.setFont(DefaultFontSmall);
		passwordTF.setColumns(20);
		FormLogin.add(passwordTF);
		
		JPanel loginButtonPanel = new JPanel(new GridLayout(1,2));
		topLoginPanel.setBackground(TombolLightness);
		loginButtonPanel.setBackground(topLoginPanel.getBackground());
		
		loginBTN = new JButton("Login");
		loginBTN.setFont(DefaultFontSmall);
		loginBTN.addActionListener(this);
		loginBTN.setBackground(TombolDarkness);
		loginBTN.setForeground(TombolLightness);
		loginButtonPanel.add(loginBTN);
		loginButtonPanel.add(new JLabel("         "));
		
		FormLogin.add(loginButtonPanel);
		loginBTN.setBorder(new LineBorder(TombolDarkness,3));
		
		Centered.setBackground(TombolLightness);
		FormLogin.setBackground(TombolLightness);
		Space.setBackground(TombolLightness);
		KiriCentered.setBackground(TombolLightness);
		
		topLoginPanel.setBorder(new LineBorder(TombolLightness,10));
		
		Centered.add(KiriCentered,BorderLayout.WEST);
		Centered.add(FormLogin,BorderLayout.CENTER);
		Centered.add(Space,BorderLayout.EAST);
		
		topLoginPanel.add(Space,BorderLayout.WEST);
		topLoginPanel.add(Centered,BorderLayout.CENTER);
		
		loginPanel.add(topLoginPanel,BorderLayout.NORTH);
	}
	public void createRightLoginPanel() {
		eastLoginPanel = new JPanel();
		eastLoginPanel.setBackground(DefaultColor);
		
		JPanel Center = new JPanel();
		Center.setLayout(new BorderLayout());
		
		JPanel isi = new JPanel();
		isi.setLayout(new GridLayout(15,1));
		
		JLabel Judul =new JLabel("Create New Account");
		Judul.setFont(FontImportant);
		
		JPanel Panellabel = new JPanel(new GridLayout(1,2));
		Panellabel.add(new JLabel("First Name"));
		Panellabel.add(new JLabel("Surname"));
		
		JPanel Panelnama = new JPanel(new GridLayout(1,2));
		firstNameTF = new JTextField();
		firstNameTF.setFont(DefaultFontSmall);
		firstNameTF.setBorder(new LineBorder(TombolLightness,2));
		Panelnama.add(firstNameTF);
		
		SurnameTF = new JTextField();
		SurnameTF.setFont(DefaultFontSmall);
		SurnameTF.setBorder(new LineBorder(TombolLightness,2));
		Panelnama.add(SurnameTF);
		
		EmailTF = new JTextField();
		EmailTF.setFont(DefaultFontSmall);
		EmailTF.setBorder(new LineBorder(TombolLightness,2));
		
		newPasswordTF = new JTextField();
		newPasswordTF.setFont(DefaultFontSmall);
		newPasswordTF.setBorder(new LineBorder(TombolLightness,2));
		
		JPanel PanelIsitanggal = new JPanel( new GridLayout(1,6));
		PanelIsitanggal.setBorder(new LineBorder(TombolLightness,3));
		
		JComboBox<String> hariCB = new JComboBox<String>(dayText);
		hariCB.setMaximumRowCount(7);
		hariCB.setBorder(new LineBorder(TombolLightness,2));
		hariCB.setBackground(Color.WHITE);
		hariCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent a) {
				if(a.getStateChange()==ItemEvent.DESELECTED) {
					int day = 1;
					Date1 = day +hariCB.getSelectedIndex();
				}
			}
		});
		JComboBox<String> monthCB = new JComboBox<String>(MonthText);
		monthCB.setMaximumRowCount(7);
		monthCB.setBorder(new LineBorder(TombolLightness,2));
		monthCB.setBackground(Color.WHITE);
		monthCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent a) {
				if(a.getStateChange()==ItemEvent.DESELECTED) {
					int month = 1;
					Date2 = month + monthCB.getSelectedIndex();
				}
			}
		});
		
		JComboBox<String> yearCB = new JComboBox<String>(yearText);
		yearCB.setMaximumRowCount(7);
		yearCB.setBorder(new LineBorder(TombolLightness,2));
		yearCB.setBackground(Color.WHITE);
		yearCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent a) {
				if(a.getStateChange()==ItemEvent.DESELECTED) {
					int firstyear = 1980;
					Date3 = firstyear + yearCB.getSelectedIndex();
					}	
				}
		});
		
		JLabel text1 = new JLabel("Day");
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel text2 = new JLabel("Month");
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel text3 = new JLabel("Year");
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		PanelIsitanggal.add(text1);
		PanelIsitanggal.add(hariCB);
		PanelIsitanggal.add(text2);
		PanelIsitanggal.add(monthCB);
		PanelIsitanggal.add(text3);
		PanelIsitanggal.add(yearCB);
		PanelIsitanggal.setBorder(new LineBorder(DefaultColor,5));
		
		JPanel gender = new JPanel(new GridLayout(1,2));
		lakilaki = new JRadioButton("Male",false);
		perempuan = new JRadioButton("Female",false);
	    
	    gender.add(lakilaki);
	    gender.add(perempuan);
	    
	    signUpBTN = new JButton("Sign Up");
	    signUpBTN.setFont(DefaultFontSmall);
	    signUpBTN.setBorder(new LineBorder(TombolLightness,2));
	    signUpBTN.setBackground(TombolLightness);
	    
	    AddresTF = new JTextField();
	    AddresTF.setFont(DefaultFontSmall);
	    AddresTF.setBorder(new LineBorder(TombolLightness,2));
		
	    isi.add(Judul);
		isi.add(Panellabel);
		isi.add(Panelnama);
		isi.add(new JLabel("Email or Phone"));
		isi.add(EmailTF);
		isi.add(new JLabel("Password"));
		isi.add(newPasswordTF);
		isi.add(new JLabel("Birthday"));
		isi.add(PanelIsitanggal);
		isi.add(new JLabel("Address"));
		isi.add(AddresTF);
		isi.add(gender);
		isi.add(signUpBTN);
		
		 signUpBTN.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e) {
		    		if ((!firstNameTF.getText().equals(""))&&(!SurnameTF.getText().equals(""))&&(!EmailTF.getText().equals(""))&&(!newPasswordTF.getText().equals(""))) {
		    		Orang orang = new Orang();
		    		String namadepan = firstNameTF.getText();
		    		String namabelakang = SurnameTF.getText();
		    		String email = EmailTF.getText();
		    		String password = newPasswordTF.getText();
		    		String Kelamin =  null;
		    		String IDUser = getNewIDUser();
		    		
		    		if 		 (lakilaki.isSelected()) {
		    			Kelamin = "Male";
		    		}else if (perempuan.isSelected()) {
		    			Kelamin = "Female";
		    		}else
		    			Kelamin = "Unknown";
		    		
		    		String alamat = AddresTF.getText(); 
		    		orang.setAlamatOrang(alamat);
		    		orang.setEmail(email);
		    		orang.setJenisKelamin(Kelamin);
		    		orang.setPass(password);
		    		orang.setDay(Date1);
		    		orang.setMonth(Date2);
		    		orang.setYear(Date3);
		    		orang.setTanggalLahir();
		    		orang.setFirstName(namadepan);
		    		orang.setsurName(namabelakang);
		    		orang.setID(IDUser);
		    		
		    		AccountID.put(newPasswordTF.getText(), orang);
		    		JOptionPane.showMessageDialog(null," Account Has Been Created");
		    		}
		    		else {
		    			JOptionPane.showMessageDialog(null," Any filed is empty ");
		    		}
		    	}
		    });
		
		JPanel east = new JPanel();
		east.add(new JLabel("                                "));
		east.setBackground(DefaultColor);

		Center.add(isi,BorderLayout.CENTER);
		Center.add(east,BorderLayout.EAST);
		eastLoginPanel.add(Center);
	}
	public void createMainPanel() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		createTopMainPanel();
		createContentPanel();
		createAccountPanel();
		SwitchPanel = new JPanel(new CardLayout());
		SwitchPanel.add(contentMainPanel,"contentMainPanel");
		SwitchPanel.add(accountMainPanel,"accountMainPanel");
		mainPanel.add(SwitchPanel,BorderLayout.CENTER);
	}
	public void createAccountPanel() {
		accountMainPanel = new JPanel(new GridLayout(1,3));
		paneltengahaccount = new JPanel(new CardLayout());
		JPanel panelkiri = new JPanel();
		JPanel panelkanan= new JPanel();
		createPaneldicari();
		paneltengahaccount.add(accountPanel,"accountPanel");
		accountMainPanel.add(panelkiri);
		accountMainPanel.add(paneltengahaccount);
		accountMainPanel.add(panelkanan);
	}
	public void createPaneldicari() {
		accountPanel= new JPanel(new GridLayout(10,2));
		JLabel label1 = new JLabel("Name     : ");
		label1.setForeground(TombolDarkness);
		label1.setFont(DefaultFont);
		JLabel label2 = new JLabel("E-Mail   : ");
		label2.setForeground(TombolDarkness);
		label2.setFont(DefaultFont);
		JLabel label3 = new JLabel("Addres   : ");
		label3.setForeground(TombolDarkness);
		label3.setFont(DefaultFont);
		JLabel label4 = new JLabel("Birthday : ");
		label4.setForeground(TombolDarkness);
		label4.setFont(DefaultFont);
		JLabel label5 = new JLabel("Gender   : ");
		label5.setForeground(TombolDarkness);
		label5.setFont(DefaultFont);
		for (String a : AccountID.keySet()) {
			Orang orang1 = AccountID.get(a);
			String PasswordID = orang1.getPass();
			if ((orang1.getEmail()).equals(SearchID)||(orang1.getFirstName()+orang1.getSurName()).equalsIgnoreCase(SearchID)||(orang1.getFirstName()+" "+orang1.getSurName()).equalsIgnoreCase(SearchID)||(orang1.getFirstName()).equalsIgnoreCase(SearchID)||(orang1.getSurName()).equalsIgnoreCase(SearchID)){
				dicari = AccountID.get(PasswordID); 
				System.out.println(dicari.idOrang + " " +dicari.firstName);
				
				/**
				this.namadicari = dicari.firstName+" "+dicari.surName;
				this.emaildicari = dicari.email;
				this.tanggaldicari = dicari.tanggalLahir;
				this.alamatdicari = dicari.getAlamatOrang();
				this.kelamindicari = dicari.getJenisKelamin();
				*/
				namadicariL = new JLabel();
				emaildicariL = new JLabel();
				alamatdicariL = new JLabel();
				tanggaldicariL = new JLabel();
				genderdicariL = new JLabel();
				
				namadicariL.setFont(DefaultFont);
				emaildicariL.setFont(DefaultFont);;
				alamatdicariL.setFont(DefaultFont);
				tanggaldicariL.setFont(DefaultFont);
				genderdicariL.setFont(DefaultFont);
				
				namadicariL.setForeground(TombolDarkness);
				emaildicariL.setForeground(TombolDarkness);
				alamatdicariL.setForeground(TombolDarkness);
				tanggaldicariL.setForeground(TombolDarkness);
				genderdicariL.setForeground(TombolDarkness);
			    
				namadicariL.setText(dicari.getFirstName()+ " " + dicari.getSurName());
				emaildicariL.setText(dicari.getEmail());
				alamatdicariL.setText(dicari.getAlamatOrang());
				tanggaldicariL.setText(dicari.getDay() + " "+ dicari.getMonth()+" "+dicari.getYear());
				genderdicariL.setText(dicari.getJenisKelamin());
				
				addfriendBTN = new JButton("Add");
				addfriendBTN.setBackground(TombolLightness);
				addfriendBTN.setForeground(TombolDarkness);
				addfriendBTN.setBorder(new LineBorder(TombolDarkness,3));
				addfriendBTN.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent a) {
						String pass = passwordTF.getText();
						CardLayout  cl  =  (CardLayout)  SwitchPanel.getLayout();
						CardLayout  addpanelfriend  =  (CardLayout)  panel3.getLayout();
						for (String b : AccountID.keySet()) {
							if (AccountID.containsKey(pass)) {
								Orang orang = AccountID.get(b);
								if ((orang.getEmail()).equals(namaTF.getText())) {
									ObjekPengguna = AccountID.get(b);
									ObjekPengguna.IDteman.add(dicari.getFirstName() +" "+ dicari.surName );
									System.out.println(ObjekPengguna.getFirstName() + dicari.getFirstName());
									JOptionPane.showMessageDialog(mainPanel,"Add friend has been succesed" );
									createFriendPanel();
									panel3.add(friendPanel,"friendPanel");
									addpanelfriend.show(panel3,"friendPanel");
									searchBTN.setText("Search");
									cl.show(SwitchPanel,  "contentMainPanel");
								}
							}else {
								JOptionPane.showMessageDialog(mainPanel,"gagal mengambil pengguna");
							}
						}
					}
				});
				
				label1.setHorizontalAlignment(SwingConstants.CENTER);
				label2.setHorizontalAlignment(SwingConstants.CENTER);
				label3.setHorizontalAlignment(SwingConstants.CENTER);
				label4.setHorizontalAlignment(SwingConstants.CENTER);
				label5.setHorizontalAlignment(SwingConstants.CENTER);
				accountPanel.add(label1);
				accountPanel.add(namadicariL);
				
				accountPanel.add(label2);
				accountPanel.add(emaildicariL);
				
				accountPanel.add(label3);
				accountPanel.add(alamatdicariL);

				accountPanel.add(label4);
				accountPanel.add(tanggaldicariL);
				
				accountPanel.add(label5);
				accountPanel.add(genderdicariL);
				
				accountPanel.add(new JLabel(""));
				accountPanel.add(addfriendBTN);
				accountPanel.setBackground(DefaultColor);
			}
		}	
	
	}
	public void createFriendPanel() {
		JLabel judul = new JLabel("Friend List");
		friendPanel =  new JPanel(new GridLayout(15,2));
		friendPanel.add(judul);
		judul.setForeground(TombolDarkness);
		JPanel closecount = new JPanel(new BorderLayout());
		String pass = passwordTF.getText();
		for (String a : AccountID.keySet()) {
			if (AccountID.containsKey(pass)) {
				ObjekPengguna = AccountID.get(a);
				Orang ini = AccountID.get(ObjekPengguna.getPass());
				if ((ObjekPengguna.getEmail()).equals(namaTF.getText())) {
					 int banyaknya  = ini.IDteman.size(); 
					 closecount.add(judul,BorderLayout.CENTER);
					 JLabel iterasi = new JLabel("( "+Integer.toString(banyaknya)+" )                                               ");
					 iterasi.setForeground(TombolDarkness);
					 closecount.add(iterasi,BorderLayout.EAST);
					 friendPanel.add(closecount);
					 for(int i = 0 ;i <banyaknya ; i++) {
						 JButton Friend = new JButton();
						 Friend.setEnabled(false);
						 Friend.setBackground(TombolLightness);
						 Friend.setBorder(new LineBorder(listColor,3));
						 
						 JLabel nama = new JLabel();
						 nama.setHorizontalAlignment(SwingConstants.LEFT);
						 
						 JButton Friend1 = new JButton();
						 Friend1.setEnabled(false);
						 Friend1.setBackground(TombolLightness);
						 Friend1.setBorder(new LineBorder(listColor,3));
						 
						 JLabel tanggal = new JLabel(ini.IDteman.get(i));
						 tanggal.setHorizontalAlignment(SwingConstants.RIGHT);
						 Friend.add(tanggal);
							 
						 Friend1.add(nama);
						 
						 JPanel samainnamaborder = new JPanel(new BorderLayout());
						 samainnamaborder.add(Friend,BorderLayout.CENTER);
						 
						 
						 JPanel samainborder = new JPanel(new BorderLayout());
						 samainborder.add(samainnamaborder,BorderLayout.CENTER);
						 samainborder.add(new JLabel("                                              "),BorderLayout.EAST);
						 
						 friendPanel.add(samainborder);
						 System.out.print(ini.IDteman.get(i));
					 }
				}
			}
		}
		panel3.add(friendPanel,"friendPanel");
	}
	
	
	public void createContentPanel() {
		contentMainPanel = new JPanel (new GridLayout(1,3));
		JPanel panel1= new JPanel(new GridLayout(15,2));
		String nama = namaTF.getText();
		String pass = passwordTF.getText();
		for (String a : AccountID.keySet()) {
			if (AccountID.containsKey(pass)) {
				ObjekPengguna = AccountID.get(a);
				Orang ini = AccountID.get(ObjekPengguna.getPass());
				if ((ObjekPengguna.getEmail()).equals(nama)) {
					JLabel label1 = new JLabel(ini.firstName+ " ");
					JLabel label2 = new JLabel("E-Mail     : ");
					label2.setForeground(TombolDarkness);
					
					JLabel label3 = new JLabel("Addres   : ");
					label3.setForeground(TombolDarkness);
					
					JLabel label4 = new JLabel("Birthday : ");
					
					label4.setForeground(TombolDarkness);
					JLabel label5 = new JLabel("Gender   : ");
					
					label5.setForeground(TombolDarkness);
					JLabel identity = new JLabel(ini.surName);
					identity.setFont(new Font("Arial",Font.BOLD,20));
					identity.setForeground(TombolDarkness);
					label1.setHorizontalAlignment(SwingConstants.RIGHT);
					label1.setFont(new Font("Arial",Font.BOLD,20));
					label1.setForeground(TombolDarkness);
					
					label2.setHorizontalAlignment(SwingConstants.RIGHT);
					label3.setHorizontalAlignment(SwingConstants.RIGHT);
					label4.setHorizontalAlignment(SwingConstants.RIGHT);
					label5.setHorizontalAlignment(SwingConstants.RIGHT);
					panel1.add(label1);
					panel1.add(identity);
					panel1.add(label2);
					JLabel email1 = new JLabel(ini.getEmail());
					email1.setForeground(TombolDarkness);
					
					panel1.add(email1);
					
					panel1.add(label3);
					JLabel alamat1 = new JLabel(ini.getAlamatOrang());
					alamat1.setForeground(TombolDarkness);
					panel1.add(alamat1);
					
					panel1.add(label4);
						JLabel tanggalLahir1 =new JLabel(ini.getDay()+ " "+ini.getMonth()+" "+ini.getYear());
					tanggalLahir1.setForeground(TombolDarkness);
					panel1.add(tanggalLahir1);
					
					panel1.add(label5);
					JLabel kelamin1 = new JLabel(ini.getJenisKelamin());
					kelamin1.setForeground(TombolDarkness);
					panel1.add(kelamin1);
					
					panel1.add(new JLabel(""));
					panel1.add(new JLabel(""));
					panel1.add(new JLabel(""));
					panel1.add(new JLabel(""));
					panel1.add(new JLabel(""));
					panel1.add(new JLabel(""));
					panel1.add(new JLabel(""));
					panel1.add(new JLabel(""));
					panel1.setBackground(DefaultColor);
					
					panel2 = new JPanel();
					panel2.setLayout(new GridLayout(10,1));
					
					JPanel chat = new JPanel(new BorderLayout());
					MyStatusTA = new JTextArea();
					MyStatusTA.setFont(DefaultFontSmall);
					
					chatBTN = new JButton("Send");
					chatBTN.addActionListener(this);
					chatBTN.setBackground(TombolLightness);
					chatBTN.setBorder(new LineBorder((TombolLightness),3));
				
					chat.add(MyStatusTA,BorderLayout.CENTER);
					chat.add(chatBTN,BorderLayout.EAST);
					chat.setBorder(new LineBorder(TombolLightness,3));
					
					JPanel gatechat = new JPanel(new BorderLayout());
					gatechat.add(chat,BorderLayout.CENTER);
					gatechat.add(new JPanel(),BorderLayout.SOUTH);
					
					panelPesan = new JPanel(new BorderLayout());
					panelPesan.setBackground(TombolLightness);
					contentMainPanel.add(panel1);
					panelPesan.add(gatechat,BorderLayout.NORTH);
					panelPesan.add(panel2,BorderLayout.CENTER);
					
					panel3 = new JPanel(new CardLayout());
					panel3.setBackground(DefaultColor);
					panel3.setBorder(new LineBorder(DefaultColor,10));
					
					createFriendPanel();
					contentMainPanel.add(panelPesan);
					contentMainPanel.add(panel3);
					contentMainPanel.setBorder(new LineBorder(DefaultColor,50));
				}
			}
		}
	}
	public void createTopMainPanel() { 
		JPanel TopPanel = new JPanel(new BorderLayout());
		JPanel TopContent = new JPanel(new GridLayout());
		TopContent.setBackground(TombolLightness);
		
		JPanel nameApp = new JPanel(new GridLayout(1,5));
		JLabel Appname = new JLabel("IDBook"); 
		
		Appname.setFont(new Font("Arial",Font.BOLD,20));
		nameApp.add(new JLabel(""));
		nameApp.add(new JLabel(""));
		nameApp.add(Appname);
		nameApp.add(new JLabel(""));
		nameApp.add(new JLabel(""));
		nameApp.setBackground(TombolLightness);
		
		JPanel SearchPerson = new JPanel(new BorderLayout());
		SearchTF = new JTextField();
		SearchTF.setColumns(20);
		SearchTF.setBorder(new LineBorder(Color.WHITE,3));
		SearchTF.setFont(DefaultFontSmall);
		SearchTF.setForeground(TombolDarkness);
		SearchID =SearchTF.getText();
		
		SearchPerson.add(SearchTF,BorderLayout.CENTER);
		searchBTN = new JButton("Search");
		searchBTN.setForeground(TombolLightness);
		searchBTN.setBackground(TombolDarkness);
		searchBTN.addActionListener(this);	
		
		SearchPerson.add(searchBTN,BorderLayout.EAST);
		SearchPerson.setBackground(TombolLightness);
		SearchPerson.setBorder(new LineBorder(TombolDarkness,3));
		
		JPanel IconAccount = new JPanel(new GridLayout(1,5));
		IconAccount.setBackground(TombolLightness);
		IDpass = passwordTF.getText();
		
		JButton Logout = new JButton("logout");
		Logout.addActionListener(this);
		Logout.setForeground(TombolLightness);
		Logout.setBackground(TombolDarkness);
		Logout.setBorder(new LineBorder(TombolDarkness,2));
		
		IconAccount.add(new JLabel(""));
		IconAccount.add(new JLabel(""));
		IconAccount.add(Logout);
		IconAccount.add(new JLabel(""));
		IconAccount.add(new JLabel(""));
		
		JPanel Right = new JPanel();
		Right.add(new JLabel("                     "));
		JPanel Left = new JPanel();
		Left.add(new JLabel("                     "));
		
		TopContent.add(nameApp);
		TopContent.add(SearchPerson);
		TopContent.add(IconAccount);
		
		TopPanel.add(TopContent);
		TopPanel.setBackground(TombolLightness);
		TopPanel.setBorder(new LineBorder(TombolLightness,10));
		mainPanel.add(TopPanel,BorderLayout.NORTH);
		
	}
	public void createLogoutPanel() {
		logoutPanel = new JPanel(new BorderLayout());
        JPanel Center = new JPanel(new BorderLayout());
		
		JLabel Confirmtext = new JLabel("Are You Sure ?");
		Confirmtext.setBorder(new LineBorder(DefaultColor,25));
		Confirmtext.setForeground(TombolDarkness);
		Confirmtext.setBackground(TombolDarkness);
		Confirmtext.setPreferredSize(new Dimension(40,70));
		
		JButton Yes = new JButton("Yes");
		JButton No = new JButton("No");
		Yes.setBackground(TombolDarkness);
		Yes.setForeground(TombolLightness);
		Yes.setBorder(new LineBorder(DefaultColor,2));
		
		No.setBackground(TombolDarkness);
		No.setForeground(TombolLightness);
		No.setBorder(new LineBorder(DefaultColor,2));
		
		Confirmtext.setFont(new Font("Arial",Font.BOLD,20));
		Confirmtext.setHorizontalAlignment(SwingConstants.CENTER);
		
		Yes.setFont(new Font("Arial",Font.BOLD,20));
		No.setFont(new Font("Arial",Font.BOLD,20));
		
		Yes.addActionListener(this);
		No.addActionListener(this);
		JPanel ConfirmButton = new JPanel(new GridLayout(1,2));
		JPanel Right = new JPanel(new GridLayout(1,1));
		JPanel Left = new JPanel(new GridLayout(1,1));
		Yes.setPreferredSize(new Dimension(40,70));
		No.setPreferredSize(new Dimension(40,70));
		
		Right.add(Yes);
		Left.add(No);
		Right.setPreferredSize(new Dimension(40,70));
		Left.setPreferredSize(new Dimension(40,70));
		
		ConfirmButton.add(Right);
		ConfirmButton.add(Left);
		
		Center.add(Confirmtext,BorderLayout.NORTH);
		Center.add(ConfirmButton,BorderLayout.CENTER);
		
		logoutPanel.add(Center,BorderLayout.CENTER);
		logoutPanel.setBorder(new LineBorder(DefaultColor,300));
	}
	public void actionPerformed(ActionEvent Event) {
		String tombol= Event.getActionCommand();
		
		if (tombol.equals("Login")) {
			if((!passwordTF.getText().equals(""))||(!namaTF.getText().equals("")) ) {
				String pass = passwordTF.getText();
				for (String a : AccountID.keySet()) {
					if (AccountID.containsKey(pass)) {
						Orang orang = AccountID.get(a);
						String param = orang.pass;
						Orang ini = AccountID.get(param);
						if ((orang.getEmail()).equals(namaTF.getText())) {
							CardLayout  cl  =  (CardLayout)  Panel.getLayout();
							createMainPanel();
							this.NamaPengguna = ini.getFirstName()+" "+ini.getSurName();
							this.IDuser = ini.getID();
							this.IDpass = ini.getPass();
							this.SearchID = "";
							Panel.add(mainPanel,  "mainPanel");
							cl.show(Panel,  "mainPanel");
							setTitle("IDBook "+ NamaPengguna);
						}
					}//else //{
						//if (namaTF.getText().equalsIgnoreCase(null)){
						//		JOptionPane.showMessageDialog(null, "Password must entered");
						//	}else 
						//		JOptionPane.showMessageDialog(null, "Email not found");
						//}
					}
				}else {
					JOptionPane.showMessageDialog(this, "Field Login is Empty");
				}
			}
		else if(tombol.equals("Yes")) {
				CardLayout  cl  =  (CardLayout)  Panel.getLayout();
				cl.show(Panel,  "loginPanel");
				NamaPengguna="";
				IDuser="";
				setTitle("IDBook");
			}
		else if(tombol.equalsIgnoreCase("No")) {
				CardLayout  cl  =  (CardLayout)  Panel.getLayout();
				cl.show(Panel,  "mainPanel");
			}
		else if(tombol.equalsIgnoreCase("logout")) {
				CardLayout  cl  =  (CardLayout)  Panel.getLayout();
				cl.show(Panel,  "logoutPanel");
			}
		else if (tombol.equalsIgnoreCase("Search")) {
				CardLayout  cl  =  (CardLayout)  SwitchPanel.getLayout();
				CardLayout  dicariaccount  =  (CardLayout)  paneltengahaccount.getLayout();
				Orang orang1 =new Orang();
				if(!SearchTF.getText().equals("")) {
					this.SearchID =SearchTF.getText();
					for (String a : AccountID.keySet()) {
						orang1 = AccountID.get(a);
						String PasswordID = orang1.getPass();
						if ((orang1.getEmail()).equals(SearchID)||(orang1.getFirstName()+orang1.getSurName()).equalsIgnoreCase(SearchID)||(orang1.getFirstName()+" "+orang1.getSurName()).equalsIgnoreCase(SearchID)||(orang1.getFirstName()).equalsIgnoreCase(SearchID)||(orang1.getSurName()).equalsIgnoreCase(SearchID)){
							dicari = AccountID.get(PasswordID); 
							System.out.println(dicari.idOrang + " " +dicari.firstName);
							this.namadicari = dicari.firstName+" "+dicari.surName;
							this.emaildicari = dicari.email;
							this.tanggaldicari = dicari.tanggalLahir;
							this.alamatdicari = dicari.getAlamatOrang();
							this.kelamindicari = dicari.getJenisKelamin();
						}
					}
					createPaneldicari();
					paneltengahaccount.add(accountPanel,"accountPanel");			
					dicariaccount.show(paneltengahaccount, "accountPanel");
					cl.show(SwitchPanel,  "accountMainPanel");
					searchBTN.setText("Back");
			
				}
			}
		else if (tombol.equalsIgnoreCase("Back")) {
				CardLayout  cl  =  (CardLayout)  SwitchPanel.getLayout();
				this.SearchID="";
				createPaneldicari();
				cl.show(SwitchPanel,  "contentMainPanel");
				searchBTN.setText("Search");
		}else if(tombol.equalsIgnoreCase("Send")) {
				Pesan a = new Pesan();
				Orang b = new Orang();
				Pesan c = new Pesan();
				//init
				String textpesan = MyStatusTA.getText();
				a.setChat(textpesan);
				String pass = passwordTF.getText();
				if (textpesan!="") {
					for (String cari : AccountID.keySet()) {
						if (AccountID.containsKey(pass)) {
						    b = AccountID.get(cari);}
							a.setID(getIDPSN());
							a.setChat(textpesan);
							a.setidOrang(b.idOrang);
							ChatID.put(getIDPSN(),a);
						}
					}
					createChatPanel();
					MyStatusTA.setText("");
				}
	}
	public void  createChatPanel() {
		JPanel newPanel = new JPanel(new BorderLayout());
		Pesan a = new Pesan();
		Orang b = new Orang();
		Pesan c = new Pesan();
		//init
		newPanel.setBorder(new LineBorder(TombolLightness,2));
		String textpesan = MyStatusTA.getText();
		a.setChat(textpesan);
			for(String cariOrang : AccountID.keySet()) {
				if(AccountID.containsKey(IDpass)) {
					b = AccountID.get(cariOrang);
					a.setID(b.getID());
					if ((b.getEmail()).equals(namaTF.getText())) {
			
					ChatID.put(getIDPSN(),a);
					c=ChatID.get(IDPesan);
					JLabel labelnama = new  JLabel(b.firstName+" "+b.surName);
					JButton name = new JButton();
					name.setEnabled(false);
					name.setBackground(TombolDarkness);
					name.setForeground(Color.BLACK);
					name.add(labelnama);
					labelnama.setHorizontalAlignment(SwingConstants.LEFT);
					
					name.setBorder(new LineBorder(TombolDarkness,2));
					newPanel.add(name,BorderLayout.NORTH);
					JLabel contentchat =new JLabel("           "+c.Chat);
					contentchat.setForeground(TombolDarkness);
					newPanel.add(contentchat,BorderLayout.CENTER);
					newPanel.setForeground(TombolLightness);
					JButton Addme= new JButton(Integer.toString(c.Like));
					Addme.setForeground(TombolDarkness);
					Addme.setBackground(TombolLightness);
					Addme.setBorder(new LineBorder(TombolLightness,1));
					Addme.setPreferredSize(new Dimension(30,30));
				
					Addme.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							JButton state = (JButton) a.getSource();
							Integer startState = Integer.parseInt(state.getText()); 
							Integer count = startState + 1;
							Pesan c = new Pesan();
							for(String cariPesan : ChatID.keySet()) {
								if(ChatID.containsKey(IDPesan)) {
									c=ChatID.get(cariPesan);
									String Hasil = Integer.toString(count);
									state.setText(Hasil);
									c.addLike();
								}
							}
						}
					});
					newPanel.add(Addme,BorderLayout.EAST);
				}
			}
		}
		panel2.add(newPanel);
	}
	public void  CreateIDUser() {
		this.IDnumber = this.IDnumber +1;
		String a = this.user + Integer.toString(IDnumber);
		this.IDuser = a;
	}
	public String getNewIDUser() {
		CreateIDUser();
		return this. IDuser;
	}
	public void  CreateIDPSN() {
		this.NoPesan = this.NoPesan +1;
		String a = this.chat + Integer.toString(NoPesan);
		this.IDPesan = a;
	}
	public String getIDPSN() {
		CreateIDPSN();
		return this.IDPesan;
	}
	public String getNamaUser() {
		return this.NamaPengguna;
	}
	public static  void main(String[]args) {
		MainPanel a = new MainPanel();
		a.setVisible(true);
		
	}
}