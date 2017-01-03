package com.niit.ShoppingCartFrontEnd.dao.temp;

public class UserDAO {
public boolean isValidCredentials(String id, String password)
{
	if (id.equals("niit")&& password.equals("niit"))
	{
		System.out.println("enter into dao");
	return true;
	
	}
	else
	{
		return false;
		
	}
	
}
}
