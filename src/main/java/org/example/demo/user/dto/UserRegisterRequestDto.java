package org.example.demo.user.dto;

import org.example.demo.user.entity.User;

import lombok.Getter;

@Getter
public class UserRegisterRequestDto {
	private String name;

	public User toUser(){
		return User.builder()
			.name(this.name).build();
	}
}
