package assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
	public List<Interval> merge(List<Interval> intervals) {
	    List<Interval> result = new ArrayList<Interval>();  
		int n = intervals.size();
		int[] start = new int [n];
		int[] end = new int[n];
	    if(n <= 1) {
	    	  return intervals;
	    }else {
	          for (int i = 0; i < n; i++) {
	              start[i] = intervals.get(i).start;
	              end[i] = intervals.get(i).end;
	          }
	          Arrays.sort(start);
	          Arrays.sort(end);
	    	  Interval pre = intervals.get(0);
	    	  for(int i = 1; i<n; i++) {
	    		  Interval curr = intervals.get(i);
	    		  if(pre.end >= curr.start) {
	    			  pre = new Interval(pre.start, Math.max(pre.end, curr.end) );
	    		  }else {
	    			  result.add(pre);
	    			  pre = curr;
	    		  }
	    	  }
    		  result.add(pre);
	      }
	      return result;
	}
	
    public static void main(String[] args) {  
    	  
        Solution4 test = new Solution4();  
        List<Interval> list = new ArrayList<Interval>();  
        Interval Interval1 = new Interval(1, 3);  
        Interval Interval2 = new Interval(2, 4);  
        Interval Interval3 = new Interval(5, 7);  
        Interval Interval4 = new Interval(6, 8);  
        list.add(Interval1);  
        list.add(Interval2);  
        list.add(Interval3);  
        list.add(Interval4);  
  
        List<Interval> list2 = test.merge(list);  
  
        for (Interval m : list2) {  
            System.out.println("{" +m.start + " , " + m.end + "}");  
        }  
    }  
}
