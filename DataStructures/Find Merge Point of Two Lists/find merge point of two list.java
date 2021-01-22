
static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
          SinglyLinkedListNode currA = head1;
    SinglyLinkedListNode currB = head2;
    
    while (currA != currB) {
        if (currA.next == null) {
            currA = head2;
        } else {
            currA = currA.next;
        }        
        if (currB.next == null) {
            currB = head1;
        } else {
            currB = currB.next;
        }
    }
    return currA.data;
    }
    
    
    
    
    
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        ArrayList<SinglyLinkedListNode> list=new ArrayList<>();
        while(head1!=null){
            list.add(head1);
            head1=head1.next;
        }
        while(true){
            if(list.contains(head2)) return head2.data;
            
            head2=head2.next;
        }
    }
    
    
    
    
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        Stack<SinglyLinkedListNode> s1=new Stack<>();
        Stack<SinglyLinkedListNode> s2=new Stack<>();
        while(head1!=null){
            s1.push(head1);
            head1=head1.next;
        }
        while(head2!=null){
            s2.push(head2);
            head2=head2.next;
        }
        SinglyLinkedListNode temp=null;
        while(!s1.isEmpty()&&!s2.isEmpty()&&s1.peek()==s2.peek()){
            temp=s1.pop();
            s2.pop();
        }
        return temp.data;
    }
