package com.DMD.Gold.Prosperity.User.Profile.Management.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DMD.Gold.Prosperity.User.Profile.Management.dto.UserProfile;
import com.DMD.Gold.Prosperity.User.Profile.Management.repo.UserProfileRepo;

@Repository
public class UserProfileDao {

	// This is A Dao Layer

	@Autowired
	UserProfileRepo repo;

	// SaveUser Method
	public void saveUserProfile(UserProfile profile) {
		repo.save(profile);
	}

	// Find By Id Method
	public Optional<UserProfile> retrieveById(int id) {
		return repo.findById(id);

	}
	public UserProfile update(UserProfile profile) {
		
		return repo.save(profile);
	}
	
	


	// Delete By Id Method
	public void deletUserProfile(int id) {

		repo.deleteById(id);

	}
	
	public List<UserProfile> userProfileAllData() {
		
		return repo.findAll();
	}

}
