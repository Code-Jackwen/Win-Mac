package com.nyist.xu.shejimoshi.builderdemo.v1;

public class ConBuilder1 implements Builder {
	private Meal meal = new Meal();

	@Override
	public void makeNoodle() {
		meal.setNoodle("������");
	}

	@Override
	public void makeStirFry() {
		meal.setStirFry("����������");
	}

	@Override
	public Meal getResult() {

		return meal;
	}

}
