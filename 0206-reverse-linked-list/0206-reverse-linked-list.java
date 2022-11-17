/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.Stack; //import

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode ret = new ListNode(), cur = ret;
        
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        
        while (!stack.empty()) {
            cur.next = new ListNode(stack.peek());
            cur = cur.next;
            stack.pop();
        }
        return ret.next;
    }
}