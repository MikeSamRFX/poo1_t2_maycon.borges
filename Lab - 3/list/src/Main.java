public class Main {

    public static void main(String[] args) {
        Stack s = new Stack();
        Queue q = new Queue();

        for (int i = 0; i < 10; i ++){
            s.push(i);
            q.push(i);
        }
        System.out.println("--------------------------");
        System.out.println(s.size() + " size " + q.size());
        System.out.println("----------Pilha-----------");
        s.print();
        System.out.println("----------Fila------------");
        q.print();
        System.out.println("--------------------------");
        for (int i = 0; i < 10; i ++){
            int a, b;
            a = s.top();
            b = q.front();
            System.out.println(a + " top , front " + b);
            s.pop();
            q.pop();
        }
        System.out.println("--------------------------");
        System.out.println(s.size() + " size " + q.size());
    }

}
