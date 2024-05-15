package com.iiitl.usrapi.users.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.iiitl.usrapi.users.model.UserModel;

@Service
public class UserServiceImpl implements UserService {

	List<UserModel> users;
	
	public UserServiceImpl() {
		users = new ArrayList<>();
		users.add(new UserModel(0,"Prashant","","Singh","ps123","prashant@iiitl.ac.in","9532963374"));
		users.add(new UserModel(1,"Rahul","Kumar","Verma","rkv123","rkv@iiitl.ac.in","9532963374"));
	}
	
	@Override
	public List<UserModel> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public UserModel getUserById(long userId) {
		// TODO Auto-generated method stub
		return users.get((int) userId);
	}

}package com.iiitl.usrapi.users.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.iiitl.usrapi.users.model.UserModel;

@Service
public class UserServiceImpl implements UserService {

	List<UserModel> users;
	
	public UserServiceImpl() {
		users = new ArrayList<>();
		users.add(new UserModel(0,"Prashant","","Singh","ps123","prashant@iiitl.ac.in","9532963374"));
		users.add(new UserModel(1,"Rahul","Kumar","Verma","rkv123","rkv@iiitl.ac.in","9532963374"));
	}
	
	@Override
	public List<UserModel> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public UserModel getUserById(long userId) {
		// TODO Auto-generated method stub
		return users.get((int) userId);
	}

}