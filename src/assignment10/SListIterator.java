package assignment10;

class SListIterator{
    Node temp;

    public SListIterator(Node head) {
        this.temp=head;
    }

    public boolean hasNext() {
        return this.temp.next != null;
    }

    public Node next() {
        temp = temp.next;
        return temp;
    }

    public void insertNode(String line){
        temp.next  = new Node(line);
        temp=temp.next;
    }

    public void removeNode(){
        this.temp.next= this.temp.next.next;
    }
}