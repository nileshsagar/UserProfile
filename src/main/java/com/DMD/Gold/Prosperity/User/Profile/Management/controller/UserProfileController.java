package com.DMD.Gold.Prosperity.User.Profile.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DMD.Gold.Prosperity.User.Profile.Management.dto.UserProfile;
import com.DMD.Gold.Prosperity.User.Profile.Management.service.UserProfileService;

@RestController
@RequestMapping("/UserProfile")
public class UserProfileController {

	@Autowired
	UserProfileService service;

	@PostMapping("/addUserProfile")
	public String saveUserProfile(@RequestBody UserProfile profile) {
		// profile.setUserId(0);
		return service.saveUserProfile(profile);
	}

	@GetMapping("/getById")
	public UserProfile retrieveById(@RequestParam int id) {

		return service.retrieveById(id);
	}

	@DeleteMapping("/deleteUserProfile")
	public String deleteUserProfile(int id) {

		return service.deleteUserProfile(id);

	}

	@PutMapping("/updateUser")
	public UserProfile updateUser(@RequestParam int id, @RequestBody UserProfile profile) {

		return service.updateUserProfile(id, profile);
	}


	@GetMapping("/getList")
	public List<UserProfile> getAllData() {

		return service.getList();
	}

}
