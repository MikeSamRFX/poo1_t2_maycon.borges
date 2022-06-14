public class List {

    Node start;
    Node end;
    int size;

    public List () {
        this.start = new Node();
        this.end = new Node();
        this.size = 0;
    }

    public void pushBack(int i){
        if(size == 0)
        {
            Node temp = new Node(i, null, null);
            start = temp;
            end = temp;
            size += 1;
        }

        else
        {
            Node temp = new Node(i, null, end);
            end.next = temp;
            end = temp;
            size += 1;
        }
    }

    public void pushFront(int i){
        if(size == 0)
        {
            Node temp = new Node(i, null, null);
            start = temp;
            end = temp;
            size += 1;
        }

        else
        {
            Node temp = new Node(i, start, null);
            start.back = temp;
            start = temp;
            size += 1;
        }
    }


    public void popBack(){
        if (start.next == null){
            end = null;
            start = null;
            size = 0;
            return;
        }
        end.back.next = null;
        end = end.back;
        size -= 1;
        return;
    }


    public void popFront(){
        if (start.next == null){
            start = null;
            end = null;
            size = 0;
            return;
        }
        start.next.back = null;
        start = start.next;
        size -= 1;
        return;
    }

    public int size(){
        return size;
    }

    public void insert (int position, int value) {
        if(position < 0 || position > size + 1){
            throw new RuntimeException("The position you trying to enter is invalid (less than zero or more than the size of the list!)");
        }else if (position == 0){
            pushFront(value);
            return;
        }else if(position == size){
            pushBack(value);
            return;
        }else{
            Node temp = start.next;
            for(int i = 1; i < position - 1; i++){
                temp = temp.next;
            }
            Node temp2 = temp.next;
            Node entering = new Node (value, temp2, temp);
            temp2.back = entering;
            temp.next = entering;
            size += 1;
            return;
        }
    }

    public void insert_sorted (int value){
        if(size == 0){
            pushBack(value);
        }else if(end.i < value){
            pushBack(value);
        }else if(start.i > value){
            pushFront(value);
        }else{
            Node temp = start;
            while (!(temp.i < value && value < temp.next.i)){
                temp = temp.next;
            }
            Node temp2 = temp.next;
            Node entering = new Node (value, temp2, temp);
            temp2.back = entering;
            temp.next = entering;
            size += 1;
        }
    }

    public void erase_data(int value){
        if (value == start.i){
            start.next.back = null;
            start = start.next;
            size -= 1;
        }else if(value == end.i){
            end.back.next = null;
            end = end.back;
            size -= 1;
        }else{
            Node temp = start.next;
            while (value != temp.i){
                temp = temp.next;
                if(temp == null){
                    throw new RuntimeException("This value does not exist in this list!");
                }
            }
            temp.back.next = temp.next;
            temp.next.back = temp.back;
            size -= 1;
        }
    }

    public void erase_pos(int position){
        if(position < 0 || position >= size){
            throw new RuntimeException("The position you trying to erase does not exist (less than zero or over te list size 'start at 0')");
        }else if(position == 0){
            start.next.back = null;
            start = start.next;
            size -= 1;
        }else if(position == size - 1){
            end.back.next = null;
            end = end.back;
            size -= 1;
        }else{
            Node temp = start.next;
            for (int i = 1; i < position; i++){
                temp = temp.next;
            }
            temp.back.next = temp.next;
            temp.next.back = temp.back;
            size -= 1;
        }
    }

    public int front(){
        return start.i;
    }

    public int back(){
        return end.i;
    }

    public int find_pos(int position){
        if (position < 0 || position > size){
            throw new RuntimeException("The position you trying to erase does not exist (less than zero or more than list size)");
        }else if(position == 0){
            return front();
        }else if(position == size){
            return back();
        }else{
            Node temp = start.next;
            for (int i = 1; i < position; i++){
                temp = temp.next;
            }
            return temp.i;
        }
    }

    public boolean find_data(int value){
        if (value == start.i){
            return true;
        }else if(value == end.i){
            return true;
        }else{
            Node temp = start.next;
            while (value != temp.i){
                temp = temp.next;
                if (temp == null){
                    return false;
                }
            }

            return true;

        }
    }

    public boolean empty(){
        if (size == 0)
                return true;
        else
                return false;
    }


    public void print(){
        Node temp = start;
        if (this.empty()){
            throw new RuntimeException("Empty list");
        }
        while (temp.next != null) {
            System.out.println(temp.i);
            temp = temp.next;
        }
        System.out.println(temp.i);
    }

}
