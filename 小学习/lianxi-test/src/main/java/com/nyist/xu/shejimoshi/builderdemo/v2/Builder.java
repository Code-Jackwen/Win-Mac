package com.nyist.xu.shejimoshi.builderdemo.v2;

//����ĳ�ʦ����ʵ��һ����ʦ������n����ʳ����������ԭ��----��һְ�����һ��������Ҫ��һ����ʳ
public abstract class Builder {
	//Ϊ������������ʹ�ã������޸�protected
	protected Meal meal = new Meal();
	public abstract void makeNoodle();
	public abstract void makeStirFry();
	public Meal getResult() {

		return meal;
	}
}
