public class Node{
    long key;
    String data;
    Node next;

    public Node(long k, String d){
        key = k;
        data = d;
        next = null; }
    /*
    public Node(){
        key = 0;
        data = "";
        next = null; }
    */
    public String toString() {
        return "<" + key + ", " + data + ", " + next + ">" ;
    }
}



