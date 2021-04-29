package com.example.myfirstweb.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myfirstweb.models.user;

public interface userDao extends JpaRepository<user,Integer>{

}
