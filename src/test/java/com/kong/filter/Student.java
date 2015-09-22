package com.kong.filter;

public class Student implements Comparable<Student>{

	private int id;
	private String name;

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

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int compareTo(Student o) {
		if(o.getId() > this.id) return 1;
		else if (o.getId() < this.id) return -1;
		return 0;
	}

}
