package HashMap;

import java.util.HashMap;

public class Iterative {
    private static void printMap(HashMap<String, Integer> map){
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" -> "+val);
        }
        System.out.println();
    }
    private static void printMapValues(HashMap<String, Integer> map){
        for(int key : map.values()){
            System.out.println(key);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",1); map.put("b",2);
        map.put("c",3); map.put("d",4);
        map.put("e",5); map.put("f",6);
        System.out.println(map);
        printMap(map);
        printMapValues(map);
    }
}
