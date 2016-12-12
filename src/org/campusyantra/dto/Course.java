package org.campusyantra.dto;

import java.util.List;

public class Course {

	private int id;
	private String name;
	private String trainer;
	private List<String> modules;
	public Course(int id, String name, String trainer, List<String> modules) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
		this.modules = modules;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", trainer=" + trainer
				+ ", modules=" + modules + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public List<String> getModules() {
		return modules;
	}
	public void setModules(List<String> modules) {
		this.modules = modules;
	}
	
	
	
	
	
}
