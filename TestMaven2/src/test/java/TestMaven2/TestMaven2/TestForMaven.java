package TestMaven2.TestMaven2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForMaven {
	@Test
	public void sum() {
		System.out.println("sum");
		int a = 10;
		int b=20;
		Assert.assertEquals(30, a+b);
		
	}

	@Test
	public void sub() {
		System.out.println("SUB");
		int a = 10;
		int b=20;
		Assert.assertEquals(10, b-a);
		
	}
	
	@Test
	public void Div() {
		System.out.println("Div");
		int a = 10;
		int b=20;
		Assert.assertEquals(2, b/a);

	}
	
	@Test
	public void Multi() {
		System.out.print("Multi");
		int a = 10;
		int b=20;
		Assert.assertEquals(200, a*b);
		
	}


}
