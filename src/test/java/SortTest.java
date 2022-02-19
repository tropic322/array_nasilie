
import org.junit.Assert;
import ru.sfedu.array_nasilie.CustomArrayList;
import ru.sfedu.array_nasilie.Sort;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
/**
 *
 * @author Alexandr
 */
public class SortTest {
    @Test
    public void testSortInt(){
        CustomArrayList a = new CustomArrayList();
        a.add(9);
        a.add(1);
        a.add(8);
        a.add(2);
        a.add(7);
        a.add(3);
        a.add(6);
        a.add(4);
        a.add(5);
        a.sort();
        
        for (int i = 0; i < a.size()-1; i++){
            Assert.assertTrue((int) a.get(i) < (int) a.get(i+1));
        }
    }
    
   
    
}
