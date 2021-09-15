package ch13;

// HashMap 구현 -검색을 위한 자료구조
// key가 되는 객체는 중복될 수 없고 객체의 유일성을 비교를 위한 equals()와 hashCode() 메서드를 구현해야 함




public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		
		memberHashMap.showAllMember();
		
	
	}
}

