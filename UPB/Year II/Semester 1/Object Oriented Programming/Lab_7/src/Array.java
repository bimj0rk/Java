//1
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.*;


public class Array{
    ArrayList<Object> list = new ArrayList<>();

    public void removeAll(Object a){
        for(Object search : list){
            if(search == a) list.remove(a);
        }
    }

    @Test
    public void Test(){
        Object a = new Object();
        Object b = new Object();
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(a);
        list1.add(a);
        list1.add(b);
        ArrayList<Object> list2 = new ArrayList<>();
        list2 = list1.removeAll(a);
        Array aTest = new Array();
        assertArrayEquals(list1, list2);
    }
}
