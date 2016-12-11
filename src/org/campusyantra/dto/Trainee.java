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
		return "Trainee [id=" + id + ", name=" + name + ", email=" + email
				+ ", gender=" + gender + ", mobile=" + mobile + "]";
	}
	
	
}
