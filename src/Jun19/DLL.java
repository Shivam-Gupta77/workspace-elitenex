package Jun19;

public class DLL {
    public static void main(String[] args){

    }
}

class DLinkList{
    Nodee head = null;
    Nodee tail = null;

    void pushBack(int data){
        Nodee newNode = new Nodee(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail.prev = head;
        }

    }

}

class Nodee{
    int data;
    Nodee prev;
    Nodee next;

    Nodee(int data){
        this.data = data;
    }
}
