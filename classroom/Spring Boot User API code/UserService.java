package com.iiitl.usrapi.users.service;

import java.util.List;

import com.iiitl.usrapi.users.model.UserModel;

public interface UserService {

	List<UserModel> getUsers();

	UserModel getUserById(long userId);

}