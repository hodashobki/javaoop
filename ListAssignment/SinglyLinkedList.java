public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // Create a constructor method that sets the head to null of your SinglyLinkedList objects
        this.head=null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    } 
    // Create a remove() method that will remove a node from the end of your list
    public void remove(){
        if(this.head != null){
            Node runner = this.head;
            // if (runner.next.next!=null){}
            while(runner.next.next != null){
                runner = runner.next;
            }
            runner.next = null;
        }
    }
    // Create printValues() method that will print all the values of each node in the list in order
    public void printValues() {
    	if(this.head != null){
            Node runner = this.head;
            while(runner.next != null){
                System.out.println(runner.value);
                runner =runner.next;
            }
        }
    }
}