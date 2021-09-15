package ch11;

import java.util.HashSet;
import java.util.Iterator;




public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet =new HashSet<Member>();
		
	}
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
		
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {
		
		/*for(int i=0; i<hashSet.size(); i++) {
			Member member = hashSet.get(i);
			
			int tempId=member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(i);
				return true;
			}
			
		}
		*/
		Iterator<Member> ir = hashSet.iterator();   //Collection을 순회하는 Iterator
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId=member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
		
		
	}
	public void showAllMember() {
		for(Member member: hashSet) {
			
			System.out.println(member);
		}
		System.out.println();
	}

}
