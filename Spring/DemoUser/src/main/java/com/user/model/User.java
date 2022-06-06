package com.user.model;


import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class User {

	@NotBlank(message="Name is required")
	String nombre;
	@NotBlank(message="Apellido is required")
	String apellido;
	@NotBlank(message="DNI is required")
	String dni;
	
}
