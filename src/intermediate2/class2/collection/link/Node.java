package intermediate2.class2.collection.link;

//필드의 접근 제어자는 private로 선언하는것이 좋지만, 여기선 디폴드 접근 제어자 사용.
public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    /*@Override
    public String toString() {
        return "Node{" +
            "item=" + item +
            ", next=" + next +
            '}';
    }*/

    //[A -> B -> C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //루프에서 문자를 더할 땐 StringBuilder가 좋음
        Node x = this; //일단 자기자신 x001
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append(" -> ");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
