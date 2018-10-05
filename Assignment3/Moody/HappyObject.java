package moody;

public class HappyObject extends MoodyObject {
	//returns a string indicating happy
	protected String getMood() {
		return "happy";
	}
		
	//print laughter string:"hehehe...hahahah...HAHAHAHAHA!!!"
	public void expressFeelings() {
		System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
	}
		
	//returns message about self :"Subject laughs a lot".
	public String toString() {
		return "Subject laughs a lot";
	}
		
}
