/********************
21. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new sorted list. 
The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
********************/

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode current = newHead;
        
        while(l1 != null || l2 != null){
            if(l1 == null){
                current.next = l2;
                break;
            }
            else if(l2 == null){
                current.next = l1;
                break;
            }
            else{
                if(l1.val < l2.val){
                    current.next = l1;
                    l1 = l1.next; 
                }
                else{
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }
        }
        return newHead.next;
    }
}