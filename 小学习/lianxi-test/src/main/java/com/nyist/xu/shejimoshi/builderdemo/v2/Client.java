package com.nyist.xu.shejimoshi.builderdemo.v2;

public class Client {

	public static void main(String[] args) {
		//��Ҫ�Լ�������
		Builder builder=new ConBuilder1();
		Director director=new Director(builder);
		Meal meal=director.construct();
		System.out.println(meal);

	}

}
