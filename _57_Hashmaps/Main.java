import java.util.*;  
// import _57_Hashmaps.HashMapFinal; // uncomment if HashMapFinal is in another package

class Main {
  public static void main(String[] args) {
    // Test your custom HashMapFinal
    HashMapFinal<String, String> map = new HashMapFinal<>();
    
    map.put("Mango", "King of fruits");
    map.put("Apple", "A sweet red fruit");
    map.put("Litchi", "Kunal's fav fruit");

    System.out.println("Custom HashMapFinal:");
    System.out.println(map);

    // Test your simple MapUsingHash
    MapUsingHash simpleMap = new MapUsingHash();
    simpleMap.put("Dog", "Animal");
    simpleMap.put("Car", "Vehicle");

    System.out.println("\nSimple MapUsingHash:");
    System.out.println("Dog -> " + simpleMap.get("Dog"));
    System.out.println("Car -> " + simpleMap.get("Car"));
    simpleMap.remove("Dog");
    System.out.println("Dog after removal -> " + simpleMap.get("Dog"));

    // Demo with built-in HashMap & HashSet
    hashDemo();
  }

  public static void hashDemo() {
    HashMap<String, Integer> map = new HashMap<>();

    map.put("Kunal", 89);
    map.put("Karan", 99);
    map.put("Rahul", 94);

    System.out.println("\nJava Built-in HashMap:");
    System.out.println("Karan exists? " + map.containsKey("Karan"));

    HashSet<Integer> set = new HashSet<>();
    set.add(56);
    set.add(9);
    set.add(12);
    set.add(43);
    set.add(56); // duplicate ignored
    set.add(2);

    System.out.println("Java Built-in HashSet:");
    System.out.println(set);
  }
}
