package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Post;

public class PostDAOImpl implements PostDAO {

	private static Connection con;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");

			con = DriverManager.getConnection("jdbc:mysql://localhost/mytest", "root", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insert(Post post) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into posts (post_title,post_body) values(?,?)");
			pst.setString(1, post.getPost_title());
			pst.setString(2, post.getPost_body());
			res = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int update(Post post) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("update posts set post_title = ?,post_body = ? where post_id = ?");
			pst.setString(1, post.getPost_title());
			pst.setString(2, post.getPost_body());
			pst.setInt(3, post.getPost_id());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int delete(int id) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from posts where post_id = ?");
			pst.setInt(1, id);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<Post> view() throws SQLException {

		ArrayList<Post> list = new ArrayList<Post>();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from posts");
		while (rs.next()) {
			list.add(new Post(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}

		return list;
	}

	@Override
	public Post view(int id) {
		Post post = new Post();
		try {
			PreparedStatement pst = con.prepareStatement("select * from posts where post_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				post = new Post(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return post;
	}

}
