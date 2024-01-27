package com.diverary.backend.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diverary.backend.entity.SignUpUser;

public interface SignUpUserRepository extends JpaRepository<SignUpUser, Long>{

}
