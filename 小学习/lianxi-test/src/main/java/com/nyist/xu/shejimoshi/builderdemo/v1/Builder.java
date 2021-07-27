package com.nyist.xu.shejimoshi.builderdemo.v1;

//德先的设计模式

//����ĳ�ʦ����ʵ��һ����ʦ������n����ʳ����������ԭ��----��һְ�����һ��������Ҫ��һ����ʳ
public interface Builder {
	public abstract void makeNoodle();
	public abstract void makeStirFry();
	public abstract Meal getResult();
	
}
