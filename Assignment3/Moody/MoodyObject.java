package moody;

public abstract class MoodyObject {
	//returns the mood: sad or happy - depending on which object sends the message
	protected abstract String getMood();
	
	//each object expresses a different emotion
	protected abstract void expressFeelings();
	
	//an object responds according to how it feels, print "I feel happy (or sad) today!"
	public void queryMood() {
		System.out.println("I feel " + getMood() + " today!"+'\n');
	}
}
