public class StackTester {
  public static void main (String [] args) {
    // Create an empty linked stack named ls
    LinkedStack<Character> ls = new LinkedStack<Character>();

    // Push several items onto the stack and print the
    // contents with an implicit call to toString method

    ls.push(new Character('a'));
    ls.push(new Character('b'));
    ls.push(new Character('c'));
    System.out.println(ls);

    System.out.println(ls.contains('b'));

    // Popping the stack has the potential of throwing an
    // exception, so place inside a try catch block

    try {
      ls.pop();
      ls.pop();
      ls.pop();
      ls.pop();
    } catch (EmptyStackException e) {
      System.out.println("Stack is empty");
    } 
  }
}

