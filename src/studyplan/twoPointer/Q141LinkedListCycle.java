package studyplan.twoPointer;

public class Q141LinkedListCycle {

    public static void main(String [] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(-4);
        listNode.next.next.next.next = listNode.next;

        System.out.println(hasCycle(listNode));

        listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next = listNode;
        System.out.println(hasCycle(listNode));

        listNode = new ListNode(1);
        System.out.println(hasCycle(listNode));
    }

    static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
        next = null;
    }
}
