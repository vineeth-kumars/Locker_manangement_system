package com.locker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity

public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String userName;
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	private int lockerId;
	
	
	
	public int getLockerId() {
		return lockerId;
	}



	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}



	private int passCode;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getPassCode() {
		return passCode;
	}



	public void setPassCode(int passCode) {
		this.passCode = passCode;
	}
	
	
	
	

}
