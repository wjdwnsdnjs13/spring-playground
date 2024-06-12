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
		userService.userRegister(userRegisterRequestDto);
		return ResponseEntity.status(HttpStatus.OK).body("hi");
	}
}
