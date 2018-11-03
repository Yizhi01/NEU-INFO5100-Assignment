package assignment7;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MergeTest {
	
	@Test
	public void testMerge() {
		Solution4 test = new Solution4();
		List<Interval> list = new ArrayList<>();
        Interval interval1 = new Interval(1, 3);
        Interval interval2 = new Interval(2, 4);
        Interval interval3 = new Interval(5, 7);
        Interval interval4 = new Interval(6, 8);
        list.add(interval1);
        list.add(interval2);
        list.add(interval3);
        list.add(interval4);
        List<Interval> list2 = test.merge(list);
        assertEquals(1,list2.get(0).start);
        assertEquals(4,list2.get(0).end);
        assertEquals(5,list2.get(1).start);
        assertEquals(8,list2.get(1).end);
	}

}
