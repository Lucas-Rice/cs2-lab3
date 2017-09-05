public class StackTester {
  public static void main (String [] args) {
    LinkedStack<Character> ls = new LinkedStack<Character>();

    try {
      ls.push (new Character ('a'));
      ls.push (new Character ('b'));
      ls.push (new Character ('c'));
      System.out.println(ls);
    } catch (EmptyStackException e) {
      System.out.println ("Stack is empty");
    }
  }
}
