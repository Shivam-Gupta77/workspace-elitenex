package Jun19;

public class LinkedLIstExam {

    public static void main(String[] args){
        LinkedListE lists = new LinkedListE();
        lists.pushBack(2);
        lists.pushBack(200);
        lists.pushFront(3);
        lists.pushFront(100);
        lists.print();
        lists.popFront();
        lists.search(30);
        lists.print();

    }
}

class LinkedListE {
    Node head = null;
    Node tail = null;

    void popBack(){
        Node temp = head;
        tail = null;
        while(temp != null){
            if(temp.ref == null){
                tail = temp;
            }
            temp = temp.ref;
        }


    }

    void popFront(){
        if(head != null){
            Node node = head;
            head = head.ref;
            System.out.println("pop " + node.data);
            node = null;
        }
    }

    void search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                System.out.println("present");
            }
            temp = temp.ref;
        }

    }

    void pushFront(int data){
        Node newNode = new Node(data);
        if(head != null){
            newNode.ref = head;
            head = newNode;
        }else{
            head = newNode;
        }
    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.ref;
        }
    }

    void pushBack(int data){
        Node n1 = new Node(data);
        if(head == null){
            head = n1;
            tail = n1;
        }else{
            tail.ref = n1;
            tail = n1;
        }
    }
}


class Node{
    int data;
    Node ref;
    Node(int data){
        this.data = data;
    }
}