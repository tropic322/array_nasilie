
//import static org.junit.Assert.assertTrue;
//import org.junit.Test;
import ru.sfedu.array_nasilie.CustomArrayList;


/**
 *
 * @author Alexandr
 */
import junit.framework.TestCase;
//import org.junit.Assert;

public class ListTest extends TestCase {

    private final CustomArrayList test = new CustomArrayList();

    public void testGetSize() {
        System.out.println(test.size());
    }

    public void testAdd() {
        test.clear();
        test.add("a");
        System.out.println(test.size());
    }

    public void testTestAdd() {
        test.add("Hello");
        test.add("World");
        System.out.println(test.size());
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        test.add(1, "!");
        System.out.println(test.size());
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
    }

    public void testGet() {
        test.add("Hello");
        System.out.println(test.get(0));
    }

    public void testRemove() {
        test.add("Hello");
        test.add("World");
        test.add("item");
        test.add("item2");
        test.add("item3");
        test.add("item4");
        System.out.println(test.size());
        System.out.println(test.get(3));
        System.out.println(test.get(4));
        test.remove(3);
        System.out.println(test.size());
        System.out.println(test.get(3));
        System.out.println(test.get(4));
    }

    public void testClear() {
        test.add("Hello");
        System.out.println(test.size());
        test.clear();
        System.out.println(test.size());
    }

    public void testIndexOf() {
        test.add("Hello");
        test.add("World");
        test.add("Elem");
        test.add("item1");
        test.add("item2");
        test.add("item3");
        System.out.println(test.get(2));
        test.set(2, "Another value");
        System.out.println(test.get(2));
    }

    public void testSort() {
        test.add(11);
        test.add(3);
        test.add(8);
        test.add(5);
        test.add(5);
        test.add(1);
        test.add(6);
        test.add(0);
        test.add(13);
        test.add(7);
        test.add(9);
        test.add(2);
        test.add(4);
        test.print();
        test.sort();
        test.print();
    }
}
