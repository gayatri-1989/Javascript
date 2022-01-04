import java.util.HashMap;

public class Hashmp
{
    public static void main(String[] args)
    {
       HashMap<String,String> hmp=new HashMap<String,String>();
       hmp.put("India","Delhi");
       hmp.put("England","London");
       hmp.put("USA","Washington");
       System.out.println(hmp);
       System.out.println(hmp.get("India"));

       for(String i:hmp.keySet())
       {
           System.out.println(i);
       }

       for(String i:hmp.values())
       {
           System.out.println(i);
       }
    }
}