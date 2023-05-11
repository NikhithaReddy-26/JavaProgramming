package assignment10;

class Node{
    String line;
    Node next;
    Node(String given_line){
        this.line=given_line;
        this.next=null;
    }

    @Override
    public String toString() {
        if(this.line == null){
            return "null";
        }
        else{
            return this.line;
        }
    }
};
