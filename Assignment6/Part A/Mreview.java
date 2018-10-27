package assignment6;
import java.util.*;
	
public class Mreview extends java.lang.Object implements java.lang.Comparable<Mreview>{
	  // instance variables
	  private String title;   // title of the movie
	  private ArrayList<Integer> ratings; // list of ratings stored in a Store object
	  
	  // methods 
	  public Mreview() {
		  title = "";
		  ratings = new ArrayList<Integer>();
	  }
	  
	  public Mreview(String ttl) {
		  title = ttl;
		  ratings = new ArrayList<Integer>();
	  }
	  
	  public Mreview(String ttl, int firstRating) {
		  title = ttl;
		  this.ratings.add(firstRating);
	  }
	  
	  public String getTitle() {
		  return this.title;
	  }
	  
	  public void addRating(int r) {
		  this.ratings.add(r);
	  }

	  public double aveRating() {
		  int sum = 0;
		  for(int r:ratings) {
			  sum += r;
		  }
		  return (double)sum/this.ratings.size();
	  }
	  
	  public int numRatings() {
		  return this.ratings.size();
	  }
	  
	  @Override
	  public int compareTo(Mreview obj) {
		  return title.compareTo(obj.title);
	  }
	  public boolean equals(Object obj) {
		  if(!getTitle().equals(((Mreview)obj).getTitle()))
			  return false;
		  return true;
	  }
	  public String toString() {
		  String s = String.format("%s, average %s out of %s ratings", getTitle(), aveRating(), numRatings());
		  return s;
	  }
}