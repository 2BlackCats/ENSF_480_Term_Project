package entity;

public class User {
	private String username;
	private String password;
	private String email;
	
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void changeUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void changeEmail(String newEmail) {
		this.username = newEmail;
	}
}
