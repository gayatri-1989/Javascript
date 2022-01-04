import java.util.ArrayList;
import java.util.Collections;

public class Array
{
    public static void main(String[] args) 
    {
        ArrayList<String> alpha=new ArrayList<String>();
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        System.out.println(alpha);
        alpha.set(0,"z");
        Collections.sort(alpha);
        System.out.println(alpha);
        alpha.remove(0);
        System.out.println(alpha);
        //alpha.clear();  //to remove all
        System.out.println(alpha);
        for(int i=0; i<alpha.size();i++)
        {
            System.out.println(alpha.get(i));
        }

        //for each loop

        for (String i : alpha)
        {
            System.out.println(i);
        }
        
        


    }
}