package dao;

import java.sql.SQLException;
import java.util.List;

import model.Comments;

public interface CommentDAO {

	int insertComment(Comments comment);
	int updateComment(Comments comment);
	int deleteComment(int id);
	List<Comments> viewAllComment() throws SQLException;
	Comments viewComment(int id);
}
