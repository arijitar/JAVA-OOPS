package ObjectOrientedProgramming;

class product{
	private String itemNo;
    private String name;
    private double price;
    private long qty;
	
	public product(String itemno, String name) {
		itemNo=itemno;
		this.name=name;
	}
	public product(String itemno, String name, double price, short qty) {
		itemNo=itemno;
        this.name=name;
		setprice(price);
		setqty(qty);
	}
	public String getitemno() {
		return itemNo;
	}
	public String getname() {
		return name;
	}
	public double getprice() {
		return price;
	}
	public long getqty() {
		return qty;
	}
	
	public void setprice(double price) {
		this.price=price;
	}
	public void setqty(long qty) {
		this.qty=qty;
	}
	
}
class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.name=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.name=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}
public  class ProductCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      product P = new product("A52-Ns","Dove");
      Customer C = new Customer("4100701405","Arijit");
      P.setprice(130);
      P.setqty(10000);
      System.out.println("ItemNo:"+P.getitemno());
      System.out.println("Name:"+P.getname());
      System.out.println("price:"+P.getprice());
      System.out.println("Qty:"+P.getqty());
      C.setAddress("158 A.C Road bylane 9");
      C.setPhno("7699719732");
      System.out.println("CustId:"+C.getCustId());
      System.out.println("Name:"+C.getName());
      System.out.println("Address:"+C.getAddress());
      System.out.println("PhnNo:"+C.getPhno());
	}

}
