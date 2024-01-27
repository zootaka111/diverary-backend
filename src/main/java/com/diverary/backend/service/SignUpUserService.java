package com.diverary.backend.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.diverary.backend.entity.SignUpUser;
import com.diverary.backend.models.SignUpUserRepository;

@Service
public class SignUpUserService {
	SignUpUserRepository signUpUserRepository;
	
	BCryptPasswordEncoder passwordEncoder;
	
	public SignUpUserService(SignUpUserRepository signUpUserRepository) {
        super();
        this.signUpUserRepository = signUpUserRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public SignUpUser save(SignUpUser user) {
    	user.setPassword(passwordEncoder.encode(user.getPassword()));
        return signUpUserRepository.save(user);
    }
}
