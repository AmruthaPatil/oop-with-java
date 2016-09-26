package in.ac.kletech.RetailShop;

public class PurchaseBill {
	
	private int iBillID;
	private int iQuantity;
	private double dBillAmt;
	
	public PurchaseBill(int iBillID,int iQuantity) {
		this.iBillID=iBillID;
		this.iQuantity=iQuantity;
	}
	
	ItemDetails item=new ItemDetails(1002);
	
	void calculateBill(){
		if(iQuantity<=0 || iQuantity>=5)
			System.out.println("cannot process so many items. Please retry");
		else
		{
			dBillAmt=iQuantity*item.getdItemPrice();
			if(dBillAmt>=1000)
				dBillAmt=dBillAmt-dBillAmt*0.1;
			if(dBillAmt>=500)
				dBillAmt=dBillAmt-dBillAmt*0.05;
		}
	}
	
	void itemDetails(){
		System.out.println("bill id: "+iBillID);
		System.out.println("quantity of items: "+iQuantity);
		System.out.println("final bill: "+dBillAmt);
	}

	public int getiBillID() {
		return iBillID;
	}

	public int getiQuantity() {
		return iQuantity;
	}

	public double getdBillAmt() {
		return dBillAmt;
	}
	
	

}
