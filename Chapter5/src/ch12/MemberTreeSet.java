package ch12;

import java.util.Iterator;
import java.util.TreeSet;




public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet =new TreeSet<Member>();
		
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberId) {
		
	
		Iterator<Member> ir = treeSet.iterator();   //Collection을 순회하는 Iterator
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId=member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
		
		
	}
	public void showAllMember() {
		for(Member member: treeSet) {
			
			System.out.println(member);
		}
		System.out.println();
	}

}
