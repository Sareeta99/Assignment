package com.example.postcrud1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.examples.postcrud.model.Posts;

public class PostDaoImpl implements PostDao {
	String url = "jdbc:mysql://localhost:3306/jdbc";
	String username = "root";
	String password = "Sarita@123";
	static Connection con;
	static PreparedStatement pst;
	
	static {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Sarita@123";
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Posts> getAllPosts() throws SQLException {
		// TODO Auto-generated method stub
		List<Posts> posts = new ArrayList();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from posts");
		while (rs.next()) {
			posts.add(new Posts(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}

		return posts;
	}

	public String inserPost(Posts posts) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into posts values(?,?,?,?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, posts.getPid());
		pst.setString(2, posts.getAuthor());
		pst.setString(3, posts.getTitle());
		pst.setString(4, posts.getDescription());
		pst.executeUpdate();
		return "Record Inserted...";
	}

	public String deletePost(int pid) throws SQLException {
		// TODO Auto-generated method stub
		String sql="delete from posts where pid=?";
		pst =con.prepareStatement(sql);
		pst.setInt(1, pid);
		pst.executeUpdate();
		return "Post deleted";
	}

	public String updatePost(String auther) throws SQLException {
		// TODO Auto-generated method stub
		String sql="update from posts where auther=?";
		pst=con.prepareStatement(sql);
		pst.setString(1,auther );
		return "Post updated";
	}

}
