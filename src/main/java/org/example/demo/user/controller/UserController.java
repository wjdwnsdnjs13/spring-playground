package org.example.demo.user.controller;

import org.example.demo.user.dto.UserRegisterRequestDto;
import org.example.demo.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
	private final UserService userService;

	@PostMapping()
	public ResponseEntity<?> userRegister(@RequestBody UserRegisterRequestDto userRegisterRequestDto){
		boolean result = userService.userRegister(userRegisterRequestDto);
		if(result) return ResponseEntity.status(HttpStatus.OK).body("회원 가입에 성공했습니다.");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("중복된 이름이 존재합니다.");
	}
}
