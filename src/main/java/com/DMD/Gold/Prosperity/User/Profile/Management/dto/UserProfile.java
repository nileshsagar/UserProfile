package com.DMD.Gold.Prosperity.User.Profile.Management.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserProfile {

	// User Profile

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String firstName;

	private String lastName;

	@Column(unique = true)
	private String email;

	@Column(unique = true)
	private long phoneNumber;

	private String address;
}
