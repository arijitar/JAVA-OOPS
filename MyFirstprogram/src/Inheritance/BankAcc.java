package Inheritance;

class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected int balance;
    
    public Account(String acc,String name,String add,String phno,String dob,int bal)
    {
    	this.accNo=acc;
    	this.name=name;
    	this.address=add;
    	this.phno=phno;
    	this.dob=dob;
    	this.balance=bal;
    }

    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }

}
    class SavingsAccount extends Account
{
	
    public SavingsAccount(String acc, String name, String add, String phno, String dob, int bal) {
			super(acc, name, add, phno, dob, bal);
			System.out.print("\nSavingsACCNO:"+acc+"\nName:"+name+"\nAddress:"+add+"\nPhnNo:"+phno+"\nDOB:"+dob+"\nBalance:"+balance);
		}
	
	public void deposit(int x)
    {
        balance+=x;
    }
    public void withdraw(int y)
    {
        balance-=y;
        
    }
 
}

class LoanAccount extends Account
{
    public LoanAccount(String acc,String name,String add,String phno,String dob, int bal, int EMIAmt) {
    	super(acc, name, add,phno,dob,bal);
    	System.out.print("\nLoanACCNO:"+acc+"\nName:"+name+"\nAddress:"+add+"\nPhnNo:"+phno+"\nDOB:"+dob+"\nBalance:"+bal+"\nEMI Amount:"+EMIAmt);
    }
	
	public long payEMI(long amt)
    {
        return amt;
        	
    }
    public long repay(long amt)
    {
        	if(balance==amt)
            balance=0;
			return balance;
    }
//public String toString(String acc, String name, String add, String phno, String dob) {
//    	
//		return "\nLoan ACCNO:"+acc+"\nName:"+name+"\nAddress:"+add+"\nPhnNo:"+phno+"\nDOB:"+dob;
//    }
}

public class BankAcc{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	  SavingsAccount s = new SavingsAccount("36030125356","Arijit","158 A.C Road khagra","7699719732", "29/08/2002",100);
      
      System.out.println(s.balance);
    
      
      @SuppressWarnings("unused")
	LoanAccount l = new LoanAccount("4011617699","Arijit","158 bYlane 9 khagra","7699719732","29/08/2002",100000,1000);

      
    
	}

}
