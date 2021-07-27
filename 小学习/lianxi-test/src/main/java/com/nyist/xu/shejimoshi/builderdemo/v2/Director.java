package com.nyist.xu.shejimoshi.builderdemo.v2;

//ָ���ߣ�վ�ڴ��ڵİ���
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	public Meal construct() {
		builder.makeNoodle();
		builder.makeStirFry();
		return builder.getResult();
	}
}
