import java.util.ArrayList;
import java.util.List;

public class two_list {

    public static List[] split(List<String> list)
    {

        // Creating two empty lists
        List<String> first = new ArrayList<String>();
        List<String> second = new ArrayList<String>();

        int size = list.size();

        for (int i = 0; i < size / 2; i++)
            first.add(list.get(i));

        for (int i = size / 2; i < size; i++)
            second.add(list.get(i));

        // Returning a List of array
        return new List[] { first, second };
    }

    public static void main(String[] args)
    {

        // Creating an ArrayList of string type
        List<String> list = new ArrayList<String>();

        list.add("Greeks");
        list.add("Practice");
        list.add("Contribute");
        list.add("IDE");
        list.add("Courses");

        // Calling split method which return List of array
        List[] lists = split(list);

        // Printing specific elements of list by
        // passing arguments with in
        System.out.println(lists[0]);
        System.out.println(lists[1]);
    }
}