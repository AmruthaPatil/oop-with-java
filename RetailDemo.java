package in.ac.kletech.RetailShop;

public class RetailDemo {

	public static void main(String[] args) {
		Customer abc=new Customer(111, "amrutha", "vidhyanagar", 1023456789);
		if(abc.validateCustName()==true && abc.validateTelNo()==true){
			abc.display();
			PurchaseBill bill=new PurchaseBill(901,3);
			bill.calculateBill();
			bill.itemDetails();
		}

	}

}
