package ch17;
// �߻� Ŭ������ ���ø� �޼��� ������ ����������
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
