import java.util.LinkedList;

public class llist
{
  public static void main(String [] args){
    LinkedList<String> a = new LinkedList<String>();
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("null");
    a.add("null");
    a.add("null");

    System.out.println(a.toString());
  } 
}