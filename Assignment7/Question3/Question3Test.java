package assignment7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Question3Test {
	@Test
	public void GameTest() {
		 Scissors s = new Scissors(5);
	     Paper p = new Paper(7);
	     Rock r = new Rock(15);

	     assertEquals(true,s.fight(p));
	     assertEquals(false,p.fight(s));
	     assertEquals(false,p.fight(r));
	     assertEquals(true,r.fight(p));
	     assertEquals(true,r.fight(s));
	     assertEquals(false,s.fight(r));
	}
	
}
