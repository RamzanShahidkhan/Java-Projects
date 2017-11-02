package file;

public class AccountRecord {
	private int account;
	private String fName;
	private String lName;
	private double balance;
	
	public AccountRecord()
	{
		this(0,"", "",0.0);//call 4 arguments constructor
	}
    public AccountRecord(int i, String first, String last, double bal)
    {
		setAccount(i);
		setfName(first);
		setlName(last);
		setBalance(bal);
	}


	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
