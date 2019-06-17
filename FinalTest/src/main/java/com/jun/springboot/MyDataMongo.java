package com.jun.springboot;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class MyDataMongo {
	@Id

	private String id;
	
	private String name;
	private String eMail;
	private String phonenumber;
	private Date date;
	
	private int age;
	private double tall;
	private double weight;
	private double bmi;
	
	
	public MyDataMongo(String name, String eMail, String phonenumber,int age ,double tall, double weight) {

		super();
		this.name = name;
		this.eMail = eMail;
		this.phonenumber = phonenumber;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
		this.date = new Date();	

		double tallCM = tall / 100.0;
		this.bmi = Math.round((weight / (tallCM * tallCM))*10)/10.0;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
}
