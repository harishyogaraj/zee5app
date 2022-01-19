package com.zee.zee5app;

import com.zee.zee5.dto.Login;
import com.zee.zee5.dto.Register;
import com.zee.zee5.service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Register register=new Register();
		
		register.setFirstName("Harish");
		register.setLastName("Y");
		register.setEmail("Harish@");
		
		
		
		System.out.println(register.toString());
		System.out.println(register.getEmail());
		Login login =new Login();
		UserService service = UserService.getInstance();
		
		for(int i=1;i<=10;i++)
		{
			Register register2=new Register();
			register2.setId("aa"+i);
			register2.setFirstName("har"+i);
			register2.setEmail("har@133"+i);
			String result=service.addUser(register2);
			System.out.println(result);
			System.out.println(i);
		}
		
		Register register2=service.getUserById("aa1");
		System.out.println(register2!=null);
		
		for(Register register3 : service.getUsers())
		{
			if(register3!=null)
			System.out.println(register3);
		}
		
	}

}
