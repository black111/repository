package cn.zr;

public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {

    }
    public void add(Object e){
        if(null == first){
            Node n = new Node();
            n.setPre(null);
            n.setObj(e);
            n.setNext(null);
            first = n;
            last = n;
        }else{
            Node n = new Node();
            n.setPre(last);
            n.setObj(e);
            n.setNext(null);

            last.setNext(n);

            last = n;
        }

        size++;
    }
    public int size(){
        return size;
    }

    public Object get(int index){
        Node current =null;
        if(null==first ){

        }else{
            changeIndex(index);
            current = first;
            for(int i =0;i<index;i++){
                current = current.next;

            }
            return current.obj;
        }
        return current;
    }
    public void remove(int index){
        changeIndex(index);
        Node current = node(index);

        if(current!=null){
            Node up = current.pre;
            Node down = current.next;
            up.next = down;
            down.pre = up;
            size --;
        }
    }
    public void changeIndex(int index){
        if(index<0||index>=size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public Node node(int index){
        Node current =null;

        changeIndex(index);
        current = first;
        for(int i =0;i<index;i++){
            current = current.next;

        }
        return current;
    }
    public static void main(String[] args) {
        MyLinkedList ml= new MyLinkedList();
        ml.add(3);
        ml.add(4);
        ml.add(5);
//        System.out.println(ml.get(1));
        ml.remove(2);
        System.out.println(ml.size);
    }

}
