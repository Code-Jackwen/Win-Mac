package com.nyist.xu.shejimoshi.builderdemo.v3;

import java.util.Date;
///ϣ����������ʱ��һ���Ը����������ֵ
// ����1����Բ�ͬ������ṩ��Ӧ�汾�Ĺ��캯��------���캯����࣬���ľ�ж�Ӧ�汾�Ĺ��캯����Ҫ�޸�
public class User {
	private int id;
	private String name;
	private String pwd;
	private int age;
	private Date birthday;
	private String provice;
	private String city;
	
	public User(String name) {
		super();
		this.name = name;
	}
	
	public User(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	///
	public User(int id, String name, String provice, String city) {
		super();
		this.id = id;
		this.name = name;
		this.provice = provice;
		this.city = city;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getProvice() {
		return provice;
	}
	public void setProvice(String provice) {
		this.provice = provice;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
