import java.util.LinkedList;

public class Linked
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> intList=new LinkedList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(2);
        intList.add(4);
        intList.addFirst(10);
        intList.addLast(20);
        System.out.println(intList);

        for(Integer i : intList)
        {
            System.out.println(i);
        }

    }
}