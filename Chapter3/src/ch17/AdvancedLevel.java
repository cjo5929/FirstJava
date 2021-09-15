package ch17;

public class AdvancedLevel extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("빨리 달립니다");
	}
	@Override
	public void jump() {
		System.out.println("높이 jumpe 합니다");
	}

	@Override
	public void turn() {
		System.out.println("turn 아직 안 배움");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 중급자 레벨 입니다. ******");
	}

}
