package assignment6;

public class Test1 {

	public static void main(String[] args) {
		Mreview movie = new Mreview("Kill Bill");
		movie.addRating(3);
		movie.addRating(8);
		movie.addRating(7);
		System.out.println(movie.toString());
	}

}
