package com.DMD.Gold.Prosperity.User.Profile.Management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DMD.Gold.Prosperity.User.Profile.Management.dto.UserProfile;

public interface UserProfileRepo extends JpaRepository<UserProfile, Integer> {

}
