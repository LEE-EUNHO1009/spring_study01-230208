package com.eunocompany.test.ditest;

public class Student {

	private String name;
	private int age;
	private int gradeNum;
	private Score score;
	private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int gradeNum, Score score, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.score = score;
		this.address = address;
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
