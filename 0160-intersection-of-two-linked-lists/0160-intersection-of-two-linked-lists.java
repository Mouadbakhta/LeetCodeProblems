/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode current1 = headA;
        ListNode current2 = headB;
        HashSet<ListNode> set = new HashSet<>();

        while (current1 !=null){
            set.add(current1);
            current1 = current1.next ;
        }
        while (current2 != null ){
            if (set.contains(current2)){
                return current2 ;
            }
            current2 = current2.next ;
        }
            
        return null ;
    }
}
