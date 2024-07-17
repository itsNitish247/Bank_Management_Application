package com.bank.management.modal;




import com.bank.management.enums.Roles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	
	private String userName;
	
	private Integer accountNumber ;
	
	private Integer phoneNumber;
	
	private String email;
	
	private String address;
	
	private Integer pincode;
	
	private Integer age;
	
	private Roles roles;
	
}
