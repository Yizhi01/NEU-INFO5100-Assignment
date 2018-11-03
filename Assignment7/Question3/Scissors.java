package assignment7;

public class Scissors extends Tool {
	public Scissors(int strength) {
		super.setStrength(strength);
		super.type = 's';
	}
	
	@Override
	public boolean fight(Tool tool) {
		if(tool.type == 'p') {
			return this.strength*2. > tool.strength;
		}if(tool.type == 'r') {
			return this.strength/2. > tool.strength;
		}else 
			return false;
	}
}
