
public class _11_TreeMap_Theory {
    public static void main(String[] args) {
        // syntax
        //TreeMap<Key, Value> numbers = new TreeMap<>();
        /* 
        o    Key     - a unique identifier used to associate each element in a map
        o    Value   - elements associated by keys in a map
        
         */

        /* ->      Insert Elements to TreeMap
        put()               - inserts the specified key/value mapping (entry) to the map
        putAll()            - inserts all the entries from specified map to this map
        putIfAbsent()       - inserts the specified key/value mapping to the map if the specified key is not present in the map
         */

        /* ->       Access TreeMap Elements
        1. Using entrySet(), keySet() and values()
        
        entrySet()      - returns a set of all the key/values mapping (entry) of a treemap
        keySet()        - returns a set of all the keys of a tree map
        values()        - returns a set of all the maps of a tree map
        
        
        2. Using get() and getOrDefault()
        
        get()           - Returns the value associated with the specified key. 
                            Returns null if the key is not found.
        
        getOrDefault()  - Returns the value associated with the specified key. 
                            Returns the specified default value if the key is not found.
         */

        /* imp           Remove TeeMap Elements
        remove(key)             - returns and removes the entry associated with the specified key from a TreeMap
        remove(key, value)      - removes the entry from the map only if the specified key is associated with the specified value 
                                    and returns a boolean value
         */

        /* imp           Replace TreeMap Elements
        replace(key, value)          - replaces the value mapped by the specified key with the new value
        replace(key, old, new)       - replaces the old value with the new value only if the old value is already associated with the specified key
        replaceAll(function)         - replaces each value of the map with the result of the specified function
         */

        /* 
        Methods for Navigation
        Since the TreeMap class implements NavigableMap, it provides various methods to navigate over the elements of the treemap.
        
        1. First and Last Methods
        
        firstKey()          - returns the first key of the map
        firstEntry()        - returns the key/value mapping of the first key of the map
        lastKey()           - returns the last key of the map
        lastEntry()         - returns the key/value mapping of the last key of the map
        
        
        2. Ceiling, Floor, Higher and Lower Methods
        higherKey()         - Returns the lowest key among those keys that are greater than the specified key.
        
        higherEntry()       - Returns an entry associated with a key that is lowest among all those keys greater than the specified key.
        
        lowerKey()          - Returns the greatest key among all those keys that are less than the specified key.
        
        lowerEntry()        - Returns an entry associated with a key that is greatest among all those keys that are less than the specified key.
        
        ceilingKey()        - Returns the lowest key among those keys that are greater than the specified key. 
                                        If the key passed as an argument is present in the map, it returns that key.
        
        ceilingEntry()      - Returns an entry associated with a key that is lowest among those keys that are greater than the specified key. 
                                        It an entry associated with the key passed an argument is present in the map, it returns the entry associated with that key.
        
        floorKey()          - Returns the greatest key among those keys that are less than the specified key. 
                                        If the key passed as an argument is present, it returns that key.
        
        floorEntry()        - Returns an entry associated with a key that is greatest among those keys that are less than the specified key. 
                                        If the key passed as argument is present, it returns that key.
        
        
        
        3. Poll Methods
        3. pollFirstEntry() and pollLastEntry() Methods
        
        pollFirstEntry()    - returns and removes the entry associated with the first key of the map
        pollLastEntry()     - returns and removes the entry associated with the last key of the map
        
        
        4. Navigable Submap Methods , 4. headMap(), tailMap() and subMap() Methods
        headMap(), tailMap() and subMap() Methods
        // ->       headMap(key, booleanValue)
        
        The headMap() method returns all the key/value pairs of a treemap before the specified key (which is passed as an argument).
        The booleanValue parameter is optional. Its default value is false.
        If true is passed as a booleanValue, the method also includes the key/value pair of the key which is passed as an argument.
        
        // ->       tailMap(key, booleanValue)
        The tailMap() method returns all the key/value pairs of a treemap starting from the specified key (which is passed as an argument).
        The booleanValue is an optional parameter. Its default value is true.
        If false is passed as a booleanValue, the method doesn't include the key/value pair of the specified key.
        
        
        // ->       subMap(k1, bV1, k2, bV2)
        The subMap() method returns all the entries associated with keys between k1 and k2 including the entry of k1.
        The bV1 and bV2 are optional boolean parameters. The default value of bV1 is true and the default value of bV2 is false.
        If false is passed as bV1, the method returns all the entries associated with keys between k1 and k2 without including the entry of k1.
        If true is passed as bV2, the method returns all the entries associated with keys between k1 and k2 including the entry of k2.
        
        
        Other Methods of TreeMap
        Method	             |                   Description
        clone()              |   	Creates a copy of the TreeMap
        containsKey()	     |       Searches the TreeMap for the specified key and returns a boolean result
        containsValue()	     |       Searches the TreeMap for the specified value and returns a boolean result
        size()	             |       Returns the size of the TreeMap
        clear()	             |       Removes all the entries from the TreeMap
         */

        // imp       Sort TreeMap Elements
        // TreeMap is sorted by keys by default.
        // To sort it by values, we need to create a comparator and pass it to the constructor of the TreeMap.

        // tree map is a map implementation that provides sorted map based on the natural ordering of the keys
        // it implements the navigable map interface and extends abstract map class
        // it contains only unique elements
        // it cannot have null key but can have multiple null values
        // it is same as hash map instead maintains ascending order
        // it is not synchronized
        // it is faster than hash map

        //TreeMap<Integer, String> tm = new TreeMap<>();
        // key value pair
        //  0   "A"
    }
}
