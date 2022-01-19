package com.zee.zee5.repository;

import com.zee.zee5.dto.Register;

public class UserRepository {

	private Register[] registers=new Register[10];
	private static int count=-1;
	private UserRepository() {
		
	}
	
	public Register[] getUsers() {
		return registers;
	}
	
	public String deleteUser(String id)
	{
		return null;
	}
	
	public String updateUser(String id , Register register)
	{
		return null;
	}
	
	public Register getUserById(String id)
	{
		for (Register register : registers) {
			if(register!=null && register.getId().equals(id))
				return register;
		}
		
		return null;
	}
	
	public String addUser(Register register)
	{
		if(count==registers.length-1)
		{
			Register temp[]=new Register[registers.length*2];
			System.arraycopy(register, 0, temp, 0, registers.length);
			registers=temp;
			registers[++count]=register;
			return "success";
		}
		registers[++count]=register;
		return "success";
	}
	
	private static UserRepository userRepository;
	public static UserRepository getInstance() {
		if(userRepository==null)
			userRepository=new UserRepository();
		return userRepository;
	}
}
