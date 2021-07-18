class Main {
  public static boolean isPalindrome(LinkedListNode H){
    LinkedListNode n = reverseAndCopy(H);//reverse the Linked List to check for palindrome
    return compare(H,n); //compare with reversed list
  }
  public static LinkedListNode reverseAndCopy(LinkedListNode H){
    LinkedListNode head = null;
    while(H!=null){ //reverse linked list by making head the tail of new list and making each current node the .next of the next one.
      LinkedListNode n = new LinkedListNode(H.data);
      n.next=head;
      head=n;
      H=H.next;
    }
    return head;
  }
  public static boolean compare(LinkedListNode h,LinkedListNode n){
    while(h!=null && n!=null){//compare data of both nodes
      if(h.data!=n.data) return false;
      h=h.next;
      n=n.next;
    }
    return h==null && n==null;//linked Lists are palindromes only if same length
  }
  public static void main(String[] args) {
    LinkedListNode T = new LinkedListNode('T');
    LinkedListNode A = new LinkedListNode('A');
    LinkedListNode C = new LinkedListNode('C');
    LinkedListNode O = new LinkedListNode('O');
    LinkedListNode C2= new LinkedListNode('C');
    LinkedListNode A2= new LinkedListNode('A');
    LinkedListNode T2= new LinkedListNode('T');
    T.next=A;A.next=C;C.next=O;O.next=C2;C2.next=A2;A2.next=T2;T2.next=null;
    System.out.print(isPalindrome(T));
  }
}