package com.nyist.xu.shejimoshi.builderdemo.v2;
/**
 * 
 * ���Ƿ�����������ظ����룬����Ӧ�ð��ظ��������ߣ����ڽӿڷ���ľ�з�����
 * ���getResult�����޷���ȡ��------------���ǲ���ʹ�ýӿ��ˣ��ó�����
 *
 */
public class ConBuilder2 extends Builder {
	@Override
	public void makeNoodle() {
		meal.setNoodle("����");

	}

	@Override
	public void makeStirFry() {
		meal.setStirFry("�ཷ����");

	}
}
