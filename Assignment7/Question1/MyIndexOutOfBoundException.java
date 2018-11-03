package assignment7;

public class MyIndexOutOfBoundException extends Exception {
	private int lowerBound;
	private int upperBound;
	private int index;
	
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index = index;
	}
	
	public String toString() {
		return "Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: " + upperBound;
	}
	
	public void method(int lowerBound, int upperBound, int index) throws MyIndexOutOfBoundException {
		if(index > upperBound || index < lowerBound) {
			throw new MyIndexOutOfBoundException(lowerBound, upperBound, index);
		}else {
			System.out.println("Pass");
		}
	}
	
	public static void main(String[] args) {
		MyIndexOutOfBoundException m = new MyIndexOutOfBoundException(1,9,10);
		try {
			m.method(0, 9, 10);
		}catch(MyIndexOutOfBoundException e) {
			System.out.println(e);
		}
	}
}
