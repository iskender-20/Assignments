package assignment_1;

class CircularNode {
    
    int data;
    CircularNode next;

    public CircularNode(int data) {
        this.data = data;
        this.next = this;
    }
}


