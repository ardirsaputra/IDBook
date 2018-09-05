
public class Pesan {
	String IDPesan;
	String Chat;
	int Like;
	String idOrang;
	public Pesan () {
		this.IDPesan = "";
		this.Chat = "";
		this.Like =0;
		this.idOrang="";
	}
	public void setChat(String a) {
		this.Chat = a;
	}
	public void setID(String a) {
		this.IDPesan = a;
	}
	public void setidOrang(String a) {
		this.idOrang = a;
	}
	
	public void addLike() {
		this.Like = this.Like + 1;
	}
	public Integer getLike() {
		return this.Like;
	}
}
