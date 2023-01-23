import java.util.Iterator;

public class ListNode implements Iterable<Integer> {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        ListNode node = this;
        return new ListNodeIterator(node);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");

        ListNode iterator = this;
        while (iterator != null) {
            builder.append(iterator.val).append(" -> ");
            iterator = iterator.next;
        }

        builder.append("]");

        return builder.toString();
    }

    private static class ListNodeIterator implements Iterator<Integer> {
        private ListNode node;

        public ListNodeIterator(ListNode node) {
            this.node = node;
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Integer next() {
            int toReturn = node.val;
            node = node.next;
            return toReturn;
        }

        @Override
        public void remove() {                 // TODO: 19.01.2023
            if (node.next != null) {
                while (node.next.next != null) {
                    node = node.next;
                }
                node.next = null;
            }

        }
    }
}
