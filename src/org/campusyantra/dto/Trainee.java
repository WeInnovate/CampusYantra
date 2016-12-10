package org.campusyantra.dto;

public class Trainee {

	private long id;
	private String name;
	private String email;
	private String gender;
	private int mobile;
	
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trainee(long id, String name, String email, String gender, int mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", mobile=" + mobile
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
}
