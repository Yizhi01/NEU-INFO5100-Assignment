package moody;

public class Test2 {

	public static void main(String[] args) {
		MoodyObject m1 = new HappyObject();
		MoodyObject m2 = new SadObject();
		PsychiatristObject p1 = new PsychiatristObject();
		p1.examine(m1);
		p1.observer(m1);
		p1.examine(m2);
		p1.observer(m2);
	}
}
