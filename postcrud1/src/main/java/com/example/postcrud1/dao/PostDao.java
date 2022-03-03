package com.example.postcrud1.dao;

import java.sql.SQLException;
import java.util.List;

import com.examples.postcrud.model.Posts;

public interface PostDao {
	public List<Posts> getAllPosts() throws SQLException;
	public String inserPost(Posts posts) throws SQLException;
	
	public String deletePost(int pid) throws SQLException;
	
	public String updatePost(String auther) throws SQLException;
	
	
	
	
}
