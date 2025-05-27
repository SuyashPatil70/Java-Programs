class Bank{
	private int acountNo;
	private String bankName;
	private String branch;
	private String ifsc_code;
	private double balance;

	//setter
	public Bank setAccountNo(int acountNo)
	{
		this.acountNo=acountNo;
		return this;
	}
	public Bank setBankName(String bankName)
	{
		this.bankName=bankName;
		return this;
	}
	public Bank setBranch(String branch)
	{
		this.branch=branch;
		return this;
	}
	public Bank setIFSC_Code(String ifsc_code)
	{
		this.ifsc_code=ifsc_code;
		return this;
	}
	public Bank setBalance(double balance)
	{
		this.balance=balance;
		return this;
	}
	public int getAccountNo()
	{
		return acountNo;
	}
	public String getBankName()
	{
		return bankName;
	}
	public String getBranch()
	{
		return branch;
	}
	public String getIFSC_Code()
	{
		return ifsc_code;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "Bank[ACCOUNT NO:" + acountNo + ",BANK NAME:" + bankName + ",IFSC CODE: " + ifsc_code + " ,BRACH NAME: " + branch + " ,BALANCE: " + balance + "]";
	}
}