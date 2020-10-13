package edu.csus.csc130.fall2020.assignment2;

/**
 * Modified by: FirstName LastName
 *
 */
public class MergeList {
	/**
	 * 
	 * Given the heads of two sorted list, the method returns the head of the merged list
	 * @param node1 head of the first sorted list
	 * @param node2 head of the second sorted list
	 * @return head of the merged list
	 * 
	 * Runtime requirement: O(n) in worst case
	 * Space requirement: O(1) in worst case
	 * 
	 * Refer to this link for Comparable interface, https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html
	 * 
	 */
	public <T extends Comparable<T>> ListNode<T> merge(ListNode<T> node1, ListNode<T> node2) {
		// to be implemented
		ListNode<T> v1 = node1;
		ListNode<T> v2 = node2;
		ListNode<T> lst = new ListNode<T>(null);
		ListNode<T> head = new ListNode<T>(null);
		head = lst;
		while(v1!=null || v2 != null) {
			
			if(v1 == null) {
				lst.next = v2;
				break;
			}			
			else if (v2 == null) { 
				lst.next = v1;
				break;
			}			
			int cmp = v1.value.compareTo(v2.value);
			if(cmp<=0) {
				lst.next = v1;
				lst = lst.next;
				v1 = v1.next;
			}
			else if(cmp>0) {
				lst.next = v2;
				lst = lst.next;
				v2 = v2.next;
			}			
		}
		
		return head.next;
	}
}
