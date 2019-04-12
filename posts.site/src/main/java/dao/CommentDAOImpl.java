package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Comments;

public class CommentDAOImpl implements CommentDAO {

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
	public int insertComment(Comments comment) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into comments (comment_body,commented_by) values(?,?)");
			pst.setString(1, comment.getComment_body());
			pst.setString(2, comment.getCommented_by());
			res = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int updateComment(Comments comment) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("update comments set comment_body = ?,commented_by = ? where comment_id = ?");
			pst.setString(1, comment.getComment_body());
			pst.setString(2, comment.getCommented_by());
			pst.setInt(3, comment.getComment_id());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deleteComment(int id) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from comments where comment_id = ?");
			pst.setInt(1, id);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<Comments> viewAllComment() throws SQLException {

		ArrayList<Comments> list = new ArrayList<Comments>();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from comments");
		while (rs.next()) {
			list.add(new Comments(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}

		return list;
	}

	@Override
	public Comments viewComment(int id) {
		Comments comment = new Comments();
		try {
			PreparedStatement pst = con.prepareStatement("select * from comments where comment_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				comment = new Comments(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return comment;
	}


}
