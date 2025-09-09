public class LinkedStack<T> implements StackADT<T> {
  private LinearNode<T> top;  //A reference to the top of the stack
  private int count;       //The number of items on the stack

  //Constructor
  public LinkedStack() {
    count = 0;
    top = null;
  }

  public T pop() throws EmptyStackException {
    //Removes and returns the top item on the stack
    T user = top.getElement();
    count--;
    return user;
  }

  public T peek() throws EmptyStackException {
    //Returns the first item in the list
    //currently not implemented
    return top.getElement();
  }

  public void push (T element) {
    //Add this data to the top of the stack
    LinearNode<T> temp = new LinearNode<T>(element);
    temp.setNext(top);     //Set next field to head references
    top = temp;            //Set head to reference the new node
    count++;
  }

  public boolean isEmpty() {
    //TASK: return true if 0 items on the stack; false otherwise
    return count == 0;
  }
  
  public boolean contains(T element) {
    boolean result = false;
    if (top==null){
      return false;
    }
    else {
      LinearNode<T> trav = top;
      while (top!=null){
        if (trav.getElement().equals(element)){
          result = true;
          break;
        }
      trav = trav.getNext();
      }
    }
    return result;
  }
  public String toString() {
    //Returns the list contents as a String
    LinearNode<T> trav = top;
    String cat = "";
    while (trav != null){
      cat = cat + trav.getElement().toString();
      trav = trav.getNext();
    }
    return cat;
  }
}

