// Definition for singly-linked list.
/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        ListNode current = head;
        while (current.next != null) {
            System.out.println("while:  " + current.val);
            if (set.contains(current.val)) {
                int va = set.size();
                for (int i = 0; i <= 100; i++) {
                    if (current.next != null ){
                        set.add(current.val);
                    }else {return false ; }

                    System.out.println("for:  " + current.val);
                    current = current.next;
                }
                if (va == set.size()) {
                    return true;
                }
                // return true ; 
            } else {
                set.add(current.val);
            }
            current = current.next;
        }
        return false;
    }
}