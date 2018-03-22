package de.comparus.opensource.longmap;

public class Main {
    public static void main(String[] args) {
        LongMap<String> longMap = new LongMapImpl<>(20);
        longMap.put(35, "Eugene");
        System.out.println(longMap.get(35));
        System.out.println(longMap.containsValue("Eugene"));
        longMap.clear();
        System.out.println(longMap.isEmpty());
    }
}
