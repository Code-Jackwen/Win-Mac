package com.nyist.xu.shejimoshi.builderdemo.v1;
/**
 * 
 * ���Ƿ�����������ظ����룬����Ӧ�ð��ظ��������ߣ����ڽӿڷ���ľ�з�����
 * ���getResult�����޷���ȡ��------------���ǲ���ʹ�ýӿ��ˣ��ó�����
 *
 */
public class ConBuilder2 implements Builder {
	private Meal meal = new Meal();

	@Override
	public void makeNoodle() {
		meal.setNoodle("����");

	}

	@Override
	public void makeStirFry() {
		meal.setStirFry("�ཷ����");

	}

	@Override
	public Meal getResult() {
		return meal;
	}

}
