package model;

public class Post {

	private int post_id;
	private String post_title;
	private String post_body;

	public Post() {

	}

	public Post(int post_id, String post_title, String post_body) {
		super();
		this.post_id = post_id;
		this.post_title = post_title;
		this.post_body = post_body;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_body() {
		return post_body;
	}

	public void setPost_body(String post_body) {
		this.post_body = post_body;
	}

	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", post_title=" + post_title + ", post_body=" + post_body + "]";
	}

}