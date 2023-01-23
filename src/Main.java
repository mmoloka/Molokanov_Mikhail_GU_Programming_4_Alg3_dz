
public class Main {
    public static void main(String[] args) {
        ListNode a, b, c;
        a = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        b = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        c = new ListNode();
        ListNodeUtils.head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        for (int i = 0; i < 5; i++) {
            for (Integer val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
            a.iterator().remove();
        }

        for (int j = 0; j < 6; j++) {
            System.out.println(b);
            b = ListNodeUtils.removeFirst(b);
        }

        for (int k = 1; k < 6; k++) {
            c = ListNodeUtils.addFirst(10 * k);
            System.out.println(c);
        }

        System.out.println(ListNodeUtils.reverse(c));

    }
}