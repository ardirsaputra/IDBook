import java.util.ArrayList;

public class Orang {
	//atribute
	String surName ,alamatOrang,jenisKelamin,tanggalLahir,email,idOrang,pass,firstName;
	int day,month,year;
	ArrayList<String> IDteman = new ArrayList<String>();
	//constructor
	public Orang () {
		this.idOrang="";
		this.firstName = "";
		this.surName = "";
		this.email = "";
		this.day=0;
		this.month = 0;
		this.year = 0;
		this.alamatOrang = "";
		this.jenisKelamin = "";
		this.pass = "";
	}
	public Orang (String id,String first,String nama,String email,String pass,String alamat,String Kelamin,int day,int month,int year) {
		this.idOrang=id;
		this.firstName = first;
		this.surName = nama;
		this.email = email;
		
		this.day=day;
		this.month =month;
		this.year = year;
		toBirthFormat();
		setTanggalLahir();
		this.alamatOrang = alamat;
		this.jenisKelamin = Kelamin;
		this.pass = pass;
	}
	//functions
	public String  getFirstName() {				return this.firstName;}
	public String  getSurName() {				return this.surName;}
	public String  getAlamatOrang() {			return this.alamatOrang;}
	public String  getJenisKelamin() {			return this.jenisKelamin;}
	public String  getEmail() { 				return this.email;}
	public String  getID() {    				return this.idOrang;}
	public String  getPass() {    				return this.pass;}
	
	public void setDay(int a) {  				this.day=a;}
	public void setMonth(int a) {				this.month=a;}
	public void setYear(int a) {				this.year=a;}
	
	public int getDay() {						return this.day;}
	public int getMonth() {						return this.month;}
	public int getYear() {						return this.year;}
	
	public void  setFirstName(String ref) {		this.firstName = ref;}
	public void  setsurName(String ref) {		this.surName = ref;}
	public void  setEmail(String ref) {			this.email = ref;}
	public void  setAlamatOrang(String ref) {	this.alamatOrang = ref;}
	public void  setJenisKelamin(String ref) {	this.jenisKelamin = ref;}
	public void  setTanggalLahir() {	        this.tanggalLahir = toBirthFormat();}
	public void  setID(String ref) {            this.idOrang = ref;}
	public void  setPass(String ref) {          this.pass = ref;}
	
	
	public void  setDefaultAlamatOrang() {		this.alamatOrang = "";}
	public void  setDefaultJenisKelamin() {		this.jenisKelamin = "";}
	public void  setDefaultfirstName() {			this.firstName = "";}
	public void  setDefaultsurName() {			this.surName = "";}
	public void  setDefaultEmail() {			this.email = "";}
	public void  setDefaultTanggalLahir() {		this.tanggalLahir = "01/01/1900";}
	public void  setDefaultPass() {				this.tanggalLahir = "root";}
	
	public String toBirthFormat() {
		int a = getDay();
		int b = getMonth();
		int c = getYear();
		String bulan = "";
		if ((a<1) ||(a>31)) {
			a = 00;
		}
		if ((b<1) ||(b>12)) {
			   switch (b) {
			      case 1 : bulan ="Januari ";
			         break;
			      case 2:  bulan = "Febuari";
			         break;
			      case 3:  bulan = "Maret ";
			         break;
			      case 4:  bulan = "April ";
			         break;
			      case 5:  bulan = "Mei ";
			         break;
			      case 6 : bulan = "Juni ";
			         break;
			      case 7:  bulan = "Juli ";
			         break;
			      case 8 : bulan = "Agustus ";
			         break;
			      case 9:  bulan = "September ";
			        break;
			      case 10:  bulan = "Oktober ";
			        break;
			      case 11: bulan = "Novemver ";
			        break;
			      case 12: bulan = "Desember ";
			        break;
			    }	 
		}
		
		if ((c<1930) ||(c>2108)) {
			c = 0000;
		}
		String jadi = Integer.toString(a) + " "+bulan +" "+c;
		return jadi;
	}
}