package in.ineruon.quiz;

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int val) {
		this.val = val;
	}
}

public class Question02 {
	// inputs l1 = [2,4,3] and l2 = [5,6,4] output = [7,0,8]

	public static ListNode reverseSum(ListNode l1, ListNode l2) {

		ListNode l3 = new ListNode(0);
		ListNode curr = l3;
		int carry = 0;

		while (l1 != null && l2 != null) {
			int sum = carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			carry = sum / 10;
		}
		
		if(carry > 0) {
			curr.next = new ListNode(carry);
		}
		return l3.next;

	}
}
