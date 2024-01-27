package com.diverary.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//exclude = SecurityAutoConfiguration.classはスプリングブートアプリケーションを起動する時、スプリングセキュリティの自動設定を無効にして、その設定を無効にすることを意味する。
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DiveraryBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiveraryBackendApplication.class, args);
	}

}
