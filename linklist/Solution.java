class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;

            if (f == s) {
                // Cycle detected!
                int nLength = 1; // Start at 1 to include the current node
                s = s.next;
                while (s != f) {
                    s = s.next;
                    nLength++;
                }
                System.out.println("Cycle detected! Length: " + nLength);
                return true; 
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 1. Create nodes: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // 2. Link them
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // 3. Create a cycle: Point -4 back to 2 (the second node)
        node4.next = node2;

        // 4. Run the check
        Solution sol = new Solution();
        boolean result = sol.hasCycle(head);

        System.out.println("Does it have a cycle? " + result);
    }
}