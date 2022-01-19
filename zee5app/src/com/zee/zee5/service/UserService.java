package com.zee.zee5.service;

import com.zee.zee5.dto.Register;
import com.zee.zee5.repository.UserRepository;

public class UserService {

	private UserRepository repository = UserRepository.getInstance();
	
	private UserService()
	{
		
	}
	static UserService service=null;
	
	public static UserService getInstance()
	{
		if (service==null)
		
			service=new UserService();
			return service;
		
	}
	public String addUser(Register register) {
		return this.repository.addUser(register);
	}
	
	public Register getUserById(String id) {
		return this.repository.getUserById(id);
	}
	
	public Register[] getUsers() {
		return repository.getUsers();
	}
}
