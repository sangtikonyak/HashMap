import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Sangti");
        hashMap.put(2,"Angjei");
        hashMap.put(3,"khenou");
        hashMap.put(4,"jaitok");
        System.out.println("hashMap = " + hashMap);
        System.out.println("hashMap.containsKey(2) = " + hashMap.containsKey(2));
        System.out.println("hashMap.containsValue(\"Sangti\") = " + hashMap.containsValue("Sangti"));

        System.out.println("Set view of map = " + hashMap.entrySet());

        System.out.println("key" + "\t\t" + "value");
        for (Map.Entry<Integer,String> entry: hashMap.entrySet())
        {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}
