package com.nyist.xu.shejimoshi.builderdemo.v2;

public class ConBuilder1 extends Builder {

	@Override
	public void makeNoodle() {
		meal.setNoodle("������");
	}

	@Override
	public void makeStirFry() {
		meal.setStirFry("����������");
	}

}
