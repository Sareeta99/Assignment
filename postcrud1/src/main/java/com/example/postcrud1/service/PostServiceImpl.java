package com.example.postcrud1.service;


import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.examples.postcrud.dao.PostDao;
import com.examples.postcrud.dao.PostDaoImpl;
import com.examples.postcrud.model.Posts;

public class PostServiceImpl implements PostService{
	
	PostDaoImpl dao;
	
	public PostServiceImpl(){
		dao= new PostDaoImpl();
	}

	public List<Posts> getAllPosts() throws SQLException {
		// TODO Auto-generated method stub
		return Dao.getAllPosts();
	}

	public String inserPost(Posts posts) throws SQLException {
		// TODO Auto-generated method stub
		return ((PostService) dao).inserPost(posts);
	}

	public String deletePost(int pid) throws SQLException {
		// TODO Auto-generated method stub
		return dao.deletePost(pid);
	}

	public String updatePost(String auther) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updatePost(auther);
	}

}
