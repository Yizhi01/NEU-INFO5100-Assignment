package assignment7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianTest {
	@Test
	public void testMedian() {
		Solution5 test = new Solution5();
		int [] nums1 = {1,3};
		int [] nums2 = {2};
		int [] nums3 = {1,2};
		int [] nums4 = {3,4};
		assertEquals(2.0, test.findMedianSortedArrays(nums1, nums2), 0);
		assertEquals(2.5, test.findMedianSortedArrays(nums3, nums4), 0);
	}
}
