package com.pragmatech.user.model;

import java.time.LocalDate;

public class User {
	public byte id; 
	public String name;
	public String email;
	public String username; // admin
	public String password; // admin123
	public boolean isAdmin; // true
	public boolean isActive; // false
	public LocalDate createdAt;
	public LocalDate updatedAt;
}
