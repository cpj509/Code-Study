package collection.list;

import java.util.ArrayList;

class MyStack{
    private ArrayList<String> arrayStack;

    public MyStack() {
        arrayStack = new ArrayList<>();
    }

    public void push(String data){
        arrayStack.add(data);
    }

    public boolean isEmpty(){
        return arrayStack.size() <= 0;
    }

    public String pop(){
        int len = arrayStack.size();
        if(isEmpty()){
            return null;
        }

        return arrayStack.remove(len-1);
    }
}

public class ArrayStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("pig");
        stack.push("chicken");
        stack.push("cow");

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        while(!stack.isEmpty()){
            String animal = stack.pop();
            System.out.println(animal);
        }

    }
}
