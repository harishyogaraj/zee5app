package com.zee.zee5.dto;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class Register {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
}
