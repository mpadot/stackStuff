public class Driver {
    public static void main(String[] args) {
        stack ll = new stack();

        ll.push(5);
        ll.push(6);
        ll.push(7);
        ll.push(8);
        ll.push(9);
        ll.push(10);
        ll.push(11);
        ll.printList();
        ll.pop();

        ll.printList();


    }
}
