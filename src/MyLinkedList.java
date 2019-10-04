
//tạo lớp MyLinkedList chưa lớp Node;
public class MyLinkedList {
    private  Node head;     //2. Khai báo biến head thuộc class Node
    private int numNodes = 0;    //3. Khai báo biến numNode là số lượng phần tử trong danh sách, mặc định = 0
    public MyLinkedList(Object data){   //4. Constructor
        head = new Node(data);
    }
    //1. tạo class Node này trước
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
        public void add(int index, Object data) {
            Node temp = head;
            Node holder;

            for(int i=0; i < index-1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }
        public void addFirst(Object data) {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
            numNodes++;
        }
        public Node get(int index){
            Node temp=head;
            for(int i=0; i<index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        public void printList() {
            Node temp = head;
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }



}
