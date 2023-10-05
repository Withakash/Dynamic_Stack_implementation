import java.util.*;
import java.lang.*;

class Stack {
  Object[] arr;
  int top;

  // constructor
  Stack() {
    arr = new Object[10];
    top = -1;
  }

  // isFull method
  boolean isFull() {
    return top == arr.length-1;
  }

  // isEmpty method
  boolean isEmpty() {
    return top == -1;
  }

  // push method
  void push(Object item) {
    if (isFull()) {
      Object[] newArr = new Object[arr.length+1];
      for(int i = 0 ; i < arr.length ; i++)
      {
        newArr[i] = arr[i];
      }
      arr = newArr ;
      arr[++top] = item;
    }
    else
      arr[++top] = item;
  }

  // pop method
  Object pop() {
    if (isEmpty()) {
      System.out.println("Stack is Empty !!");
      return -1;
    }
    return arr[top--];
  }

  void pushAll(Object ...items)
  {
    for(int i = 0 ; i < items.length ; i++)
    {
      push(items[i]);
    }
  }

  void popAll()
  {
    while(top > -1)
    {
      pop();
    }
      if(isEmpty()) System.out.println("Stack is Fully Empty Now !!");
  }

  // size method
  int size() {
    return top + 1;
  }

  // Display Method
  void display() {
    if (isEmpty()) {
      System.out.println("Stack is Empty ! Display");
    }
    for (int i = 0; i < top + 1; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}

class Sample {

  public static void main(String[] args) {

    Stack stk = new Stack();

    int a = 1;
    boolean b = true;
    Object o = null;
    int[] a2 ={1,2,3,4,5};
    int[] a3 ={1,2,3,4,5};
    int[] a4 ={1,2,3,4,5};
    Thread t = new Thread();
    List l = new ArrayList();
    stk.pushAll(a,b,o,a2,a3,a4,t,l);

    stk.display();
    stk.popAll();
    stk.display();

  }
}