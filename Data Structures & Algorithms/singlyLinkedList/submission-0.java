class LinkedList {

    private static class ListNode {
		int val;
		ListNode next;
		ListNode (int val) {
			this.val = val;
			this.next = null;
		}
	}
		
    private final ListNode head; //dummy node, list starts at head.next
    private ListNode tail;

    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
    ListNode curr = head.next;
    int i=0;
    
    while (curr != null) {
        if (i == index) { return curr.val; }
        i++;
        curr = curr.next;
    }
    return -1; //out of bounds
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        
        if (newNode.next == null) {
            tail = newNode; //list was empty  
        }
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        tail.next = newNode;
        tail = newNode;
    }

    public boolean remove(int index) {
        ListNode prev = head;
        
        for (int i = 0; i < index && prev.next !=null; i++){
            prev = prev.next;
        }
        if (prev.next == null) return false; //out of bounds
        if (prev.next == tail) tail = prev; // if elem to remove is tail, move tail back
        prev.next = prev.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        for (ListNode curr = head.next; curr !=null; curr = curr.next){
            values.add(curr.val);
        }
        return values;
    }
}
