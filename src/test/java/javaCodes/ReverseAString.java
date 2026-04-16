package javaCodes;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="Hello world";
		String result="";
		for(int i=org.length()-1;i>=0;i--) {
			
			result+=org.charAt(i);
		}
		System.out.println(result);

	}

}
