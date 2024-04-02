import javax.xml.transform.Source;

public class llpractice {
    class Node{
        int data;
        Node next;
    }
    Node head=null;
    Node tail=null;
    public void insertatbeginning(int val){
        Node newNode=new Node();
        newNode.data=val;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"");
            temp=temp.next;
        }
        System.out.println("");
    }
    public void reverselist(Node temp){
        if(temp==null){
            return;
        }
        reverselist(temp.next);
        System.out.println(temp.data+"");
    
    }
    public void insertatend(int val){
       Node newNode=new Node();
       newNode.data=val;
       if(head==null){
        head=newNode;
       }
       else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            if(temp.next==null){
                temp.next=newNode;
                newNode.next=null;
            }
        }
       }
    }
    public void insertatspecificposition(int val,int pos){
        Node newNode=new Node();
        newNode.data=val;
        Node temp=head;
        Node prev=null;
        int count=1;
    
        if(pos==1){
            newNode.next=head;
            head=newNode;
            
        }
        while(temp!=null){
            count++; 
            prev=temp;
             temp=temp.next;
            if(count==pos){
                prev.next=newNode;
              newNode.next=temp;
            

            }
        }

    }

   public void deleteSpecificValue(int val){
        Node temp=head;
        Node prev=null;
        if(val==head.data){
            head=head.next;
        }
       else{while(temp.data!=val){
           prev=temp;
            temp=temp.next;
        
            }
         prev.next=temp.next;

        }} 
        public Node middleNode(){
            Node fast=head;
            Node slow=head;
            while( fast!=null && fast.next!=null ){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
        public void attheEnd(){

        }

   
    public static void main(String[] args) {
       llpractice list=new llpractice(); 
       list.insertatbeginning(5);
       list.insertatbeginning(7);
       list.insertatbeginning(9);
    //    list.print();
    //    list.reverselist(list.head);
    //    list.insertatend(2);
    //    list.print();
      // list.insertatspecificposition(8,1);
       list.print();
   //    list.deleteSpecificValue(2);
    //   list.print();
       System.out.println(list.middleNode().data);
       
        
    }
}
