package in.ac.kletech.RetailShop;

public class Customer {
	
	private int iCustID;
	private String sCustName;
	private String sAddress;
	private long lTelNo;
	
	Customer(int iCustID,String sCustName,String sAddress,long lTelNo){
		this.iCustID=iCustID;
		this.lTelNo=lTelNo;
		this.sAddress=sAddress;
		this.sCustName=sCustName;
	}
	
	boolean validateCustName(){
		if(sCustName.length()>4 || sCustName.length()<20)
			return true;
		else 
			return false;
	}

	boolean validateTelNo(){
		if(lTelNo/1000000000>=1 || lTelNo/1000000000<=10)
			return true;
		else 
			return false;
	}
	
	void display(){
		System.out.println("customer id: "+iCustID);
		System.out.println("customer name: "+sCustName);
		System.out.println("address: "+sAddress);
		System.out.println("phone number: "+lTelNo);
	}
	
	public int getiCustID() {
		return iCustID;
	}
	public String getsCustName() {
		return sCustName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public long getlTelNo() {
		return lTelNo;
	}
	
	

}
