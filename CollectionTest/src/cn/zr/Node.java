package cn.zr;

public class Node {
    Node pre;
    Object obj;
    Node next;

    public Node(){

    }

    public Node(Node pre, Object obj, Node next) {
        this.pre = pre;
        this.obj = obj;
        this.next = next;
    }

    public Object getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getNext() {
        return next;
    }


}
