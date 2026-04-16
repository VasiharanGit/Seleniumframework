package javaCodes;

public class PrintFirstFourChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="PrintFirstFourChar";
		String org2=org.toLowerCase();
		String result="";
		for(int i=0;i<4;i++) {
			result+=org2.charAt(i);
			
		}
		System.out.println(result);

	}

}
