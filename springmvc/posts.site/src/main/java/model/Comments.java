package model;

public class Comments {
	private int comment_id;
	private String comment_body;
	private String commented_by;

	public Comments() {
		super();
	}

	public Comments(int comment_id, String comment_body, String commented_by) {
		super();
		this.comment_id = comment_id;
		this.comment_body = comment_body;
		this.commented_by = commented_by;
	}

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public String getComment_body() {
		return comment_body;
	}

	public void setComment_body(String comment_body) {
		this.comment_body = comment_body;
	}

	public String getCommented_by() {
		return commented_by;
	}

	public void setCommented_by(String commented_by) {
		this.commented_by = commented_by;
	}

	@Override
	public String toString() {
		return "Comments [comment_id=" + comment_id + ", comment_body=" + comment_body + ", commented_by="
				+ commented_by + "]";
	}

}
