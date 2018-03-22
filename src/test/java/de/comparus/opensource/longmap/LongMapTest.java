package de.comparus.opensource.longmap;

import org.junit.Assert;
import org.junit.Test;

public class LongMapTest {

    LongMap<String> longMap = new LongMapImpl<>(20);

    /**
     * Test method for {@link de.comparus.opensource.longmap.LongMapImpl#put(long, java.lang.Object)}.
     */

    @Test
    void testPutLongV() {
        longMap.put(987654322, "Eugene");
        Assert.assertTrue(longMap.size() == 1);
    }

    /**
     * Test method for {@link de.comparus.opensource.longmap.LongMapImpl#get(long)}.
     */

    @Test
    void testGetLong() {
        longMap.put(987654322, "Eugene");
        Assert.assertTrue(longMap.get(987654322).equals("Eugene"));
    }

    /**
     * Test method for {@link de.comparus.opensource.longmap.LongMapImpl#remove(long)}.
     */

    @Test
    void testRemove() {
        longMap.put(987654322, "Eugene");
        longMap.remove(987654322);
        Assert.assertTrue(longMap.size() == 0);
    }

    /**
     * Test method for {@link de.comparus.opensource.longmap.LongMapImpl#isEmpty()}.
     */

    @Test
    void testIsEmpty() {
        longMap.put(987654322, "Eugene");
        Assert.assertTrue(longMap.size() == 1);
        Assert.assertFalse(longMap.size() == 0);
    }

    /**
     * Test method for {@link de.comparus.opensource.longmap.LongMapImpl#containsKey(long)}.
     */

    @Test
    void testContainsKey() {
        longMap.put(987654322, "Eugene");
        Assert.assertTrue(longMap.containsKey(987654322));
    }

    /**
     * Test method for {@link de.comparus.opensource.longmap.LongMapImpl#containsValue(java.lang.Object)}.
     */

    @Test
    void testContainsValue() {
        longMap.put(987654322, "Eugene");
        Assert.assertTrue(longMap.containsValue("Eugene"));
    }

    /**
     * Test method for {@link de.comparus.opensource.longmap.LongMapImpl#clear()}.
     */

    @Test
    void testClear() {
        longMap.put(987654322, "Eugene");
        longMap.clear();
        Assert.assertTrue(longMap.size() == 0);
    }
}
