package booksapi;


public class OffersItem{

	private int finskyOfferType;
	private RetailPrice retailPrice;
	private ListPrice listPrice;

	public void setFinskyOfferType(int finskyOfferType){
		this.finskyOfferType = finskyOfferType;
	}

	public int getFinskyOfferType(){
		return finskyOfferType;
	}

	public void setRetailPrice(RetailPrice retailPrice){
		this.retailPrice = retailPrice;
	}

	public RetailPrice getRetailPrice(){
		return retailPrice;
	}

	public void setListPrice(ListPrice listPrice){
		this.listPrice = listPrice;
	}

	public ListPrice getListPrice(){
		return listPrice;
	}

	@Override
 	public String toString(){
		return 
			"OffersItem{" +
			"finskyOfferType = '" + finskyOfferType + '\'' +
			",retailPrice = '" + retailPrice + '\'' +
			",listPrice = '" + listPrice + '\'' +
			"}";
		}
}