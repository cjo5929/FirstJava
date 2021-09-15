package ch12;

import java.util.Comparator;
import java.util.TreeSet;

// 정렬을 위한 TreeSet 구현 Comparable의 활용 

/* class MyCompare implements Comparator<String>{   //Comparator의 활용 : 이미 Comparable이 구현된 경우 Comparator로 비교하는 방식을 다시 구현할 수 있음

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2) *(-1);
	}
	
}
*/

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		
		memberTreeSet.showAllMember();
		
		
		/*TreeSet<String> set =new TreeSet<>(new MyCompare());
		set.add("ㄱㄱ");
		set.add("ㄴㄴ");
		set.add("ㄷㄷ");
		
		System.out.println(set);
*/
		
	}
}

