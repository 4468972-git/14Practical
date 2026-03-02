public class linkedList {

    protected static int length;
    protected Node head;

    public linkedList() {
        head = new Node(0, "head Node");
        length = 0;
    }

    public void insert(Node n) {
        n.next = head.next;
        head.next = n;
        length++;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void clear() {
        head.next = null;
        length = 0;
    }

    public void display() {
        Node here = head.next;
        while (here != null) {
            System.out.println(
                    "Key = " + here.key +
                            " Data = " + here.data);
            here = here.next;
        }
        System.out.println("length=" + length);
    }
}
