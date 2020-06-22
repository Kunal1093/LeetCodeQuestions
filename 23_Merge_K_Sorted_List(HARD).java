/**********************************
23. Merge k Sorted Lists

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
**********************************/
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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 1)
            return lists[0];
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<lists.length;i++){
            ListNode current = lists[i];
            while(current != null){
                pq.add(current.val);
                current = current.next;
            }
        }
        ListNode head = new ListNode(-1);
        ListNode current = head;
        while(!pq.isEmpty()){
            ListNode temp = new ListNode(pq.remove());
            current.next = temp;
            current = current.next;
        }
        return head.next;
        
    }
}