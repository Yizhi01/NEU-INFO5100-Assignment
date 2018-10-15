package moody;
// score 5/5
public class PsychiatristObject {
	//asks a moody object about its mood
	public void examine(MoodyObject moodyObject) {
		System.out.println("How are you feeling today?");
		moodyObject.queryMood();
	}
	
	//a moodyObject is observed to either laugh or cry
	public void observer(MoodyObject moodyObject) {
		moodyObject.expressFeelings();
		System.out.println("Observation: " + moodyObject.toString()+'\n');
	}
}
