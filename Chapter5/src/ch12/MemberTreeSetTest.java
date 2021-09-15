package ch12;

import java.util.Comparator;
import java.util.TreeSet;

// ������ ���� TreeSet ���� Comparable�� Ȱ�� 

/* class MyCompare implements Comparator<String>{   //Comparator�� Ȱ�� : �̹� Comparable�� ������ ��� Comparator�� ���ϴ� ����� �ٽ� ������ �� ����

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2) *(-1);
	}
	
}
*/

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		
		memberTreeSet.showAllMember();
		
		
		/*TreeSet<String> set =new TreeSet<>(new MyCompare());
		set.add("����");
		set.add("����");
		set.add("����");
		
		System.out.println(set);
*/
		
	}
}

