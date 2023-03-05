class LL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    void addLast(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            return;
        }
        Node c = head;
        while(c.next!=null){
            c = c.next;
        }
        c.next = n;
    }
        void print(){
        if(head==null){
            System.out.println("Empty");
        }
        Node c = head;
        while(c!=null){
            System.out.print(c.data+"->");
            c = c.next;
        }
       System.out.print("null");
    }
    public Node addNode(Node head){
        String s = "";
        Node c = head;
        while(c!=null){
            s+=c.data;
            c=c.next;
        }
        //System.out.println();
        // System.out.println(s);
        int n = Integer.parseInt(s)+1;
        //System.out.println(n);
        head = null;
        String p = String.valueOf(n);
        int y = 0;
        for(int i=0;i<p.length();i++){
            y = p.charAt(i)-48;
            addLast(y);
        }
        return head;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        
        list.print();
        System.out.println();
        list.addNode(list.head);
        list.print();
    }
}