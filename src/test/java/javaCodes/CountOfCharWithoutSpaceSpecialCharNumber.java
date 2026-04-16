package javaCodes;

public class CountOfCharWithoutSpaceSpecialCharNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="CountOfCharWithout098765!@#$%^7   SpaceSpecialCharNumber";
		String org2=org.replaceAll("[^a-zA-Z]", "").toLowerCase();
		System.out.println(org2);
		int i=org2.length();
		System.out.println(i);

	}

}
