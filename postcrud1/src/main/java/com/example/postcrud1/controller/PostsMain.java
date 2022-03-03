package com.example.postcrud1.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.examples.postcrud.model.Posts;
import com.examples.postcrud.service.PostService;
import com.examples.postcrud.service.PostServiceImpl;

public class PostsMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PostServiceImpl service= new PostServiceImpl();
		/*List<Posts> posts = service.getAllPosts();
		for(Posts p:posts) {
			System.out.println(p.getPid()+" "+p.getTitle()+" "+p.getAuthor()+" "+p.getDescription());
		}
		*/
		System.out.println("Enter pid ");
		int pid = sc.nextInt();
		String result=service.deletePost(pid);
		System.out.println(result);
		
		/*
		System.out.println("Enter title ");
		String title = sc.next();
		*/
		System.out.println("Enter author ");
		String author = sc.next();
		String result1=service.updatePost(author);
		System.out.println(result1);
		
		/*
		System.out.println("Enter description ");
		String description = sc.nextLine();
		
		String result = service.inserPost(new Posts(pid,author,title,description));
		
		
		System.out.println(result);*/
		

	}

}
