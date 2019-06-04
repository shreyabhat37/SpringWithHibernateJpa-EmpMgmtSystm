package com.dev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class User {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UserId")
    private String userId;
	@Column(name="UserName")
	private String userName;
	@Column(name="UserPassword")
	private String userPassword;
	@Column(name="UserType")
	private String userType;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userType="
				+ userType + "]";
	}
     
	
}

