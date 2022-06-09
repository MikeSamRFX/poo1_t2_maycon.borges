public class Queue {
    List queue;

    public Queue(){
        this.queue = new List();
    }

    public void push (int value){
        queue.pushBack(value);
    }

    public int size (){
        return queue.size();
    }

    public void pop (){
        queue.popFront();
    }

    public int front (){
        return queue.front();
    }

    public void print (){
        queue.print();
    }
}
