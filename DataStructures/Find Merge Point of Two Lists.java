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
