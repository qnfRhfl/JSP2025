package member;

import java.sql.*;

public class Member {
	private int id;
	private String username;
	private String company;
	private Date birthday;
	private String email;

	public void setId(int id){
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}

