package com.kong.strategy;

public class Cat implements Comparable {
	private int age;
	private String name;
	private Comparator comparator;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat(int age, String name) {
		this(age, name, new CatAgeComparator());
	}
	
	

	public Cat(int age) {
		this.age = age;
	}

	public Cat(int age, String name, Comparator comparator) {
		this.age = age;
		this.name = name;
		this.comparator = comparator;
	}

	public Comparator getComparator() {
		return comparator;
		
	}

	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}

	public int compareTo(Object one) {
		return comparator.compare(this, one);
	}

}
