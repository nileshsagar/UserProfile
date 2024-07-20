package com.DMD.Gold.Prosperity.User.Profile.Management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DMD.Gold.Prosperity.User.Profile.Management.dao.UserProfileDao;
import com.DMD.Gold.Prosperity.User.Profile.Management.dto.UserProfile;

@Service
public class UserProfileService {

	@Autowired
	UserProfileDao dao;

	public String saveUserProfile(UserProfile profile) {

		if (profile != null) {

			dao.saveUserProfile(profile);
			return "UserProfile Save SuccessFully!";

		} else {

			return "UserProfile not Save SuccessFully!";
		}

	}

	public UserProfile retrieveById(int id) {

		return dao.retrieveById(id).get();

	}

	public UserProfile updateUserProfile(int id, UserProfile profile) {

		Optional<UserProfile> optional = dao.retrieveById(id);

		if (optional.isPresent()) {
			profile.setUserId(id);
			UserProfile profile2 = dao.update(profile);
			return profile2;

		}
		return profile;

	}

	public String deleteUserProfile(int id) {

		Optional<UserProfile> optional = dao.retrieveById(id);

		if (optional.isPresent()) {

			dao.deletUserProfile(id);
			return "UserProfile delet Successfully with "+id;

		} else {

			return "UserProfile Not Present";

		}

	}

	public List<UserProfile> getList() {

	
		return dao.userProfileAllData();
	
	

	}

}
