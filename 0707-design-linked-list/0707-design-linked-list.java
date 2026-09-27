class MyLinkedList {
    private class Node {
        int data;
        Node next;

        public Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode; // Fix: Move tail forward
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        
        Node newNode = new Node(val);
        Node temp = head;
        // Traverse to the node right BEFORE the insertion index
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        
        if (index == 0) {
            head = head.next;
            if (head == null) { // If the list becomes empty, clear tail too
                tail = null;
            }
            size--;
            return;
        }
        
        Node temp = head;
        // Traverse to the node right BEFORE the deletion index
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        
        // If deleting the last node, update the tail pointer
        if (temp.next == tail) {
            tail = temp;
        }
        
        temp.next = temp.next.next;
        size--;
    }
}
