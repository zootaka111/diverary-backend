package com.diverary.backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diverary.backend.entity.SignUpUser;
import com.diverary.backend.service.SignUpUserService;

@RestController
@RequestMapping("/api")
public class SignUpUserController {
	
	@Autowired
	SignUpUserService signUpUserService;

	@PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody SignUpUser signUpRequest) {
		signUpUserService.save(signUpRequest);
        // 成功時のメッセージを返す
        return new ResponseEntity<>("User signed up successfully", HttpStatus.OK);
    }
}

