package com.diverary.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "admin_user")
@Data
public class AdminUser {
	
	// ID　データベースで使う
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    
	@Column(name = "name")
	private String name;

    // Loginするときのパスワードして使う
    @Column(nullable = false, length = 64)
    private String password;

    // ログインするときのIDとして使用する
    @Column(nullable = false, unique = true, length = 45)
    private String email;

    // 認証コード
    @Column(name = "verification_code", length = 64)
    private String verificationCode;

    // 初期値はfalse 認証が成功すると trueになる。
    private boolean enabled;

    public AdminUser(String name, Integer id, String password, String email, String verificationCode, boolean enabled) {
    	this.name = name;
    	this.id = id;
        this.password = password;
        this.email = email;
        this.verificationCode = verificationCode;
        this.enabled = enabled;
    }

    public AdminUser() {
    }

    public AdminUser( String email,String password) {
        this.password = password;
        this.email = email;
    }

    public AdminUser(String email,String password,String verificationCode, boolean enabled) {
        this.password = password;
        this.email = email;
        this.verificationCode = verificationCode;
        this.enabled = enabled;
    }

}
