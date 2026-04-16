package test.seleniumframework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngLearn {
	@DataProvider(name="login")
	public String[][] getata() {
		String data[][]=new String[2][2];
		data[0][0]="vasiharan05@gmail.com";
		data[0][1]="kathir";
		data[1][0]="xdtcrfvuybiu";
		data[1][1]="iuy";
		
		return data;
	}
	@Test(groups= {"smoke"},dataProvider="login")
	public void signup(String email,String pass) {
		System.out.println(	email);
		System.out.println(pass);
		
	}
	@Test(groups= {"smoke"},dependsOnMethods="signup")
	public void login() {
		System.out.println("login");
	}
	@Test(groups= {"regression"},dependsOnMethods="login", priority=0)
	public void searchProduct()
	{
		System.out.println("searchProduct");
	}
	@Test(dependsOnMethods="searchProduct")
	public void addToCart() {
		System.out.println("addToCart");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods="addToCart")
	public void signOut() {
		System.out.println("signOut");
	}
}
