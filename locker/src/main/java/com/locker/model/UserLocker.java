package com.locker.model;

public class UserLocker {
	
	private int userId;
	private int lockerId;
	private int passCode;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}
	public int getPassCode() {
		return passCode;
	}
	public void setPassCode(int passCode) {
		this.passCode = passCode;
	}
	public int getLockerId() {
		// TODO Auto-generated method stub
		return lockerId;
	}
	

	
}
