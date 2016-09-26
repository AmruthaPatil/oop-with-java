package ac.in.kletech.pokemon;

public class Pokemon1 {
	private int iPokID;
	private String sPokName;
	private String sType;
	private int iInitialCP;
	private int iTotalMatches;
	private int iWon;
	private int iLost;
	private double iFinalCP;
	
	public Pokemon1( int iPokID,String sPokName,String sType,int iInitialCP,int iTotalMatches,int iWon,int iLost) {
		this.iInitialCP=iInitialCP;
		this.iLost=iLost;
		this.iPokID=iPokID;
		this.iWon=iWon;
		this.sPokName=sPokName;
		this.sType=sType;
		this.iTotalMatches=iTotalMatches;
	}
	
	double calPokeCP(){
		int tempCP;
		tempCP=iWon-iLost;
		if(tempCP>=0){
			if(tempCP>=1 && tempCP<=20)
				iFinalCP=((tempCP*0.1)+iInitialCP);
			if(tempCP>=21 && tempCP<=40)
				iFinalCP=((tempCP*0.25)+iInitialCP);
			if(tempCP>=41 && tempCP<=60)
				iFinalCP=((tempCP*0.4)+iInitialCP);
			if(tempCP>=61)
				iFinalCP=((tempCP*0.5)+iInitialCP);
			}
		
		if(tempCP<0){
			if(tempCP>=-20 && tempCP<=-1)
				iFinalCP=((tempCP*0.1)+iInitialCP);
			if(tempCP>=-40 && tempCP<=-21)
				iFinalCP=((tempCP*0.25)+iInitialCP);
			if(tempCP>=-60 && tempCP<=-41)
				iFinalCP=((tempCP*0.4)+iInitialCP);
			if(tempCP<=-61)
				iFinalCP=((tempCP*0.5)+iInitialCP);
			}
		return(iFinalCP);
			
	}
	
	void display(){
		System.out.println("name: "+sPokName);
		System.out.println("type: "+sType);
		System.out.println("ID: "+iPokID);
		System.out.println("total matches played: "+iTotalMatches);
		System.out.println("initial CP: "+iInitialCP);
		System.out.println("final CP: "+calPokeCP());
	}
	
}
