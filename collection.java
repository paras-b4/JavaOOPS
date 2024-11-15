import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class collection 
{
    public static void main(String[] args) {
        Collection <Integer> obj=new ArrayList<>();
        obj.add(20);
        obj.add(10);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        System.out.println(obj); // we can directly fetch the values from collection 
        for(Integer con: obj)
        System.out.println(con);
        System.out.println();
        Iterator<Integer> itr= obj.iterator() ;{
            while(itr.hasNext())
            {
                System.out.print(itr.next());   
            }
        };
    }
    
}





