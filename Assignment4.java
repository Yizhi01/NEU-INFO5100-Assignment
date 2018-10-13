package assignment;
import java.util.*;

public class Assignment4 {

	public static void main(String[] args) {
		
		System.out.println("test firstUniqChar");
		Assignment4 a = new Assignment4();
		String s1 = "leetcode";
		String s2 = "loveleetcode";
		System.out.println("In s1: " + a.firstUniqChar(s1));
		System.out.println("In s2: " + a.firstUniqChar(s2));
		
		System.out.println("\n" + "test addDigits");
		System.out.println(a.addDigits(38));
		
		System.out.println("\n" + "test moveZeroes");
		int [] arr = {0, 1, 0, 3, 12};
		a.moveZeroes(arr);
		System.out.println(" ");
		
		System.out.println("\n" + "test longestPalindrome");
		String s3= "babad";
		String b = a.longestPalindrome(s3);
		System.out.println("The longest palindrome is " + b);
		
		System.out.println("\n" + "test rotate matrix");
		int mat[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		int [][] aftermat = a.rotate(mat);
		int N = aftermat.length;
		for (int i=0; i<N; i++) {
			for(int j=0;j<N;j++) {
				System.out.print(aftermat[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
	

	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
		public int firstUniqChar(String s) {
    		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    		for(int i=0; i<s.length();i++) {
    			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
    		}
    		for(int i=0;i<s.length(); i++) {
    			if(map.get(s.charAt(i))==1)
    				return i;
    		}
    		return -1;
		}
    
		/*
	     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
	     * Input: 38 Output: 2
	     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	     */
		 public int addDigits(int n) {
			 while(n/10 >0) {
				 int sum = 0;
				 while (n>0) {
					 sum = n%10 + sum;
					 n = n/10;
				 }
				 n = sum;
			 }
			 return n;
		 }
		 
		 /*
		     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
		     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
		     */
		    public void moveZeroes(int[] nums) {
		    		int count = 0;
		    		for(int i=0; i<nums.length; i++) {
		    			if(nums[i] != 0 )
		    				nums[count++] = nums[i]; 
		    		}
		    		while(count < nums.length)
		    			nums[count++] = 0;
		    		for(int i=0;i<nums.length;i++) 
		    			System.out.print(nums[i] + " ");
		    }
		    
		  /*
		   * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
		   * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
		   */
		    public String longestPalindrome(String s) {
		    	if(s == null)
		    		return null;
		    	if(s.length()==1)
		    		return s;
		    	
		    	String longest = s.substring(0, 1);
		    	for(int i=0; i<s.length(); i++) {
		    		String temp = Palindrome(s,i,i);
		    		if (temp.length()>longest.length()) {
		    			longest = temp;
		    		}
		    		temp = Palindrome(s,i,i+1);
		    		if(temp.length()>longest.length()) {
		    			longest = temp;
		    		}
		    	}
		    	return longest;
		    }
		    
		    public String Palindrome(String s, int m, int n ) {
		    	while (m>=0&&n<=s.length()-1&&s.charAt(m)==s.charAt(n)) {
		    		m--;
		    		n++;
		    	}
		    	return s.substring(m +1 , n);
		    }
	
		/*
		 * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
		 * Given input matrix = [ [1,2,3],
		  			  [4,5,6],
		  			  [7,8,9] ],
		 * rotate the input matrix in-place such that it becomes: [  [7,4,1],
		  	   						     [8,5,2],
		  	 						     [9,6,3] ],
		     */
		    public int[][] rotate(int[][] matrix) {
		    		int n = matrix.length;
		    		for(int i=0; i<n/2; i++) {
		    			for(int j=0; j<(n+1)/2; j++) {
		    				int temp = matrix[i][j];
		    				matrix[i][j] = matrix[n-1-j][i];
		    				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
		    				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
		    				matrix[j][n-1-i] = temp;
		    			}
		    		}
		    		return matrix;
		    }
		
		
		
		
}
