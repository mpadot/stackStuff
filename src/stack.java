class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
class stack {
    Node head;
    Node tail;

    public void push(int data) {
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        else{
            head = head.next;
        }
    }
    public void printList(){
        Node current = head;
        while(current.next != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

}
