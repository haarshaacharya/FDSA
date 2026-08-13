//LL-Linked List
class LL{

     Node head;
     class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
     }

     // add first
    public void addfirst(String data){
        Node newNode =new Node(data);

        if(head == null){
           head = newNode;
           return;
        }
        
        newNode.next = head;
        head=newNode;
    }
    

    // add Last
    public void addLast(String data){
        Node newNode= new Node(data);

        if(head ==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next !=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

    public void print(){
       
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
 
    }

    public static void main(String[] args){
        LL list = new LL();
         list.addfirst("a");
         list.addfirst("is");
        list.print();

        list.addLast("List");
        list.print();

        list.addfirst("This");
        list.print();
    }
}