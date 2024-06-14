import java.util.*;
import java.util.Map.*;

public class _12_TreeMap {
    public static void main(String[] args) {
        // treemap takes logn time
        TreeMap<Integer, String> tm = new TreeMap<>();
        // or
        //TreeMap<Integer, String> tm = new TreeMap<>(0,"Rakesh",1,"Nikesh",2,"Suresh",3,"Ramesh");
        tm.put(0, "Rakesh");
        tm.put(1, "Nikesh");
        tm.put(2, "Suresh");
        tm.put(3, "Ramesh");
        System.out.println(tm);

        /*
        Iterator<Map.Entry<Integer, String>> iterator = tm.entrySet().iterator();
        while(iterator.hasNext()){
            Entry<Integer, String> entry = iterator.next();
            System.out.println( entry.getValue());
        }*/

        // imp         mostly we use put and get methods

        // it makes use of a tree data structure
        // tree map is sorted in ascending order by default
        // it does not allow duplicate keys
        // it allows duplicate values
        // it is not synchronized
        // it is slow as compared to HashMap
        // it has some useful methods such as
        // firstKey() , lastKey() , headMap() , tailMap() , subMap() , floorKey() ,
        // ceilingKey()

        // tip :    Wherever you see a method in TreeMap that takes a key as an argument or method name contains key,entry u can use .getValue() to get the value 
        // firstKey()
        // it returns the first key in the map
        System.out.println();
        System.out.println("firstKey() : " + tm.firstKey());

        // lastKey()
        // it returns the last key in the map
        System.out.println();
        System.out.println("lastKey() : " + tm.lastKey());

        // imp        headMap()
        // it returns the elements that are less than the specified key
        // headMap(key, booleanValue)
        // The booleanValue parameter is optional. Its default value is false , if it
        // is true then it includes the specified key
        System.out.println();
        System.out.println("headMap(2) : " + tm.headMap(2, false));

        // imp        tailMap()
        // it returns the elements that are greater than or equal to the specified key
        // tailMap(key, booleanValue)
        // The booleanValue parameter is optional. Its default value is true. , if false
        // then it won't the specified key
        System.out.println();
        System.out.println("tailMap(2) : " + tm.tailMap(2, true));

        // get(key)
        // it returns the value associated with the specified key. Returns null if the
        // key is not found.
        System.out.println();
        System.out.println("get(2) : " + tm.get(2));

        // imp        subMap()
        // it returns the elements that are greater than or equal to the specified key
        // subMap(e1, bv1, e2, bv2)
        // The bv1 and bv2 parameter is optional. Its default value is true , if false
        // then it won't the specified key
        // default values
        // bv1 = true
        // bv2 = false
        System.out.println();
        System.out.println("subMap(1) : " + tm.subMap(1, false, 3, false));

        // floorKey()
        // it returns the greatest key among those keys that are less than the
        // specified key. If the key passed as an argument is present, it returns that
        // key.
        System.out.println();
        System.out.println("floorKey(2) : " + tm.floorKey(2));

        // ceilingKey()
        // it returns the lowest key among those keys that are greater than the
        // specified key. If the key passed as an argument is present in the map, it
        // returns that key.
        System.out.println();
        System.out.println("ceilingKey(2) : " + tm.ceilingKey(3));

        // higherKey()
        // Returns the lowest key among those keys that are greater than the specified
        // key.
        System.out.println();
        System.out.println("higherKey(2) : " + tm.higherKey(2));

        // lowerKey()
        // Returns the greatest key among all those keys that are less than the
        // specified key.
        System.out.println();
        System.out.println("lowerKey(2) : " + tm.lowerKey(2));

        // higherEntry()
        // Returns an entry associated with a key that is lowest among all those keys
        // greater than the specified key.
        System.out.println();
        System.out.println("higherEntry(2) : " + tm.higherEntry(2));

        // lowerEntry()
        // Returns an entry associated with a key that is greatest among all those keys
        // that are less than the specified key.
        System.out.println();
        System.out.println("lowerEntry(2) : " + tm.lowerEntry(2));

        // ceilingEntry()
        // Returns an entry associated with a key that is lowest among those keys that
        // are greater than the specified key. It an entry associated with the key
        // passed an argument is present in the map, it returns the entry associated
        // with that key.
        System.out.println();
        System.out.println("ceilingEntry(2) : " + tm.ceilingEntry(2).getValue());

        // floorEntry()
        // Returns an entry associated with a key that is greatest among those keys
        // that are less than the specified key. If the key passed as argument is
        // present, it returns that key.
        System.out.println();
        System.out.println("floorEntry(2) : " + tm.floorEntry(2));

        // pollFirstEntry()
        // returns and removes the entry associated with the first key of the map
        System.out.println();
        System.out.println("pollFirstEntry() : " + tm.pollFirstEntry());

        // pollLastEntry()
        // returns and removes the entry associated with the last key of the map
        System.out.println();
        System.out.println("pollLastEntry() : " + tm.pollLastEntry());

        // remove(key)
        // returns and removes the entry associated with the specified key from a
        // TreeMap
        System.out.println();
        System.out.println("remove(1) : " + tm.remove(1));

        // remove(key, value)
        // removes the entry from the map only if the specified key is associated with
        // the specified value and returns a boolean value
        System.out.println();
        System.out.println("remove(2, Suresh) : " + tm.remove(2, "Suresh"));

        // replace(key, value)
        // replaces the value mapped by the specified key with the new value
        System.out.println();
        StringBuilder result = new StringBuilder();
        tm.forEach((k, v) -> result.append(v).append("Kumar"));
        System.out.println("replaceAll(function) : " + result.toString());

        // firstEntry()
        // returns the key/value mapping of the first key of the map
        System.out.println();
        System.out.println("firstEntry() : " + tm.firstEntry());

        // lastEntry()
        // returns the key/value mapping of the last key of the map
        System.out.println();
        System.out.println("lastEntry() : " + tm.lastEntry());

        // clone()
        // it returns a shallow copy of the TreeMap instance
        System.out.println();
        System.out.println("clone() : " + tm.clone());

        // containsKey(key)
        // it returns true if the map contains the specified key
        System.out.println();
        System.out.println("containsKey(2) : " + tm.containsKey(2));

        // containsValue(value)
        // it returns true if the map contains the specified value
        System.out.println();
        System.out.println("containsValue(Ramesh) : " + tm.containsValue("Ramesh"));

        // entrySet()
        // it returns a set view of the mappings contained in the map
        System.out.println();
        System.out.println("entrySet() : " + tm.entrySet());

        // getOrDefault(key, defaultValue)
        // it returns the value associated with the specified key. Returns the specified
        // default value if the key is not found.
        System.out.println();
        System.out.println("getOrDefault(2, Suresh) : " + tm.getOrDefault(2, "Suresh"));

        // isEmpty()
        // it returns true if the map is empty
        System.out.println();
        System.out.println("isEmpty() : " + tm.isEmpty());

        // keySet()
        // it returns a set view of the keys contained in the map
        System.out.println();
        System.out.println("keySet() : " + tm.keySet());

        // put(key, value)
        // inserts the specified key/value mapping (entry) to the map
        System.out.println();
        System.out.println("put(4, Rakesh) : " + tm.put(4, "Rakesh"));

        // putAll(map)
        // inserts all the entries from specified map to this map
        System.out.println();
        tm.putAll(tm);
        System.out.println("putAll(map) : " + tm);

        // putIfAbsent(key, value)
        // inserts the specified key/value mapping to the map if the specified key is
        // not present in the map
        System.out.println();
        System.out.println("putIfAbsent(5, Rakesh) : " + tm.putIfAbsent(5, "Rakesh"));

        // remove(key)
        // returns and removes the entry associated with the specified key from a
        // TreeMap
        System.out.println();
        System.out.println("remove(5) : " + tm.remove(5));

        // remove(key, value)
        // removes the entry from the map only if the specified key is associated with
        // the specified value and returns a boolean value
        System.out.println();
        System.out.println("remove(4, Rakesh) : " + tm.remove(4, "Rakesh"));

        // replace(key, value)
        // replaces the value mapped by the specified key with the new value
        System.out.println();
        System.out.println("replace(3, Ramesh) : " + tm.replace(3, "Ramesh"));

        // replace(key, old, new)
        // replaces the old value with the new value only if the old value is already
        // associated with the specified key
        System.out.println();
        System.out.println("replace(3, Ramesh, Rakesh) : " + tm.replace(3, "Ramesh", "Rakesh"));

        // replaceAll(function)
        // replaces each value of the map with the result of the specified function
        System.out.println();
        tm.replaceAll((k, v) -> v + "Kumar");
        System.out.println("replaceAll(function) : " + tm);

        // size()
        // it returns the number of key/value mappings in the map
        System.out.println();
        System.out.println("size() : " + tm.size());

        // values()
        // it returns a collection view of the values contained in the map
        System.out.println();
        System.out.println("values() : " + tm.values());

        // clear()
        // it removes all the key/value mappings from the map
        System.out.println();
        //tm.clear();

        TreeMap<Integer, String> ts = new TreeMap<>();
        ts.put(1, "Rakesh");
        ts.put(2, "Nikesh");
        ts.put(3, "Suresh");
        ts.put(4, "Ramesh");

        Entry<Integer, String> entry = ts.firstEntry();
        System.out.println("entry"); //   _-> key                 _-> value
        System.out.println(entry.getKey() + " " + entry.getValue());
        //                          
        System.out.println(ts);
    }
}
