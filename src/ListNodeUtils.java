
public class ListNodeUtils {
    static ListNode head;

    public static ListNode addFirst(int value) {
        ListNode node = new ListNode();
        node.val = value;
        node.next = head;
        head = node;
        return node;
    }

    public static ListNode removeFirst(ListNode node) {
        if (node != null) {
            node = node.next;
            return node;
        } else {
            System.out.println("Список должен содержать элементы!");
        }
        return null;
    }

    public static ListNode reverse(ListNode node) {
        ListNode reversedNode = null;
        ListNode currentNode = node;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = reversedNode;
            reversedNode = currentNode;
            currentNode = nextNode;
        }
        return reversedNode;
    }
}
