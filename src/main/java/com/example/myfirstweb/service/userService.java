package com.example.myfirstweb.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirstweb.DAO.userDao;
import com.example.myfirstweb.models.user;
@Service
@Transactional
public class userService {
	@Autowired
	private userDao dao;
	
	public user saveUser(user u)
	{
		
		return dao.save(u);
	}
	public Collection<user> getAllUsers()
	{
		return dao.findAll();
	}
	public void removeUser(int id )
	{
		dao.deleteById(id);
	}
	public user updateUser(user u )
	{
		return dao.save(u);
	}
}
