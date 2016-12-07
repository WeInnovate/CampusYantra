package org.campusyantra.dto;

public class Course {

	private int id;
	private String name;
	private String trainer;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String name, String trainer) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", trainer=" + trainer
				+ "]";
	}
	
	
}
