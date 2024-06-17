package org.example.demo.user.service;

import org.example.demo.user.dto.UserRegisterRequestDto;
import org.example.demo.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public boolean userRegister(UserRegisterRequestDto userRegisterRequestDto){
		if(userRepository.findByName(userRegisterRequestDto.getName()) != null) return false;
		userRepository.save(userRegisterRequestDto.toUser());
		return true;
	}
}
