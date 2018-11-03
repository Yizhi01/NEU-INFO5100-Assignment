package assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution5 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> result = new ArrayList<>();
		for(int n:nums1)
			result.add(n);
		for(int n:nums2)
			result.add(n);
		Collections.sort(result);
		int len = result.size();
		if(len%2 == 0) {
			double m1 = (double)result.get(len/2);
			double m2 = (double)result.get(len/2-1);
			return (m1+m2)/2;
		}else {
			return result.get((len-1)/2);
		}
	}
	
	public static void main(String[] args) {
		Solution5 test = new Solution5();
		int [] nums1 = {1,3};
		int [] nums2 = {2};
		int [] nums3 = {1,2};
		int [] nums4 = {3,4};
		System.out.println("Example1: \nThe median is " + test.findMedianSortedArrays(nums1, nums2));
		System.out.println("Example2: \nThe median is " + test.findMedianSortedArrays(nums3, nums4));
	}
}
