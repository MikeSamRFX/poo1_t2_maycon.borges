import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Lista {
    Node First;
    Node Last;
    int size;

    public Lista(){
        this.size = 0;
        First = new Node();
        Last = new Node();
    }

    public void pushFront(int value){


        try {
            Node insertion = new Node(value);
            if(insertion == null){
                throw new NullPointerException();
            }

            if(this.isEmpty()){
                this.First.next = insertion;
                this.Last.prev = insertion;
                insertion.next = Last;
                insertion.prev = First;
                this.size++;
                return;
            }

            this.First.next.prev = insertion;
            insertion.next = this.First.next;
            insertion.prev = this.First;
            this.First.next = insertion;
            this.size++;

            return;

        } catch (OutOfMemoryError oome) {
            System.out.println("Memory is full");
        }

    }

    public void pushBack(int value){
        try{
            if(this.isEmpty()){
                pushFront(value);
                return;
            }

            Node insertion = new Node(value);

            if(insertion == null){
                throw new NullPointerException();
            }

            this.Last.prev.next = insertion;
            insertion.prev = this.Last.prev;
            insertion.next = this.Last;
            this.Last.prev = insertion;
            size++;

            return;

        }catch (OutOfMemoryError oome) {
            System.out.println("Memory is full");
        }
    }

    public void popFront(){

        if(isEmpty()){
            throw new EmptyListExeption();
        }

        this.First.next.next.prev = this.First;
        this.First.next = this.First.next.next;
        this.size--;
    }

    public void popBack(){

        if(isEmpty()){
            throw new EmptyListExeption();
        }

        this.Last.prev.prev.next = this.Last;
        this.Last.prev = this.Last.prev.prev;
        this.size--;
    }

    public int get(int index){
        if(isEmpty()){
            throw new EmptyListExeption();
        }

        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        Node temp = this.First.next;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp.value;
    }

    public int find(int elem){
        Node temp = this.First.next;
        int k = 0;
        while(temp!=Last){
            if(temp.value == elem){
                return k; //index
            }
            k++;
            temp = temp.next;
        }
        throw new NoSuchElementException();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
}
