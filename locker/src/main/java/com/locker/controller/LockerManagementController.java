package com.locker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locker.entity.Lockers;
import com.locker.entity.Users;
import com.locker.model.UserLocker;
import com.locker.repository.lockerRepository;
import com.locker.repository.userRepository;
import com.locker.service.LockerService;
import com.locker.service.userService;

@RestController
@CrossOrigin
@RequestMapping("/locuser")
public class LockerManagementController {
	
	@Autowired
	private userService userService;
	
	@Autowired
	private LockerService lockerService;
	
	
	@PostMapping("/createuser")
	public Users createUsers(Users user) {
		return 	userService.createUser(user);
	
	}
	
	@PostMapping("/createlocker")
		public Lockers createLocker(Lockers locker) {
			return lockerService.createLocker(locker);
		}
	
	@PutMapping("/occupylocker")
	public Lockers updateLockers(@RequestBody UserLocker userlocker) {
		return lockerService.updateLocker(userlocker);
	}
	
	@PutMapping("checkoutlocker")
	public Lockers checkoutLockeres(@RequestBody UserLocker userlocker) {
		return lockerService.checkOutLocker(userlocker);
	}
	
	

}
