package Test;
import Test.ListNode;

public class Solution {
	  public ListNode selectionSort(ListNode head) {
	    // Write your solution here
	 

	    ListNode dummyHead = new ListNode(0);
	    ListNode dummy = dummyHead;
	    ListNode dummy2 = new ListNode(0);
	    dummy2.next = head;
	    while(dummy2.next != null){
	      ListNode cur = dummy2.next;
	      ListNode pre = dummy2;
	      ListNode min = cur;
	      ListNode premin = pre;
	      int minValue = cur.value;
	      while(cur != null){
	        if(cur.value < minValue){
	          premin = pre;
	          min = cur;
	        }
	        pre = cur;
	        cur = cur.next;
	      }
	      premin.next = min.next;
	      min.next = null;
	      dummy.next = min;
	      dummy = dummy.next;
	    }

	    return dummyHead.next;
	  }
	  
	  public static void main(Strgs[]) {
		  ListNode head = new ListNode(5);
		  ListNode next = new ListNode(4);
		  ListNode next2 = new ListNode(3);
		  head.next = next;
		  next.next = next2;
		  head = selectionSort(head);
		  while(head != null) {
			  System.out.println(head.value);
			  head = head.next;
		  }
		  
	  }
	}