package com.sapient.logicals;

public class CompareLinkedList {

	public int CompareLists(Node headA, Node headB) {

		if(headA == null && headB == null){
			return 1;
		}

		while(headA.data == headB.data){
			if(headA.next == null){
				if(headB.next == null){
					return 1;
				}else{
					return 0;
				}
			}
			headA = headA.next;
			headB = headB.next;       
		}
		return 0;
	}
}
