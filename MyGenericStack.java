import java.util.ArrayList;

public class MyGenericStack<T> {

    int stackSize = 5;
    // stack list
    public ArrayList<T> stack = new ArrayList<>();


    public MyGenericStack() { }

    public MyGenericStack(int n) {
        this.stackSize = n;
    }

    // push an object to the stack
    public void push(T obj) {
        stack.add(obj);
    }

    // view the next object to be returned
    public T peek() {

        return stack.get(stack.size()-1);
    }

    // return the next object
    public T pop() {

        T obj = peek();
        stack.remove(peek());

        return obj;

    }

    // check if stack is empty
    public boolean isEmpty() {

        if(stack.size() < 1) {
            return true;
        }
        return false;
    }

    // get size of the stack
    public int getSize() {

        return stack.size();
    }

    // returns string representation of the stack
    @Override
    public String toString() {

         String format = "[";

        for(T obj: stack) {

            format += " " + obj + " ";
        }
        format += "]";

        return format;
    }

}
