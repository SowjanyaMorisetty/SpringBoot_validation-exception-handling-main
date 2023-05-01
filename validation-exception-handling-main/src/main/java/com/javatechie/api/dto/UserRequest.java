package com.javatechie.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "username shouldn't be null")
    private String name;
    @Email(message = "invalid email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;
	
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public Object getMobile() {
		// TODO Auto-generated method stub
		return mobile;
	}

	public Object getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	public Object getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	public Object getNationality() {
		// TODO Auto-generated method stub
		return nationality;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

}
