package mavendemoproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void testlogin1()
	{
		Login mylogin = new Login();
		Assert.assertEquals(0,mylogin.userLogin("user1","password"));
	}
	@Test
	public void testlogin2()
	{
		Login mylogin = new Login();
		Assert.assertEquals(1, mylogin.userLogin("user1", "password1"));
	}
}
