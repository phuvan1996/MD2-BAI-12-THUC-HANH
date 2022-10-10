import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hasMap = new HashMap<>();
        hasMap.put("Smith",30);
        hasMap.put("Andersn",31);
        hasMap.put("Lewis",29);
        hasMap.put("Cook",29);
        System.out.println("display entries in Hasmap");
        System.out.println(hasMap+"\n");
        Map<String,Integer> treeMap = new TreeMap<>();
        System.out.println("display entries ascending order of key");
        System.out.println(treeMap);
        Map<String,Integer> linkedHasMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHasMap.put("smith",30);
        linkedHasMap.put("anderson",31);
        linkedHasMap.put("lewis",29);
        System.out.println("\nthe age for "+"lewis is"+linkedHasMap.get("lewis"));
    }
}