package ch13;

// HashMap ���� -�˻��� ���� �ڷᱸ��
// key�� �Ǵ� ��ü�� �ߺ��� �� ���� ��ü�� ���ϼ��� �񱳸� ���� equals()�� hashCode() �޼��带 �����ؾ� ��




public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		
		memberHashMap.showAllMember();
		
	
	}
}

