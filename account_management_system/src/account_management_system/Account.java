package account_management_system;

public class Account {
	
	private String bankName;
	private long accountNo;
	private String accountHolder;
	private long balance;
	private String alias;
	
	
	
	
	public Account(String bankName, long accountNo, String accountHolder, long balance, String alias) {
		super();
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.alias = alias;
	}
	
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	

	
	
}
