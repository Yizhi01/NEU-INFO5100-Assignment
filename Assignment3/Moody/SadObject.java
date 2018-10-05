package moody;

public class SadObject extends MoodyObject {
	//returns a string indicating sad
	protected String getMood() {
		return "sad";
	}
	
	//print crying string:" 'wah' 'boo hoo' 'weep' 'sob' 'weep'"
	public void expressFeelings() {
		System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
	}
	
	//returns message about self :"Subject cries a lot".
	public String toString() {
		return "Subject cries a lot";
	}
	
}
