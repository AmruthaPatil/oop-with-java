package in.ac.kletech.RetailShop;

public class ItemDetails {
	
	private int iItemID;
	private double dItemPrice;
	
	public ItemDetails(int iItemID) {
		this.iItemID=iItemID;
		validatItemID(iItemID);
	}
	
	void validatItemID(int iItemID ){
		if(iItemID==1001)
			dItemPrice=150;
		else if(iItemID==1002)
			dItemPrice=200;
		else if(iItemID==1003)
			dItemPrice=350;
		else if(iItemID==1004)
			dItemPrice=450;
		else if(iItemID==1005)
			dItemPrice=500;
		else
			System.out.println("invalid item ID. Please recheck the items");
		System.out.println("item ID: "+iItemID);
		System.out.println("item price: "+dItemPrice);
	}

	public int getiItemID() {
		return iItemID;
	}

	public double getdItemPrice() {
		return dItemPrice;
	}
	
	

}
