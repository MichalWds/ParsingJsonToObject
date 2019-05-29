package booksapi;

import java.util.List;


public class Books{

	private String requestedUrl;
	private List<ItemsItem> items;

	public void setRequestedUrl(String requestedUrl){
		this.requestedUrl = requestedUrl;
	}

	public String getRequestedUrl(){
		return requestedUrl;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"Books{" +
			"requestedUrl = '" + requestedUrl + '\'' +
			",items = '" + items + '\'' +
			"}";
		}
}