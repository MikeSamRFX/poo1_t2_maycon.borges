public class Stack {
    List stack;

    public Stack () {
        this.stack = new List();
    }

    public void push(int value){
        stack.pushFront(value);
    }

    public int size(){
        return stack.size();
    }

    public void pop(){
        stack.popFront();
    }

    public int top(){
        return stack.front();
    }

    public void print(){
        stack.print();
    }
}
