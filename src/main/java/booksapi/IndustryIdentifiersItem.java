package booksapi;


public class IndustryIdentifiersItem{

	private String identifier;
	private String type;

	public void setIdentifier(String identifier){
		this.identifier = identifier;
	}

	public Long getIdentifier(){
		return Long.valueOf(identifier);
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"IndustryIdentifiersItem{" + 
			"identifier = '" + identifier + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}