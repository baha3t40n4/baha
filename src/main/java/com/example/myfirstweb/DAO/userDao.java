package com.example.myfirstweb.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.myfirstweb.models.user;


public interface userDao extends JpaRepository<user,Integer>{
	@Query("select a from user a where a.email=:email and a.password=:password")
	public user login(@Param("email") String email, @Param("password") String password);
}

