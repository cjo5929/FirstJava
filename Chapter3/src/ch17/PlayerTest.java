package ch17;
// 추상 클래스와 템플릿 메서드 간단한 레벨업구현
public class PlayerTest {

	public static void main(String[] args) {
			
		Player play1 = new Player();
		play1.play(1);
		AdvancedLevel aLevel= new AdvancedLevel();
		play1.upgradeLevel(aLevel);
		play1.play(2);
		SuperLevel sLevel = new SuperLevel();
		play1.upgradeLevel(sLevel);
		play1.play(3);
		
		
		
		
	}

}
