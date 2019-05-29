package booksapi;

import javax.annotation.Generated;



public class Epub{

	private boolean isAvailable;
	private String acsTokenLink;
	private String downloadLink;

	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}
	public boolean isIsAvailable(){
		return isAvailable;
	}
	public void setAcsTokenLink(String acsTokenLink){
		this.acsTokenLink = acsTokenLink;
	}
	public String getAcsTokenLink(){
		return acsTokenLink;
	}
	public void setDownloadLink(String downloadLink){
		this.downloadLink = downloadLink;
	}
	public String getDownloadLink(){
		return downloadLink;
	}

	@Override
 	public String toString(){
		return 
			"Epub{" + 
			"isAvailable = '" + isAvailable + '\'' + 
			",acsTokenLink = '" + acsTokenLink + '\'' + 
			",downloadLink = '" + downloadLink + '\'' + 
			"}";
		}
}