package ac.za.cput;

import java.util.*;

public class CollectionExample {

    public void mapExample(){
        Map<Integer, String> mapObj = new HashMap();
        mapObj.put(1, "Byron");
        mapObj.put(2, "Robyn");
        mapObj.put(3, "David");
        System.out.println(mapObj);
    }

    public void listExample(){
        LinkedList <String> list = new LinkedList<>();

        list.add("Byron");
        list.add("Robyn");
        list.add("David");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void setExample(){
        Set<Integer> setObj = new HashSet<>();
        setObj.add(10);
        setObj.add(20);
        setObj.add(10);
        setObj.add(20);
        setObj.add(30);
        setObj.add(20);

        Iterator<Integer> iterator = setObj.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void treeMapExample(){
        TreeMap<Integer, String> tree = new TreeMap();
        tree.put(0, "Byron");
        tree.put(1, "Robyn");
        tree.put(2, "David");

        for(Map.Entry m:tree.entrySet()){
            System.out.println(m.getKey() + ", " + m.getValue());
        }
    }

}
