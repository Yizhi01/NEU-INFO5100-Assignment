package assignment7;

public class Rock extends Tool {
	public Rock(int strength) {
		super.setStrength(strength);
		super.type = 'r';
	}
	
	@Override
	public boolean fight(Tool tool) {
		if(tool.type == 's') {
			return this.strength*2. > tool.strength;
		}if(tool.type == 'p') {
			return this.strength/2. > tool.strength;
		}else 
			return false;
	}
	
}
