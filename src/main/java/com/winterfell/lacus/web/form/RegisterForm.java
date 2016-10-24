package com.winterfell.lacus.web.form;

import org.hibernate.validator.constraints.NotBlank;

public class RegisterForm {
	@NotBlank(message="用户名不能为空")
	private String username;
	@NotBlank(message="用户名不能为空")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
