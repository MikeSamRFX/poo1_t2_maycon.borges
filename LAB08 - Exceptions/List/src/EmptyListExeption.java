public class EmptyListExeption extends RuntimeException{
    public EmptyListExeption(){
        new RuntimeException("List is empty");
    }
}
