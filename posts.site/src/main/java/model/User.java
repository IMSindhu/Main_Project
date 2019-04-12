package model;

public class User {

	private int user_id;
	private String user_name;
	private String name;
	private String email_id;
	private String password;

	public User() {
		super();
	}

	public User(int user_id, String user_name, String name, String email_id, String password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.name = name;
		this.email_id = email_id;
		this.password = password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", name=" + name + ", email_id=" + email_id
				+ ", password=" + password + "]";
	}

}
