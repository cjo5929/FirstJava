package ch09;

//�߻�Ŭ���� 
public class ComputerTest {

	public static void main(String[] args) {
			Computer computer =new DeskTop();
			
			computer.display();
			computer.typing();
			
			NoteBook note = new MyNoteBook();
			note.display();
			note.typing();
	}

}
