package democollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * package java.util
 * List 
 * 
 * 
 */

public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        //demo01.demoList();
        //demo01.demoMap();
        demo01.demoSet();
    }

    private void demoSet() {
        // TODO Auto-generated method stub
        Set<String> names = new HashSet<>();
        names.add("n1");
        names.add("n1");
        names.add("n1");
        for (String name : names) {
            System.out.println(name);
        }
    }

    private void demoMap() {
        // TODO Auto-generated method stub
        Map<String, Integer> names = new HashMap<>();
        names.put("n1", 20);
        names.put("n2", 30);
        names.put("n2", 60);
        names.put("n0", 20);
        names.containsKey("XXX");
        Set<String> keys = names.keySet();
        for (String key : keys) {
            System.out.println(key + " = " + names.get(key));
        }
        
    }

    private void demoList() {
        // TODO Auto-generated method stub
        System.out.println("Call demoList");
        // Geneic
       // ArrayList<String> names = new ArrayList<String>(); //Java 1.5 - 1.7
        List<String> names = new ArrayList<>(); //Java 1.8 - Later
        
        names.add("Name1");
        names.add("Name2");
        
        //for(Iterator<String> i = Iterator names.iterator(); )
        
        for (String name : names) {
            System.out.println(name);
        }
        
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
        
        
    }
}
