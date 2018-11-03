package assignment7;

public class Paper extends Tool {
	public Paper(int strength) {
		super.setStrength(strength);
		super.type = 'p';
	}
	
	@Override
	public boolean fight(Tool tool) {
		if(tool.type == 'r') {
			return this.strength*2. > tool.strength;
		}if(tool.type == 's') {
			return this.strength/2. > tool.strength;
		}else 
			return false;
	}
}
