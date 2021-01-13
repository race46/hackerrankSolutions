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

static boolean hasCycle(SinglyLinkedListNode head) {//better than above
        
            for(int i=0;i<1001;i++){
                if(head==null)return false;
                head=head.next;
            }
            return true;       
        
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

static boolean hasCycle(SinglyLinkedListNode head) {// I have written this code because in normal life this is the way how i detect this issue. if the code doesnot finish in a few seconds, i terminate it and say there is an infinite loop
        long l=System.currentTimeMillis();
        while(System.currentTimeMillis()-l<500&&head!=null)head=head.next; //if it doesn't reach the end in 500 milisecond we assume that this is and infinite loop
        
        return head!=null;// it head becames null it is not infinite loop otherwise it is
    }


static boolean hasCycle(SinglyLinkedListNode head) {// this solution is exist on youtube Hackerrank channel actually. It is very good i recommend you to have a look at there.
        if(head==null)return false;
        SinglyLinkedListNode fast=head.next;
        SinglyLinkedListNode slow=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            if(fast==slow)return true;
            fast=fast.next.next;
            slow=slow.next;
        }

    return false;
    }
