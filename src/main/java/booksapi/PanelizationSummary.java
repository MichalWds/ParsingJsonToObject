package booksapi;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PanelizationSummary{

	private boolean containsImageBubbles;
	private boolean containsEpubBubbles;

	public void setContainsImageBubbles(boolean containsImageBubbles){
		this.containsImageBubbles = containsImageBubbles;
	}

	public boolean isContainsImageBubbles(){
		return containsImageBubbles;
	}

	public void setContainsEpubBubbles(boolean containsEpubBubbles){
		this.containsEpubBubbles = containsEpubBubbles;
	}

	public boolean isContainsEpubBubbles(){
		return containsEpubBubbles;
	}

	@Override
 	public String toString(){
		return 
			"PanelizationSummary{" + 
			"containsImageBubbles = '" + containsImageBubbles + '\'' + 
			",containsEpubBubbles = '" + containsEpubBubbles + '\'' + 
			"}";
		}
}