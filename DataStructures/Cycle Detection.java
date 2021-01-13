static boolean hasCycle(SinglyLinkedListNode head) {//the questions says that there are no more than 1000 node. So we can call head=head.next; 1001 times. if the code does not throw an exception, it is clcle.
        
        try{
            for(int i=0;i<1001;i++){
                head=head.next;
            }
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    
    
    static boolean hasCycle(SinglyLinkedListNode head) {//we can check if the current node is in the arraylist we can say it is cycle else we add the current node in an arrraylist
        ArrayList<SinglyLinkedListNode> list=new ArrayList<>();
        while(head!=null){
            if(list.contains(head)) return true;
            list.add(head);
            head=head.next;
        }
        return false;

    }
