package assignment7;

public class Tool {
	protected int strength;
	protected char type;
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public boolean fight(Tool tool) {
		if (this.strength > tool.strength)
			return true;
		else 
			return false;
	}
}
