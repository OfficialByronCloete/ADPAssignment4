package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionExampleTest {

    @Test
    public void mapExample() {
        Map<Integer, String> mapObj = new HashMap();
        mapObj.put(1, "Byron");
        mapObj.put(2, "Robyn");
        mapObj.put(3, "David");

        Assert.assertEquals("{1=Byron, 2=Robyn, 3=David}", mapObj.toString());

    }

    @Test
    public void listExample() {

        LinkedList<String> list = new LinkedList<>();

        list.add("Byron");
        list.add("Robyn");
        list.add("David");

        Assert.assertEquals("[Byron, Robyn, David]", list.toString());

    }

    @Test
    public void treeMapExample() {

        TreeMap<Integer, String> tree = new TreeMap();
        tree.put(0, "Byron");
        tree.put(1, "Robyn");
        tree.put(2, "David");

        Assert.assertEquals("{0=Byron, 1=Robyn, 2=David}", tree.toString());



    }

    @Test
    public void setExample() {

        Set<Integer> setObj = new HashSet<>();
        setObj.add(10);
        setObj.add(20);
        setObj.add(10);
        setObj.add(20);
        setObj.add(30);
        setObj.add(20);

        Assert.assertEquals("[20, 10, 30]", setObj.toString());

    }
}