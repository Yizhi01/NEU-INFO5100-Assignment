package reverse;
// socre 1/2
// your answer is "The sky is blue ", need you remove last space in return 
public class Words {
	public static String reverse(String s) {
		String [] temp = s.split(" ");
		String result = " ";
		
		for(int i=0; i<temp.length; i++) {
			if(i==temp.length-1) 
				result = temp[i] + result;
			else 
				result = " " + temp[i] + result;
		}
		return result;
	}

	public static void main(String[] args) {
		String s1 = "The sky is blue";
		System.out.println(reverse(s1));
		
	}

}
