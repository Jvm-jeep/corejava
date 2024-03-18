package java8;

public class Books {
	private int bookid;
	private String bookName;
	private String AuthNAme;
	private int prize;
	

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Books(int bookid, String bookName, String authNAme, int prize) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		AuthNAme = authNAme;
		this.prize = prize;
	}


	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookName=" + bookName + ", AuthNAme=" + AuthNAme + ", prize=" + prize
				+ "]";
	}


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthNAme() {
		return AuthNAme;
	}


	public void setAuthNAme(String authNAme) {
		AuthNAme = authNAme;
	}


	public int getPrize() {
		return prize;
	}


	public void setPrize(int prize) {
		this.prize = prize;
	}


	public static void main(String[] args) {
		

	}

}
