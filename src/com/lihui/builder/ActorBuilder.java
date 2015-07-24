package com.lihui.builder;

public abstract class ActorBuilder {
	protected Actor actor = new Actor();

	public abstract void buildType();

	public abstract void buildSex();

	public abstract void buildFace();

	public abstract void buildCostume();

	public abstract void buildHairstyle();

	// ��������������һ����������Ϸ��ɫ����
	public Actor createActor() {
		return actor;
	}
}

// Ӣ�۽�ɫ�����������彨����
class HeroBuilder extends ActorBuilder {
	public void buildType() {
		actor.setType("Ӣ��");
	}

	public void buildSex() {
		actor.setSex("��");
	}

	public void buildFace() {
		actor.setFace("Ӣ��");
	}

	public void buildCostume() {
		actor.setCostume("����");
	}

	public void buildHairstyle() {
		actor.setHairstyle("Ʈ��");
	}
}

// ��ʹ��ɫ�����������彨����
class AngelBuilder extends ActorBuilder {
	public void buildType() {
		actor.setType("��ʹ");
	}

	public void buildSex() {
		actor.setSex("Ů");
	}

	public void buildFace() {
		actor.setFace("Ư��");
	}

	public void buildCostume() {
		actor.setCostume("��ȹ");
	}

	public void buildHairstyle() {
		actor.setHairstyle("���糤��");
	}
}

// ��ħ��ɫ�����������彨����
class DevilBuilder extends ActorBuilder {
	public void buildType() {
		actor.setType("��ħ");
	}

	public void buildSex() {
		actor.setSex("��");
	}

	public void buildFace() {
		actor.setFace("��ª");
	}

	public void buildCostume() {
		actor.setCostume("����");
	}

	public void buildHairstyle() {
		actor.setHairstyle("��ͷ");
	}
}
