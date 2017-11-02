import java.io.Serializable;

public class AccountRecordSerializable implements Serializable
{
	private int account;
	private String fName;
	private String lNmae;
	private double balance;
	public AccountRecordSerializable()
	{
		this(0,"" ,"",0.0);
	}

	public AccountRecordSerializable(int i, String s1, String s2, double d) {
		setAccount(i);
		setfName(s1);
		setlNmae(s2);
		setBalance(d);
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

	public String getlNmae() {
		return lNmae;
	}

	public void setlNmae(String lNmae) {
		this.lNmae = lNmae;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
