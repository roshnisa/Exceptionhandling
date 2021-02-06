package exceptionhandling;

import javax.security.auth.login.LoginException;

public class TestloginException {
public static void main(String[] args) throws LoginException {
	auth("vijay");

}

private static void auth(String Login) throws LoginException {
	if(!Login.equals("admin"));
	LoginException e = new LoginException();
	{
		throw e;
	}
	}
}
