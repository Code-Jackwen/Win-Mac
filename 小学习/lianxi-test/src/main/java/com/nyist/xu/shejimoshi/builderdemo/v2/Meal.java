package com.nyist.xu.shejimoshi.builderdemo.v2;

//���ǵĲ�Ʒ�ɶ����ɲ���
//�������Ƚϸ���
public class Meal {
	private String noodle;// ���棬���棬����
	private String stirFry;// �������������ཷ�������ⶡ��ţ�⣬�㹽��

	public String getNoodle() {
		return noodle;
	}

	public void setNoodle(String noodle) {
		this.noodle = noodle;
	}

	public String getStirFry() {
		return stirFry;
	}

	public void setStirFry(String stirFry) {
		this.stirFry = stirFry;
	}

	@Override
	public String toString() {
		return "Meal [noodle=" + noodle + ", stirFry=" + stirFry + "]";
	}

}
