import java.util.Set;
import java.util.TreeSet;

public class tree
{
   public static void main(String[] args){
        Set<String>set = new TreeSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("null");
		set.add("null");
		set.add("null");
        
		System.out.println(set.toString());
		
   }
}

