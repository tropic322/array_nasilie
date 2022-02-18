
import ru.sfedu.array_nasilie.CustomArrayList;
import ru.sfedu.array_nasilie.Sort;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        
        CustomArrayList aa = new CustomArrayList();
        aa.add(1);
        aa.add(2);
        aa.add(3);
        aa.add(4);
        aa.add(5);
        aa.add(6);
        aa.add(7);
        aa.add(8);
        aa.add(9);
        assertTrue(a.equals(aa));
    }
    
   
    
}
